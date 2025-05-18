package rozchepiy.dev.task;

import org.springframework.stereotype.Component;
import rozchepiy.dev.aop.Loggable;

@Component
public class TaskExecute {
    private final Task task;

    public TaskExecute(Task task) {
        this.task = task;
    }

    @Loggable(value = "ERROR")
    public void executeTask() {
        System.out.printf("Executing task with name %s, total seconds %s%n", task.getName(), task.getDuration());
    }
}
