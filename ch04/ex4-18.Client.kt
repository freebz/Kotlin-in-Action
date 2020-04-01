// 리스트 4.18  Client에 toString() 구현하기

class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}


val client1 = Client("오현석", 4122)
println(client1)
// Client(name=오현석, postalCode=4122)
