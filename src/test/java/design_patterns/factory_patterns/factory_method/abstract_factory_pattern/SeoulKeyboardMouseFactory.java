package design_patterns.factory_patterns.factory_method.abstract_factory_pattern;

public class SeoulKeyboardMouseFactory implements KeyboardMouseFactory{
    @Override
    public Keyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new SamsungMouse();
    }
}
