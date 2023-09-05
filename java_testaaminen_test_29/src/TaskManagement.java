import java.util.ArrayList;

public class TaskManagement {
    private ArrayList<Task> list;


    public TaskManagement () {
        this.list = new ArrayList<>();

    }

    public ArrayList<String> taskList () {
        ArrayList<String> retunedTasks = new ArrayList<>();

        for (Task t: list) {
            retunedTasks.add(t.getName());
        }

        return retunedTasks;
    }

    public void add (String task) {
        this.list.add(new Task(task));
    }

    public void markCompleted (String doneTask) {

        for (Task t: list) {
            if (t.getName().equals(doneTask)) {
                t.setDone(true);
            }
        }
    }

    public boolean isCompleted(String task) {
        for (Task t : list) {
            if (t.getName().equals(task)) {
                return t.isDone();
            }
        }
        return  false;
    }

}
