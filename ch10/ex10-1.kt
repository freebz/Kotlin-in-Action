// 리스트 10.1  객체 직렬화하기

private fun StringBuilder.serializeObject(obj: Any) {

   val kClass = obj.javaClass.kotlin
   val properties = kClass.memberProperties
    
   properties.joinToStringBuilder(
        this, prefix = "{", postfix = "}") { prop ->
      serializeString(prop.name)
      append(": ")
      serializePropertyValue(prop.get(obj))
   }

}
