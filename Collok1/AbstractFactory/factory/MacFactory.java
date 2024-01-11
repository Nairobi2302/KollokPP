package abstractfactory;

//Конкретная реализация абстрактной фабрики для Mac
public class MacFactory implements GUIFactory {
	@Override
	public button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
}
