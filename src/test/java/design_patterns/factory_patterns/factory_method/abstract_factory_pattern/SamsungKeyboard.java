package design_patterns.factory_patterns.factory_method.abstract_factory_pattern;

public class SamsungKeyboard implements Keyboard{
    @Override
    public void keyDown() {
        System.out.println("삼성 키보드 버튼이 눌림");
    }

    @Override
    public void keyUp() {
        System.out.println("삼성 키보드 버튼이 떼임");
    }
}
