package xbox.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import util.CustomAssertion;
import util.SystemUtil;
import util.TestCaseBase;
import xbox.basepages.XboxHomePage;
import java.util.HashMap; // import the HashMap class
import java.util.Properties;


public class XboxVerifyGamesTest extends TestCaseBase {
	
	
	@Test(groups = {"ChromeWin32", "IEWin32"})
	public void test2() throws InterruptedException{
		HashMap<String, String> gamertags = new HashMap<String, String>();
		
		Properties PROPERTIES_RESOURCES = SystemUtil
				.loadPropertiesResources("/testdata_xbox.properties");
		
		String game1 = PROPERTIES_RESOURCES.getProperty("xbox.game1");
		String game2 = PROPERTIES_RESOURCES.getProperty("xbox.game2");
		String game3 = PROPERTIES_RESOURCES.getProperty("xbox.game3");
		String game4 = PROPERTIES_RESOURCES.getProperty("xbox.game4");
		String game5 = PROPERTIES_RESOURCES.getProperty("xbox.game5");
		
		gamertags.put("game1", game1);
		gamertags.put("game2", game2);
		gamertags.put("game3", game3);
		gamertags.put("game4", game4);
		gamertags.put("game5", game5);
		
		XboxHomePage home = new XboxHomePage(); 
		home.search();
		home.waitPage();
		
		CustomAssertion assertion = new CustomAssertion();
		
		assertion.equals(home.getGame1(), gamertags, "game1");
		assertion.equals(home.getGame2(), gamertags, "game2");
		assertion.equals(home.getGame3(), gamertags, "game3");
		assertion.equals(home.getGame4(), gamertags, "game4");
		assertion.equals(home.getGame5(), gamertags, "game5");
	}
	

}
