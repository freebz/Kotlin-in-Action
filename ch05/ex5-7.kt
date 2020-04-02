// 리스트 5.7  람다를 괄호 밖에 전달하기

people.joinToString(" ") { p: Person -> p.name }
