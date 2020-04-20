// 리스트 10.12  리플렉션 데이터 캐시 저장소

class ClassInfoCache {

   private val cacheData = mutableMapOf<KClass<*>, ClassInfo<*>>()

   @Suppress("UNCHECKED_CAST")
   operator fun <T : Any> get(cls: KClass<T>): ClassInfo<T> =
      cacheData.getOrPut(cls) { classInfo(cls) ) as ClassInfo<T>
}
