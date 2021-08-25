package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author bkuraman
 *
 */
@Aspect
public class LoggingAspect {

  /**
   * Prints all get methods calls
   */
  @Before("allGetters()")
  public void loggingAdvice(JoinPoint joinPoint) {

    // System.out.println("Advice run. Get method Called");
  }

  /**
   * Prints all get methods in Cirlce class
   */
  @Before("allGetters() && allCircleMethods()")
  public void secondAdvice() {

    // System.out.println("Second advice.");
  }

  /**
   * Prints before all methods having String as argument
   */
  @Before("args(name)")
  public void stringArgumentMethods(String name) {

    // System.out.println("A method that takes string Argument is called. the value is " + name);
  }

  /**
   * Prints after all methods having String as argument
   */
  @AfterReturning(pointcut = "args(name)", returning = "returnedValue")
  public void stringArgumentMethodsAfter(String name, String returnedValue) {

    System.out.println(
        "A method that takes string argument is called with value " + name + " And returned value is " + returnedValue);
  }

  /**
   * Prints after throwing exception
   */
  @AfterThrowing(pointcut = "args(arg)", throwing = "ex")
  public void stringArgumentMethodThrowingException(String arg, Exception ex) {

    System.out.println("A method that takes string argument is called with value " + arg + " And exception is " + ex);
  }

  //
  @Around("@annotation(aspect.Loggable)")
  public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {

    Object returnedValue = null;
    try {
      // Before
      System.out.println("Before Advice");

      // calling
      returnedValue = proceedingJoinPoint.proceed();

      // After
      System.out.println("After returning value is" + returnedValue);

    } catch (Throwable e) {
      System.out.println("After throwing");
    }

    System.out.println("After finally");
    return returnedValue;
  }

  @Pointcut("execution(* get*())")
  public void allGetters() {

  }

  @Pointcut("within(model.Circle)")
  public void allCircleMethods() {

  }
}
