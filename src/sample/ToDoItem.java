package sample;

/**
 * Created by alhanger on 10/20/15.
 */
public class ToDoItem {
    String text;
    boolean isDone;

    public ToDoItem(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        String done = "";
        if (isDone) {
            done = "(Done)";
        }
        return String.format("%s %s", text, done);
    }
}
