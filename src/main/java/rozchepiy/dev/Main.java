package rozchepiy.dev;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("rozchepiy.dev");

        Task task = context.getBean(Task.class);
        Task task2 = context.getBean(Task.class);

        System.out.println(task == task2);

        TaskManager taskManager = (TaskManager) context.getBean("taskManager");
        taskManager.printTask();

        TaskExecute taskExecute = (TaskExecute) context.getBean("taskExecute");

        taskExecute.executeTask();
    }
}