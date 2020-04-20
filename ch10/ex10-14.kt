// 리스트 10.14  필수 파라미터가 모두 있는지 검증하기

private fun ensureAllParametersPresent(arguments: Map<KParameter, Any?>) {
   for (param in constructor.parameters) {
      if (arguments[param] == null &&
	   !param.isOptional && !param.type.isMarkedNullable) {
	 throw JKidException("Missing value for parameter ${param.name}")
      }
   }
}
