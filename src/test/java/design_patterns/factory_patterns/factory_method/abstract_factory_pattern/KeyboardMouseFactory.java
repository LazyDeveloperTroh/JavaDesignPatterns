package design_patterns.factory_patterns.factory_method.abstract_factory_pattern;

public interface KeyboardMouseFactory {
    Keyboard createKeyboard();

    Mouse createMouse();
}
