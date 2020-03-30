// 리스트 2.8  클래스와 함수 선언을 패키지에 넣기

package geometry.shapes

import java.util.Random

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
	get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random();
    return Rectangle(random.nextInt(), random.nextInt())
}
