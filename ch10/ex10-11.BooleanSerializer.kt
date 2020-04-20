// 리스트 10.11  Boolean 값을 위한 젹렬화기

object BooleanSerializer : ValueSerializer<Boolean> {

   override fun fromJsonValue(jsonValue: Any?): Boolean {
      if (jsonValue !is Boolean) throw JKidException("Boolean expected")
      return jsonValue
   }

   override fun toJsonValue(value: Boolean) = value

}
