package topics;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TestNG_IAnnotationTransformer_Test_Cases_51 implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {


		annotation.setRetryAnalyzer(TestNG_IRetryAnalyzer_Test_Cases_50.class);
		
	}
	
	
	

}
