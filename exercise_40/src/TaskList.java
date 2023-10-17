import java.util.ArrayList;

public class TaskList {
    ArrayList<String> taskList;

    public TaskList () {
        this.taskList = new ArrayList<>();
    }

    public void add (String task) {
        this.taskList.add(task);
    }

    public void print () {
        for (int i = 0; i < this.taskList.size(); i++) {
            System.out.println((i + 1) + ": " + this.taskList.get(i));
        }
    }

    public void remove (int number) {
        for (int i = 0; i < this.taskList.size(); i++) {
            if ((i + 1) == number) {
                this.taskList.remove(i);
            }
        }
    }

 }
