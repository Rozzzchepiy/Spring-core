package rozchepiy.dev;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TaskExecute {
    private final Task task;

    public TaskExecute(Task task) {
        this.task = task;
    }

    public void executeTask() {
        System.out.printf("Executing task with name %s, total seconds %s%n", task.getName(), task.getDuration());
    }
}
