// 리스트 10.7  JSON 데이터로부터 객체를 만들어내기 위한 인터페이스

interface Seed: JsonObject {
   fun spawn(): Any?

   fun createCompositeProperty(
      propertyName: String,
      isList: Boolean
   ): JsonObject

   override fun createObject(propertyName: String) =
      createCompositeProperty(propertyName, false)

   override fun createArray(propertyName: String) =
      createCompositeProperty(propertyName, true)

   // ...
}
