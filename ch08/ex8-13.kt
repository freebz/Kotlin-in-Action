// 리스트 8.13  인라인 함수 정의하기

inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
	return action()
    }
    finally {
	lock.unlock()
    }
}

val l = Lock()
synchronized(l) {
    // ...
}
