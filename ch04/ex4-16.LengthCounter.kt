// 리스트 4.16  비공개 세터가 있는 프로퍼티 선언하기

class LengthCounter {
    
    var counter: Int = 0
        private set

    fun addWord(word: String) {
	counter += word.length
    }
}


val lengthCounter = LengthCounter()
lengthCounter.addWord("Hi!")
println(lengthCounter.counter)
// 3
