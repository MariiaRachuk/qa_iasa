package mainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class mainPageEpam {
	WebDriver driver = null;
	
//1
	By onCareers = By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div/div/div[2]/button");
	
	By GetStarted = By.className("button-ui bg-color-light-blue standard");
	
	
//2	
	By searchButton = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/button");
	
	By textSearch = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/div/form/button");
	
//3
	By langButton = By.className("location-selector__button");
	
	By rusButton = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[2]/div/button");
	//By textSearch 
	
//4
	By epamButton = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div/div/header/div/a/img");
	
//5
	By instagramButton = By.xpath("//*[@id=\"wrapper\"]/div[3]/div[1]/footer/div/div[2]/ul[2]/li[3]/a");
	
//6	
	By howWeDoItButton = By.className("top-navigation__item-link");
	
	By ourOwnIP = By.linkText("https://solutionshub.epam.com");
	
	
//7
	By textHealthcare = By.className("featured-content-grid__view-more");

	By SolutionHub = By.className("font-size-17");
	
//8	
	By contactUsButton = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[1]/a");
	
	
		public mainPageEpam(WebDriver driver) {
			this.driver = driver;		
		}
		
//1
		public void clickonCareers() {
			
			driver.findElement(onCareers).click();
			
		}
		
		public void clickconGetStarted() {
			
			driver.findElement(GetStarted).click();
			
		}
		
//2
		public void clicksearchButton() {
			
			driver.findElement(searchButton).click();
			
		}
		
		public void settextSearch(String text) {
			
			driver.findElement(textSearch).sendKeys(text);
		}
		
//3
		public void clicklangButton() {
			
			driver.findElement(langButton).click();
			
		}
		
		public void clickrusButton() {
			
			driver.findElement(rusButton).click();
			
		}

//4
		public void clickepamButton() {
			
			driver.findElement(epamButton).click();
			
		}
		
		public void onServicepage() {
			driver = new SafariDriver();
		    driver.get("https://www.epam.com/services");
					
		}
		
//5
		public void clickhowinstagramButton() {
			
			driver.findElement(instagramButton).getAttribute("href");
			
		}
		
//6
	public void onWeDoItButton1() {
		driver = new SafariDriver();
	    driver.get("https://www.epam.com/how-we-do-it");
				
		}
		
		
		public void clickhowWeDoItButton1() {
			
			driver.findElement(howWeDoItButton).click();
			
		}
		
		public void clickourOwnIP() {
					
					driver.findElement(ourOwnIP).getAttribute("href");
					
				}
		
//7
		public void OnOurwork() {
				
			driver = new SafariDriver();
		    driver.get("https://www.epam.com/our-work");
				
		}
		
		public void clicktextHealthcare() {
			
			driver.findElement(textHealthcare).getAttribute("href");
			
		}
		
		public void clickSolutionHubn() {
			
			driver.findElement(SolutionHub).getAttribute("href");
			
		}

//8
		
		public void clickcontactUsButton() {
			
			driver.findElement(contactUsButton).click();
			
		}
		
	
	
}
