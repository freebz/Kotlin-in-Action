// 리스트 11.25  익스포즈드에서 테이블 선언하기

object Country : Table() {
   val id = integer("id").autoIncrement().primaryKey()
   val name = varchar("name", 50)
}
