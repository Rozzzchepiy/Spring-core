package rozchepiy.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rozchepiy.dev.task.TaskExecute;
import rozchepiy.dev.task.TaskManager;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("rozchepiy.dev");

        TaskManager taskManager = (TaskManager) context.getBean("taskManager");
        taskManager.printTask();
        TaskExecute taskExecute = (TaskExecute) context.getBean("taskExecute");
        taskExecute.executeTask();


        context.close();
    }
}