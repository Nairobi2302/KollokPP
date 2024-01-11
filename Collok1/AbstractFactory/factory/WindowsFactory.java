package abstractfactory;

//Конкретная реализация абстрактной фабрики для Windows
public class WindowsFactory implements GUIFactory {
	@Override
	public button createButton() {
		return new windowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}
