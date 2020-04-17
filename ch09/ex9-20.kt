// 리스트 9.20  검증기를 잘못 가져온 경우

val stringValidator = validators[Int::class] as FieldValidator<String>

stringValidator.validate("")
// java.lang.ClassCastException:
//    java.lang.String cannot be cast to java.lang.Number
//    at Line_13$DefaultIntValidator.validate
