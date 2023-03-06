package design_patterns.factory_patterns.factory_method.abstract_factory_pattern;

public class USAKeyboardMouseFactory implements KeyboardMouseFactory{
    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
