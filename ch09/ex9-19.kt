// 리스트 9.19  검증기를 가져오면서 명시적 타입 캐스팅 사용하기

val stringValidator = validators[String::class] as FieldValidator<String>

println(stringValidator.validate(""))
// false
