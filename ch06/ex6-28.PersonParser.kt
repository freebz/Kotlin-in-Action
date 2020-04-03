// 리스트 6.28  DataParser의 코틀린 구현

class PersonParser : DataParser<Person> {
    override fun parseData(input: String,
      output: MutableList<Person>
      errors: MutableList<String?>) {
	// ...
    }
}
