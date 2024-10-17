import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task(TaskPriority.LOW);
        Task task2 = new Task(TaskPriority.MEDIUM);
        Task task3 = new Task(TaskPriority.HIGH);

        TaskHandler lowHandler = new LowPriorityHandler();
        TaskHandler mediumHandler = new MediumPriorityHandler();
        TaskHandler highHandler = new HighPriorityHandler();

        lowHandler.setNextHandler(mediumHandler);
        mediumHandler.setNextHandler(highHandler);

        TaskMediator mediator = new TaskMediator(lowHandler);

        Command createCommand = new CreateTaskCommand(task1);
        Command deleteCommand = new DeleteTaskCommand(task2);

        mediator.executeCommand(createCommand);
        mediator.executeCommand(deleteCommand);

        mediator.handleTask(task1);
        mediator.handleTask(task2);
        mediator.handleTask(task3);

        List<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);

        TaskIterator taskIterator = new TaskIterator(taskList);
        while (taskIterator.hasNext()) {
            Task currentTask = taskIterator.next();
            System.out.println("Iterating task with priority: " + currentTask.getPriority());
        }
    }
}
