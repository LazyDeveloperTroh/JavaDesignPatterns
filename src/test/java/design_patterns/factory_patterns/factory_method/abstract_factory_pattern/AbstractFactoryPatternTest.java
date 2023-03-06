package design_patterns.factory_patterns.factory_method.abstract_factory_pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractFactoryPatternTest {

    @Test
    public void keyboardMouseFactoryTest() {
        // 서울 공장
        KeyboardMouseFactory seoulFactory = new SeoulKeyboardMouseFactory();
        Keyboard keyboard1 = seoulFactory.createKeyboard();
        Mouse mouse1 = seoulFactory.createMouse();

        assertEquals(keyboard1.getClass(), SamsungKeyboard.class);
        assertEquals(mouse1.getClass(), SamsungMouse.class);

        // 미국 공장
        KeyboardMouseFactory USAFactory = new USAKeyboardMouseFactory();
        Keyboard keyboard2 = USAFactory.createKeyboard();
        Mouse mouse2 = USAFactory.createMouse();

        assertEquals(keyboard2.getClass(), DellKeyboard.class);
        assertEquals(mouse2.getClass(), DellMouse.class);
    }
}
