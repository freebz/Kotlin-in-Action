// 리스트 6.21  널이 될 수 있는 값으로 이뤄진 컬렉션 만들기

fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()) {
	try {
	    val number = line.toInt()
	    result.add(number)
	}
	catch(e: NumberFormatException) {
	    result.add(null)
	}
    }
    return result
}
