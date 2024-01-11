package abstractfactory;

public class absfactory {
    public static void main(String[] args) {
        // Используем абстрактную фабрику для создания элементов пользовательского интерфейса для Windows
        GUIFactory windowsFactory = new WindowsFactory();
        button windowsButton = windowsFactory.createButton();
        Checkbox windowsCheckbox = windowsFactory.createCheckbox();

        // Отображаем элементы пользовательского интерфейса для Windows
        windowsButton.render();
        windowsCheckbox.render();

        // Используем абстрактную фабрику для создания элементов пользовательского интерфейса для Mac
        GUIFactory macFactory = new MacFactory();
        button macButton = macFactory.createButton();
        Checkbox macCheckbox = macFactory.createCheckbox();

        // Отображаем элементы пользовательского интерфейса для Mac
        macButton.render();
        macCheckbox.render();
    }
}
