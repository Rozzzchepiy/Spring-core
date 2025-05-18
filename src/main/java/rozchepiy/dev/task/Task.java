package rozchepiy.dev.task;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("main-task")
public class Task {
    private final String name;
    private final Integer duration;


    public Task(
            @Value("${task.name}") String name,
            @Value("${task.duration}") Integer duration
    ) {
        this.name = name;
        this.duration = duration;
//        System.out.println("Call task constructor");
    }

    @PostConstruct
    public void postConstruct() {
//        System.out.println("Call task postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
//        System.out.println("Call task preDestroy");
    }

    public String getName() {
        return name;
    }

    public Integer getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
