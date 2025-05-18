package rozchepiy.dev;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component("main-task")
//@Scope("prototype")
public class Task {
    private final String name;
    private final Long duration;


    public Task() {
        this.name = "task";
        this.duration = 60L;
        System.out.println("Call task constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Call task postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Call task preDestroy");
    }

    public String getName() {
        return name;
    }

    public Long getDuration() {
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
