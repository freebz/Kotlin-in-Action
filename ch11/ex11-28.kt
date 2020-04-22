// 리스트 11.28  alert API 선언

fun Context.alert(
   message: String,
   title: String,
   init: AlertDialogBuilder.() -> Unit
)

class AlertDialogBuilder {
   fun positiveButton(text: String, callback: DialogInterface.() -> Unit)
   fun negativeButton(text: String, callback: DialogInterface.() -> Unit)
   // ...
}
