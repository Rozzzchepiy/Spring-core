package rozchepiy.dev.task;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rozchepiy.dev.aop.Loggable;


@Component("taskManager")
public class TaskManager {

    private final Task task;

    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }

    @PostConstruct
    public void postConstructor() {
//        System.out.println("Call taskManager postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
//        System.out.println("Call taskManager preDestroy");
    }

    @Loggable
    public Integer printTask() {
            System.out.println("Current task: " + task.toString());
//            throw new RuntimeException("Exception in taskManager");
            return task.getDuration();
    }


}
