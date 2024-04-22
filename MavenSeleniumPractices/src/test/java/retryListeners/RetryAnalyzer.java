package retryListeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	int count=0;
	int retryLimit=2;

	public boolean retry(ITestResult result) {	
		
		if(count<retryLimit)
		{
			count++;
			return true;
		}
		return false;
	}
	
	
	
	
	
/*	public boolean retry(ITestResult result) {

		if (retrycount<maxretyrcount){
			System.out.println("Retrying test " + result.getName() + " with status "
                    + getResultStatusName(result.getStatus()) + " for the " + (retrycount+1) + " time(s).");
			retrycount++;
            return true;
		}
		
		return false;
	}

	 public String getResultStatusName(int status) {
	    	String resultName = null;
	    	if(status==1)
	    		resultName = "SUCCESS";
	    	if(status==2)
	    		resultName = "FAILURE";
	    	if(status==3)
	    		resultName = "SKIP";
			return resultName;
	    }*/

}
