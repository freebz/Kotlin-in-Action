// 리스트 10.10  값 타입에 따라 직렬화기를 가져오기

fun serializerForType(type: Type): ValueSerializer<out Any?>? =
   when(type) {
      Byte::class.java -> ByteSerailizer
      Int::class.java -> IntSerializer
      Boolean::class.java -> BooleanSerializer
      // ...
      else -> null
   }
