// 리스트 11.16  클래스 안에서 invoke 메소드 정의하기

class Greeter(val greeting: String) {
   operator fun invoke(name: String) {
      println("$greeting, $name!")
   }
}

val bavarianGreeter = Greeter("Servus")
bavarianGreeter("Dmitry")
// Servus, Dmitry!
