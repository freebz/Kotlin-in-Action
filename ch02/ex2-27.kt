// 리스트 2.27  자바와 마찬가지로 try 사용하기

fun readNumber(reader: BufferedReader): Int? {
    try {
	val line = reader.readLine()
	return Integer.parseInt(line)
    }
    catch (e: NumberFormatException) {
	return null
    }
    finally {
	reader.close()
    }
}

val reader = BufferedReader(StringReader("239"))
println(readNumber(reader))
// 239
