package StringBuilder;

public class AppendCommand implements Command {
    private String textToAppend;

    public AppendCommand(String textToAppend) {
        this.textToAppend = textToAppend;
    }

    public void execute(StringBuilder stringBuilder) {
        stringBuilder.append(textToAppend);
    }

    public void undo(StringBuilder stringBuilder) {
        stringBuilder.delete(stringBuilder.length() - textToAppend.length(), stringBuilder.length());
    }
}
