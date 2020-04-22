// 리스트 11.17  함수 타입을 확장하면서 invoke()를 오버라이딩하기

data class Issue(
   val id: String, val project: String, val type: String,
   val priority: String, val description: String
)

class ImportantIssuePredicate(val project: String)
      : (Issue) -> Boolean {

   override fun invoke(issue: Issue): Boolean {
      return issue.project == project && issue.isImportant()
   }

   private fun Issue.isImportant(): Boolean {
      return type == "Bug" &&
         (priority == "Major" || priority == "Critical")
   }
}

val i1 = Issue("IDEA-154446", "IDEA", "Bug", "Major",
	       "Save settings failed")

val i2 = Issue("KT-12183", "Kotlin", "Feature", "Normal",
	       "Intention: convert sevral calls on the same receiver to with/apply")

val predicate = ImportantIssuePredicate("IDEA")

for (issue in listOf(i1, i2).filter(predicate)) {
   println(issue.id)
}
// IDEA-154446
