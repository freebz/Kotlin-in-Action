// 리스트 10.2  프로퍼티 필터링을 포함하는 객체 직렬화

private fun StringBuilder.serializeObject(obj: Any) {
   obj.javaClass.kotlin.memberProperties
      .filter { it.findAnnotation<JsonExclude>() == null }
      .joinToStringBuilder(this, prefix = "{", postfix = "}") {
	 serializeProperty(it, obj)
   }
}
