package StringBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilderWithUndo builder = new StringBuilderWithUndo();

        builder.append("Hello, ");
        System.out.println(builder.toString()); // Output: Hello,

        builder.append("world!");
        System.out.println(builder.toString()); // Output: Hello, world!

        builder.undo();
        System.out.println(builder.toString()); // Output: Hello,
    }
}

