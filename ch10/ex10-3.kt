// 리스트 10.3  프로퍼티 직렬화하기

private fun StringBuilder.serializeProperty(
   prop: KProperty<Any, *>, obj: Any
) {
   val jsonNameAnn = prop.findAnnotation<JsonName>()
   val propName = jsonNameAnn?.name ?: prop.name
   serializeString(propName)
   append(": ")
   serializePropertyValue(prop.get(obj))
}
