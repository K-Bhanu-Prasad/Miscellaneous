package aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author bkuraman
 *
 */
public class LoggingAspectXmlBased {

  public Object myAroundAdviceXml(ProceedingJoinPoint proceedingJoinPoint) {

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

}
