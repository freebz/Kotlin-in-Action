// 리스트 11.26  익스포즈드에서 두 테이블 조인(join)하기

val result = (Country join Customer)
   .select { Country.name eq "USQ" }

result.forEach { println(it[Customer.name]) }
