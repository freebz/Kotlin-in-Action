// 리스트 9.18  입력 검증을 위한 인터페이스

interface FieldValidator<in T> {
    fun validate(input: T): Boolean
}

object DefaultStringValidator : FieldValidator<String> {
    override fun validate(input: String) = input.isNotEmpty()
}

object DefaultIntValidator : FieldValidator<Int> {
    override fun validate(input: Int) = input >= 0
}


import kotlin.reflect.KClass

val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
validators[String::class] = DefaultStringValidator
validators[Int::class] = DefaultIntValidator


validators[String::class]!!.validate("")
// Error: out-projected type 'Line_3.FieldValidator<*>' prohibits
// the use of 'fun validate(input: T): Boolean'
