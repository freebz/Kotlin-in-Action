// 리스트 5.20  apply들 TextView 초기화에서 사용하기

fun createViewWithCustomAttributes(context: Context) =
    TextView(context).apply {
	text = "Sample Text"
	textSize = 20.0
	setPadding(10, 0, 0, 0)
    }
