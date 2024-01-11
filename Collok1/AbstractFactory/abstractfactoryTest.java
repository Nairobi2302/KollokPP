package abstractfactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class abstractfactoryTest {

    @Test
    public void testWindowsFactory() {
        GUIFactory factory = new WindowsFactory();
        button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        assertNotNull(button);
        assertTrue(button instanceof windowsButton);
        assertNotNull(checkbox);
        assertTrue(checkbox instanceof WindowsCheckbox);
    }

    @Test
    public void testMacFactory() {
        GUIFactory factory = new MacFactory();
        button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        assertNotNull(button);
        assertTrue(button instanceof MacButton);
        assertNotNull(checkbox);
        assertTrue(checkbox instanceof MacCheckbox);
    }
}
