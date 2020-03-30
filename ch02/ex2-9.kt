// 리스트  2.9  다를 패키지에 있는 함수 임포트하기

package geometry.example

import geometry.shapes.createRandomRectangle

fun main(args: Array<String>) {
    println(createRandomRectangle().isSquare)
}
