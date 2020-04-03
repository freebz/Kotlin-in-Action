// 리스트 6.15  널 가능성 애노테이션이 없는 자바 클래스

/* 자바 */
public class Person {

    private final String name;

    public Person(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

}
