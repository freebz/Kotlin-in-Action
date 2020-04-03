// 리스트 6.11  나중에 초기화하는 프로퍼티 사용하기

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    
    private lateinit var myService: MyService

    @Before fun setUp() {
	myService = MyService()
    }

    @Test fun testAction() {
	Assert.assertEquals("foo",
          myService.performAction())
    }
}
