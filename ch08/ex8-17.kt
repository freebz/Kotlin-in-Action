// 리스트 8.17  use 함수를 자원 관리에 활용하기

fun readFirstLineFromFile(path: String): String {
    BufferedReader(FileReader(path)).use { br ->
        return br.readLine()
    }
}
