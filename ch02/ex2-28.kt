// 리스트 2.28  try를 식으로 사용하기

fun readNumber(reader: BufferedReader) {
    val number = try {
	Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
	return
    }
    println(number)
}

val reader = BufferedReader(StringReader("not a number"))
readNumber(reader)
