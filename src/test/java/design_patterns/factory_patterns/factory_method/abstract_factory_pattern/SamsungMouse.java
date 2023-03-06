package design_patterns.factory_patterns.factory_method.abstract_factory_pattern;

public class SamsungMouse implements Mouse{
    @Override
    public void clickLeft() {
        System.out.println("삼성 마우스 왼쪽 클릭");
    }

    @Override
    public void clickRight() {
        System.out.println("델 마우스 오른쪽 클릭");
    }
}
