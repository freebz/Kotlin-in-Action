// 리스트 5.14  SAM 생성자를 사용해 값 반환하기

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}

createAllDoneRunnable().run()
// All done!
