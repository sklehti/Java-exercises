import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList () {
        this.list = new ArrayList();
    }

    public void add (String task) {
        this.list.add(task);
    }

    public void print () {
        for (int index = 0; index < this.list.size(); index++) {
            System.out.println(index + 1 + ": " + this.list.get(index));
        }
    }

    public void removeTask (int number) {
        for (String t: this.list) {
            if (t.equals(this.list.get(number - 1))) {
                this.list.remove(number - 1);
                break;
            }
        }
    }
}
