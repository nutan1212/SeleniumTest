package day4Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTIME {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\walke_mdgok38\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String actualUrl=driver.getCurrentUrl();
		System.out.println("actualUrl is:"+actualUrl);
		String expectedUrl="https://demo.actitime.com/login.do";
		System.out.println("expectedUrl is:"+expectedUrl);
		System.out.println("actitime Url Validation:"+actualUrl.contains(expectedUrl));
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement pasword=driver.findElement(By.name("pwd"));
		pasword.sendKeys("manager");
		WebElement loginbtn=driver.findElement(By.cssSelector("#loginButton"));
		loginbtn.click();
		//edriver.manage().window().maximize();
		//edriver.manage().window().setSize(new Dimension(300, 500));
		driver.findElement(By.id("container_tasks")).click();
		//edriver.findElement(By.cssSelector("div.addNewContainer")).click();
		//edriver.findElement(By.className("createNewTasks")).click();
		//edriver.findElement(By.cssSelector("div.customerSelector")).click();
		//edriver.findElement(By.cssSelector("div.searchItemList>div:nth-of-type(8)")).click();
		
		
		driver.findElement(By.cssSelector(".addNewButton")).click();
		
       // edriver.findElement(By.cssSelector(".createNewTasks")).click();
		
		//edriver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
		
		//edriver.findElement(By.cssSelector(".projectSelector .searchItemList>*:nth-child(4)")).click();
		
		//edriver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("Testing");

		//edriver.close();
		
	}

}
