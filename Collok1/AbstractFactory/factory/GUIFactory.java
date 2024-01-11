package abstractfactory;

//Интерфейс абстрактной фабрики
public interface GUIFactory {
	button createButton();
	Checkbox createCheckbox();
}
