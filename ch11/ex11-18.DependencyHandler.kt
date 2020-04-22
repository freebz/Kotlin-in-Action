// 리스트 11.18  유연한 DSL 문법을 제공하기 위해 invoke 사용하기

class DependencyHandler {

   fun compile(coordinate: String) {
      println("Added dependency on $coordinate")
   }

   operator fun invoke(
         body: DependencyHandler.() -> Unit) {
      body()
   }

}

val dependencies = DependencyHandler()

dependencies.compile("org.jetbrains.kotlin:kotlin-stdlib:1.0.0")
// Added dependency on org.jetbrains.kotlin:kotlin-stdlib:1.0.0

dependencies {
   compile("org.jetbrains.kotlin:kotlin-reflect:1.0.0")
}
// Added dependency on org.jetbrains.kotlin:kotlin-reflect:1.0.0
