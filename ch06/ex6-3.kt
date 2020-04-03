// 리스트 6.3  안전한 호출 연쇄시키기

class Address(val streetAddress: String, val zipCode: Int,
	      val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName() : String {
    val country = this.company?.address?.country
    return if (country != null) country else "Unknown"
}

val person = Person("Dmitry", null)
println(person.countryName())
// Unknown
