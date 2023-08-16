package Failtestcases;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer  implements IRetryAnalyzer
{
	int counter=0;
	int maxRetryLimit= 4;

	@Override
	public boolean retry(ITestResult result) {
	
		
				if(counter < maxRetryLimit )
				{
					counter++;
					return true;
				}
		
		
		
		
		return false;
	}

	
	
	
	
}
