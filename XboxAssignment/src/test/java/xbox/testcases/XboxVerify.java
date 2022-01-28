package xbox.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import util.CustomAssertion;
import util.SystemUtil;
import util.TestCaseBase;
import xbox.basepages.XboxHomePage;
import java.util.HashMap; // import the HashMap class
import java.util.Properties;


public class XboxVerify extends TestCaseBase {
	
	@Test(groups = {"ChromeWin32", "IEWin32"})
	
	public void open() throws InterruptedException {
		HashMap<String, String> gamertags = new HashMap<String, String>();
		Properties PROPERTIES_RESOURCES = SystemUtil
				.loadPropertiesResources("/testdata_xbox.properties");
		
		String lead1 = PROPERTIES_RESOURCES.getProperty("xbox.lead1");
		String lead2 = PROPERTIES_RESOURCES.getProperty("xbox.lead2");
		String lead3 = PROPERTIES_RESOURCES.getProperty("xbox.lead3");
		String lead4 = PROPERTIES_RESOURCES.getProperty("xbox.lead4");
		String lead5 = PROPERTIES_RESOURCES.getProperty("xbox.lead5");

		gamertags.put("lead1", lead1);
		gamertags.put("lead2", lead2);
		gamertags.put("lead3", lead3);
		gamertags.put("lead4", lead4);
		gamertags.put("lead5", lead5);

		XboxHomePage home = new XboxHomePage();
		CustomAssertion assertion = new CustomAssertion();
		home.open();
		home.waitPage();
		
		assertion.equals(home.getGamertag1(), gamertags, "lead1");
		assertion.equals(home.getGamertag2(), gamertags, "lead2");
		assertion.equals(home.getGamertag3(), gamertags, "lead3");
		assertion.equals(home.getGamertag4(), gamertags, "lead4");
		assertion.equals(home.getGamertag5(), gamertags, "lead5");
		
	}
	

}
