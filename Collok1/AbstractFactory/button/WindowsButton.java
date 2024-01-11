package abstractfactory;

//Конкретная реализация интерфейса Button
public class windowsButton implements button {
	@Override
	public void render() {
		System.out.println("Отображается кнопка Windows");
	}
}
