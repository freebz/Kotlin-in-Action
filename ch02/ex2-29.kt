// 리스트 2.29  catch에서 값 반환하기

fun readNumber(reader: BufferedReader) {
    val number = try {
	Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
	null
    }
    println(number)
}

val reader = BufferedReader(StringReader("not a number"))
readNumber(reader)
// null
