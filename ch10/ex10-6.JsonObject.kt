// 리스트 10.6  JSON 파서 콜백 인터페이스

interface JsonObject {
   fun setSimpleProperty(propertyName: String, value: Any?)
   fun createObject(propertyName: String): JsonObject
   fun createArray(propertyName: String): JsonObject
}
