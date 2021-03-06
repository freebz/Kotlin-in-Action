// 리스트 5.15  SAM 생성자를 사용해 listener 인스턴스 재사용하기

val listener = OnClickListener { view ->
    val text = when (view.id) {
	R.id.button1 -> "First button"
	R.id.button2 -> "Second button"
	else -> "Unknown button"
    }
    toast(text)
}

button1.setOnClickListener(listener)
button2.setOnClickListener(listener)
