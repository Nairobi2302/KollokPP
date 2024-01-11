package abstractfactory;

//Конкретная реализация интерфейса Checkbox
public class WindowsCheckbox implements Checkbox {
	@Override
	public void render() {
		System.out.println("Отображается флажок Windows");
	}
}
