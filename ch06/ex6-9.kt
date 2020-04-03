// 리스트 6.9  let을 사용해 null이 아닌 인자로 함수 호출하기

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

var email: String? = "yole@example.com"
email?.let { sendEmailTo(it) }
// Sending email to yole@example.com
email = null
email?.let { sendEmailTo(it) }
