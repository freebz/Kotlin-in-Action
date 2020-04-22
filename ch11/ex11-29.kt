// 리스트 11.29  안코를 사용해 간단한 액티비티 정의하기

verticalLayout {
   val email = editText {
      hint = "Email"
   }
   val password = editText {
      hint = "Password"
      transformationMethod =
	 PasswordTransformationMethod.getInstance()
   }
   button("Log In") {
      onClick {
	 logIn(email.text, password.text)
      }
   }
}
