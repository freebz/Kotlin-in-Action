// 리스트 11.27  안코를 사용해 안드로이드 경고 창 표시하기

fun Activity.showAreYouSureAlert(process: () -> Unit) {
   alert(title = "Are you sure?",
	 message = "Are you really sure?") {
      positiveButton("Yes") { process() }
      negativeButton("No") { cancel() }
   }
}
