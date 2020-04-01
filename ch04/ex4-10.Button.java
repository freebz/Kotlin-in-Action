// 리스트 4.10  자바에서 내부 클래스를 사용해 View 구현하기

/* 자바 */
public class Button implements View {
    @Override
    public State getCurrentState() {
	return new ButtonState();
    }
    
    @Override
    public void restoreState(State state) { /*...*/ }

    public class ButtonState implements State { /*...*/ }

}
