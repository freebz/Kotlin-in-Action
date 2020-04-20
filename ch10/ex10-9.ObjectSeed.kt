// 리스트 10.9  객체 역직렬화하기

class ObjectSeed<out T: Any>(
   targetClass: KClass<T>,
   val classInfoCache: ClassInfoCache
) : Seed {

   private val classInfo: ClassInfo<T> =
      classInfoCache[targetClass]

   private val valueArguments = mutableMapOf<KParameter, Any?>()
   private val seedArguments = mutableMapOf<KParameter, Seed>()

   private val arguments: Map<KParameter, Any?>
      get() = valueArguments +
             seedArguments.mapValues { it.value.spawn() }

   override fun setSimpleProperty(propertyName: String, value: Any?) {
      val param = classInfo.getConstructorParameter(propertyName)
      valueArguments[param] =
	 classInfo.deserializeConstructorArgument(param, value)
   }
   
   override fun createCompositeProperty(
        propertyName: String, isList: Boolean
   ): Seed {
      val param = classInfo.getConstructorParameter(propertyName)
      val deserializeAs =
	 classInfo.getDeserializeClass(propertyName)
      val seed = createSeedForType(
	 deserializeAs ?: param.type.javaType, isList)
      
      return seed.apply { seedArguments[param] = this }
   }
   
   override fun spawn(): T =
      classInfo.createInstance(arguments)
}
