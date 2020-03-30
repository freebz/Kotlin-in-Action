// 리스트 2.14  enum 상수 값을 임포트해서 enum 클래스 수식자 없이 enum 사용하기

import ch02.colors.Color
import ch02.colors.Color.*

fun getWarmth(color: Color) = when(color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}
