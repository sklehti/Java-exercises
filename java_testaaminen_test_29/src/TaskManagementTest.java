import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TaskManagementTest {
    TaskManagement management;


    @Before
    public void initialize() {
        management  = new TaskManagement();
    }

    @Test
    public void taskManagementIsEmptyInTheBeginning () {
        assertEquals(0, management.taskList().size());
    }

    @Test
    public void taskAddingIncreaseListSizeAtOne () {
        management.add("Kirjoita testi");
        assertEquals(1, management.taskList().size());
    }

    @Test
    public void addedTaskFoundFromTasklist () {
        management.add("Kirjoita testi");
        assertTrue(management.taskList().contains("Kirjoita testi"));
    }

    @Test
    public void taskCanMarkedCompleted () {
        management.add("Uusi tehtävä");
        management.markCompleted("Uusi tehtävä");

        assertTrue(management.isCompleted("Uusi tehtävä"));
    }

    @Test
    public void markedCompletedIsNotDone () {
        management.add("Uusi tehtävä");
        management.markCompleted("Uusi tehtävä");


         assertFalse(management.isCompleted("Joku tehtävä"));
    }
}