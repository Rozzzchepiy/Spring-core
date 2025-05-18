package rozchepiy.dev.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//    @Before("execution(* rozchepiy.dev.task.TaskManager.*(..))")
//    public void logBefore(JoinPoint joinPoint) {
//        System.out.println("Before method: " + joinPoint.getSignature().getName());
//    }
//
//    @AfterReturning(value = "execution(* rozchepiy.dev.task.TaskManager.*(..))", returning = "result")
//    public void logAfterReturning(JoinPoint joinPoint, Object result) {
//        System.out.println("After method result: " + joinPoint.getSignature().getName() + ", result: " +result );
//    }
//
//    @AfterThrowing(value = "execution(* rozchepiy.dev.task.TaskManager.*(..))", throwing = "exc")
//    public void afterThrowing(
//            JoinPoint joinPoint,
//            Exception exc
//    ) {
//        System.out.println("After exception: " + exc.getMessage());
//    }
//
//    @After("execution(* rozchepiy.dev.task.TaskManager.*(..))")
//    public void after(
//            JoinPoint joinPoint
//    ) {
//        System.out.println("After method: " + joinPoint.getSignature().getName());
//    }

//    @Around("execution(* rozchepiy.dev.task.TaskManager.*(..))")
//    public Object logAroud(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("Before method");
//        Object result = proceedingJoinPoint.proceed();
//        System.out.println("After method");
//        return result;
//    }

    @Before("@annotation(loggable)")
    public void log(JoinPoint joinPoint, Loggable loggable) {
        for (int i = 0; i < loggable.times(); i++) {
            System.out.printf("LOG %s: before method=%s\n",
                    loggable.value(),
                    joinPoint.getSignature().getName());
        }
    }
}
