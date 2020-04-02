// 리스트 5.8  람다 파라미터 타입 제거하기

people.maxBy { p: Person -> p.age }
people.maxBy { p -> p.age }
