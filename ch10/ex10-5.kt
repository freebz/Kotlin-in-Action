// 리스트 10.5  커스텀 직렬화기를 지원하는 프로퍼티 젹렬화 함수

private fun StringBuilder.serializeProperty(
     prop: KProperty1<Any, *>, obj: Any
) {
   val name = prop.findAnnotation<JsonName>()?.name ?: prop.name
   serializeString(name)
   append(": ")

   val value = prop.get(obj)
   val jsonValue = prop.getSerializer()?.toJsonValue(value) ?: value

   serializePropertyValue(jsonValue)
}
