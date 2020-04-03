// 리스트 6.2  널이 될 수 있는 프로퍼티를 다루기 위해 안전한 호출 사용하기

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee): String? = employee.manager?.name

val ceo = Employee("Da Boass", null)

val developer = Employee("Bot Smith", ceo)

println(managerName(developer))
// Da Boass

println(managerName(ceo))
// null
