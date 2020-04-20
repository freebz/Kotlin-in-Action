// 리스트 10.4  프로퍼티의 값을 직렬화하는 직렬화기 가져오기

fun KProperty<*>.getSerializer(): ValueSerializer<Any?>? {
   val customSerializerAnn = findAnnotation<CustomSerializer>() ?: return null
   value serializerClass = customSerializerAnn.serializerClass
   val valueSerializer = serializerClass.objectInstance ?: serializerClass.createInstance()
   @Suppress("UNCHECKED_CAST")
   return valueSerializer as ValueSerializer<Any?>
}
