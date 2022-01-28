package xbox.basepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import util.Page;
import util.TestCaseBase;
import util.Waiting;

public class XboxHomePage extends Page {
	
	public static String TITLE = "Xbox Leaderboards - Xbox Gamertag";
	
	@FindBy(xpath = "//div[@class='row']//div[1]/div/div[3]/a")
	public WebElement gamertag1;
	
	@FindBy(xpath = "//div[@class='row']//div[2]/div/div[3]")
	public WebElement gamertag2;
	
	@FindBy(xpath = "//div[@class='row']//div[3]/div/div[3]")
	public WebElement gamertag3;
	
	@FindBy(xpath = "//div[@class='row']//div[4]/div/div[3]")
	public WebElement gamertag4;
	
	@FindBy(xpath = "//div[@class='row']//div[5]/div/div[3]")
	public WebElement gamertag5;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/form/input")
	public WebElement searchBar;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/form/button")
	public WebElement searchBtn;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/h3/a")
	public WebElement game1;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/h3/a")
	public WebElement game2;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/h3/a")
	public WebElement game3;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[4]/div/div/div[1]/h3/a")
	public WebElement game4;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[5]/div/div/div[1]/h3/a")
	public WebElement game5;
	
	
	public XboxHomePage open() {
		String URL = "https://www.xboxgamertag.com/leaderboards";
		TestCaseBase.threadDriver.get().navigate().to(URL);
		return this;
	}
	
	public XboxHomePage waitPage() throws InterruptedException {
		Thread.sleep(2000);
		Waiting.implicitly(2);
		return this;
	}
	
	public String getGamertag1() {
		Waiting.until(gamertag1);
		return gamertag1.getText();
	}
	
	public String getGamertag2() {
		Waiting.until(gamertag2);
		return gamertag2.getText();
	}
	
	public String getGamertag3() {
		Waiting.until(gamertag3);
		return gamertag3.getText();
	}
	
	public String getGamertag4() {
		Waiting.until(gamertag4);
		return gamertag4.getText();
	}
	
	public String getGamertag5() {
		Waiting.until(gamertag5);
		return gamertag5.getText();
	}
	
	public XboxHomePage search() {
		String URL = "https://www.xboxgamertag.com/leaderboards";
		TestCaseBase.threadDriver.get().navigate().to(URL);
		Waiting.until(searchBar);
		searchBar.sendKeys("Duskamo");
		searchBtn.click();
		
		return this;
	}
	
	public String getGame1() {
		Waiting.until(game1);
		return game1.getText();
	}
	public String getGame2() {
		Waiting.until(game2);
		return game2.getText();
	}
	public String getGame3() {
		Waiting.until(game3);
		return game3.getText();
	}
	public String getGame4() {
		Waiting.until(game4);
		return game4.getText();
	}
	public String getGame5() {
		Waiting.until(game5);
		return game5.getText();
	}
	
}
