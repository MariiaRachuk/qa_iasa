package Test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mainPage.mainPageEpam;
import io.cucumber.java.en.*;

public class StepTest {
	
	static WebDriver driver = null;

	static mainPageEpam mainPage;

	public static void main(String[] args) {

		MainPageTest();
		mainPage = new mainPageEpam(driver);

	}
	public static void MainPageTest() {

		String projectPath = System.getProperty("user.dir");
		driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.epam.com");
		
	}
	
	//1 Open job offer
	
		@Given("^I am on the EPAM site $")																				   //2				
	    public void open_the_Safari() throws Throwable{	
			MainPageTest();
	    }	
		@When("I click1 on Careers")
		public void i_click_on_Careers() throws Throwable {
			mainPage.clickonCareers();
		 
		}

		@When("I click2 on Get started now")
		public void i_click2_Get_started(String string) throws Throwable{
			mainPage.clickconGetStarted();
		}
		
		@Then("I go0 to the page with job offer")
		public void i_go0_to_the_page_with_job_offer() {
			driver.findElement(By.id("root"));
		}
		
		//2 searching
		 @Given("^I am on the EPAM site$")																			//1
		 public void click_search() throws Throwable {
			 MainPageTest();
			 mainPage.clicksearchButton();
		}		

		@When("I search1 for {string}")
		public void i_search1_for(String string) throws Throwable {
			mainPage.settextSearch(string);
	    	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/div/form/button")).click();
		}
		
		@Then("I see0 list of aricles that have word {string}")
		public void i_see0_list_of_aricles_that_have_word(String string) throws Throwable{
			driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/section/div/div[2]/section/h2"));
		}
		
		//3 searching other language
		@Given("^I am on the EPAM site$")																			//1
		 public void click_searchRu() throws Throwable {
			 MainPageTest();
			 mainPage.clicklangButton();
			 mainPage.clickrusButton();
		}	
		@When("I search2 for {string}")
		public void i_search2_for(String string) throws Throwable {
			mainPage.settextSearch(string);
	    	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/div/form/button")).click();
		}

		@Then("I see1 list of aricles that have word {string}")
		public void i_see1_list_of_aricles_that_have_word(String string)  throws Throwable{
			driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/section/div/div[2]/section/h2"));
		}

		//4 going home
		@Given("^I am on the Service page$")																			//1
		 public void openSafari_page() throws Throwable {
			mainPage.onServicepage();
		}		

		@When("I click on5 EPAM")
		public void i_click_on5_EPAM() throws Throwable{
			mainPage.clickepamButton();
			WebDriverWait wait = new WebDriverWait(driver, 30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wrapper")));
		}

		@Then("I go1 to the main page")
		public void i_go1_to_the_main_page() throws Throwable{
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.epam.com/");    
		}

		//5 instagram
		@Given("I am on page0 {string}")
		public void i_am_on_page0() throws Throwable {
			MainPageTest();
		}
		@When("I scroll down and click icon instagram") 
		public void i_click_Instagram(String string) throws Throwable{
			mainPage.clickhowinstagramButton();
			WebDriverWait wait = new WebDriverWait(driver, 30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("viewport")));
		}
		@Then("I go2 to the  instagram page")
		public void i_go2_to_the_instagram_page() throws Throwable{
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.instagram.com/epamsystems/");
		}
		
		
		//6 SolutionHub
		@Given("I am on page9 How we do it")
		public void i_am_on_page9(String string) throws Throwable{
			mainPage.clickhowWeDoItButton1();
			mainPage.onWeDoItButton1();
		}
		@When("I click7 our own IP ")
		public void i_click7(String string) throws Throwable{
			mainPage.clickourOwnIP();
			WebDriverWait wait = new WebDriverWait(driver, 30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("root")));
		    
		}
		@Then("I go1 to the page SolutionHub")
		public void i_go1_to_the_solutionhub() throws Throwable{
			Assert.assertEquals(driver.getCurrentUrl(), "https://solutionshub.epam.com");
	    	driver.close();
		}

		//7 Customer solution article
		@Given("I am on the page1 Our work")
		public void i_am_on_the_page1(String string) throws Throwable {
			mainPage.OnOurwork();
		}

		@When("I click8 on words Healthcare")
		public void i_click8_on_words(String string) throws Throwable{
			mainPage.clicktextHealthcare();
			WebDriverWait wait = new WebDriverWait(driver, 30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wrapper")));
		}

		@When("I go3 to the page SolutionHub")
		public void i_go3_to_the_page_solution_hub() throws Throwable {
			Assert.assertEquals(driver.getCurrentUrl(), "https://solutionshub.epam.com");
			mainPage.clickSolutionHubn();
		}

		@Then("I am on page more")
		public void i_on_more(String string) throws Throwable {
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.epam.com/our-work/brochures/increasing-brand-value-through-wellness-ecosystems");
	    	driver.close();
		}

		//8 contact us
		@Given("I am on the page1 EPAM")
		public void i_am_on_the_page33(String string) throws Throwable {
			MainPageTest();
		}
		@When("I click11 on contact us")
		public void i_click11_on(String string) throws Throwable{
			mainPage.clickcontactUsButton();
			WebDriverWait wait = new WebDriverWait(driver, 30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wrapper")));
		}

		@Then("I see2 contact us page")
		public void i_see2_a_notification_about_successful_submission() throws Throwable {
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.epam.com/about/who-we-are/contact");
	    	driver.quit();
		}
}
