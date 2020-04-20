// 리스트 10.8  최상위 역직렬화 함수

fun <T: Any> deserialize(json: Reader, targetClass: KClass<T>): T {
   val seed = ObjectSeed(targetClass, ClassInfoCache())
   Parser(json, seed).parse()
   return seed.spawn()
}
