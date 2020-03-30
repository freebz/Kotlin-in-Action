// 리스트 2.17  식을 표현하는 클래스 계층

interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr
