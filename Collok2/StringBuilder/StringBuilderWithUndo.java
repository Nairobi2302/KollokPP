package StringBuilder;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderWithUndo {
    private StringBuilder stringBuilder = new StringBuilder();
    private List<Command> commandHistory = new ArrayList<>();

    public void append(String text) {
        // Создаем команду и выполняем ее
        Command command = new AppendCommand(text);
        command.execute(stringBuilder);

        // Добавляем команду в историю
        commandHistory.add(command);
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            // Получаем последнюю выполненную команду и отменяем ее
            Command lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.undo(stringBuilder);
        }
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
