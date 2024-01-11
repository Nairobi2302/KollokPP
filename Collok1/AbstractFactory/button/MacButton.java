package abstractfactory;

//Другая конкретная реализация интерфейса Button
public class MacButton implements button {
	@Override
	public void render() {
		System.out.println("Отображается кнопка Mac");
	}
}
