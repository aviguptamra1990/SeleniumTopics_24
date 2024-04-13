package topics;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestNG_IRetryAnalyzer_Test_Cases_50 implements IRetryAnalyzer {

	int retryStartCount=1;
	
	int retryTotalCount=3;
	
	
	
	@Override
	public boolean retry(ITestResult result) {

		if(retryStartCount<=retryTotalCount)
			
		{
			retryStartCount++;
			
			return true;
			
		}
		

		return false;
		
	}
	
	

}
