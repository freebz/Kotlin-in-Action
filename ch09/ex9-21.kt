// 리스트 9.21  검증기 컬렉션에 대한 접근 캡슐화하기

object Validators {
    private val validators =
	mutableMapOf<KClass<*>, FieldValidator<*>>()
    
    fun <T: Any> registerValidator(
	    kClass: KClass<T>, fieldValidator: FieldValidator<T>) {
	validators[kClass] = fieldValidator
    }

    @Suppress("UNCHECKED_CAST")
    operator fun <T: Any> get(kClass: KClass<T>): FieldValidator<T> =
	validators[kClass] as? FieldValidator<T>
            ?: throw IllegalArgumentException(
	      "No validator for ${kClass.simpleName}")
}

Validators.registerValidator(String::class, DefaultStringValidator)
Validators.registerValidator(Int::class, DefaultIntValidator)

println(Validators[String::class].validate("Kotlin"))
// true
println(Validators[Int::class].validate(42))
// true
