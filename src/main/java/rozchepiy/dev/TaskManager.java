package rozchepiy.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("taskManager")
public class TaskManager {

    private final Task task;

    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }

    @PostConstruct
    public void postConstructor() {
        System.out.println("Call taskManager postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Call taskManager preDestroy");
    }

    public void printTask() {
        if (task == null) {
            System.out.println("No current task");
        } else {
            System.out.println("Current task: " + task.toString());
        }
    }


}
