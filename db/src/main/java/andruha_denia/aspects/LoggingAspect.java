package andruha_denia.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author azozello
 * @since 17.09.17.
 */

//@Aspect
public class LoggingAspect {
    static Logger LOG = Logger.getLogger(LoggingAspect.class.getName());

    @Pointcut("execution(* andruha_denia.controllers.rest.TestControllerRest.*(..))")
    public void webServiceMethod() { }

    @Around("webServiceMethod()")
    public Object logWebServiceCall(ProceedingJoinPoint thisJoinPoint) {
        Object result = new Object();
        try {
            result = thisJoinPoint.proceed();
        } catch (Throwable t){
            LOG.error("In "+thisJoinPoint.getSourceLocation()+" Caught exception: "+t.getClass()+" "+t.getMessage());
        }
        return result;
    }
}
