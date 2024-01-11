package StringBuilder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringBuilderWithUndoTest {

    @Test
    public void testAppendAndUndo() {
        StringBuilderWithUndo builder = new StringBuilderWithUndo();

        builder.append("Hello, ");
        assertEquals("Hello, ", builder.toString());

        builder.append("world!");
        assertEquals("Hello, world!", builder.toString());

        builder.undo();
        assertEquals("Hello, ", builder.toString());
    }

    @Test
    public void testMultipleUndo() {
        StringBuilderWithUndo builder = new StringBuilderWithUndo();

        builder.append("Hello, ");
        assertEquals("Hello, ", builder.toString());

        builder.append("world!");
        assertEquals("Hello, world!", builder.toString());

        builder.undo();
        assertEquals("Hello, ", builder.toString());

        builder.undo();
        assertEquals("", builder.toString()); // Все операции отменены, должно быть пусто
    }
}
