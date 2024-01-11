package StringBuilder;

//Command interface
public interface Command {
 void execute(StringBuilder stringBuilder);

 void undo(StringBuilder stringBuilder);
}
