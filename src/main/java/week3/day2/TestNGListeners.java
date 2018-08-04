package week3.day2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class TestNGListeners implements IAnnotationTransformer, IRetryAnalyzer{

	int IMaxRetry= 1;
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
    annotation.setRetryAnalyzer(this.getClass());
    annotation.setInvocationCount(1);
    
    if(!testMethod.getName().equalsIgnoreCase("createLead")){
    	annotation.setEnabled(false);
    }
 // testMethod.getName().equalsIgnoreCase("CreateLead");
	}

	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess()&& IMaxRetry<2) {
			IMaxRetry++;
			return true;
		}	else {
			return false;
		}
	} 

}
