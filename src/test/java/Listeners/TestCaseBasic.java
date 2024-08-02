package Listeners;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import BaseClass.DwsBaseListeners;

@Listeners(com.crm.Listeners1.BasicListener.class)



public class TestCaseBasic extends DwsBaseListeners {
	
	
	@Test

	public void main1() throws IOException {

		String expected_result = "https://demowebshop.tricentis.com/";
		String actual_result = driver.getCurrentUrl();
		assertEquals(expected_result, actual_result);
	}

	@Test
	public void main2()  {
		String expected_result = "https://demowebshop.tricentis.com";
		String actual_result = driver.getCurrentUrl();
		assertEquals(expected_result, actual_result);

	}

}