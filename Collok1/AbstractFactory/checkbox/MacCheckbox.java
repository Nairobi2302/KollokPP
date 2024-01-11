package abstractfactory;

//Другая конкретная реализация интерфейса Checkbox
public class MacCheckbox implements Checkbox {
	@Override
	public void render() {
		System.out.println("Отображается флажок Mac");
	}
}
