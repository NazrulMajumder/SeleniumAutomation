package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chrome-win64\\chrome.exe");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Nazrul Islam Majumder");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("nazrul.islam62921@gmail");
		Thread.sleep(1000);
		driver.findElement(By.id("phone")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("phone")).sendKeys("01915543358");
		Thread.sleep(1000);
		driver.findElement(By.id("textarea")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("textarea")).sendKeys("276,Majumder villa");
		Thread.sleep(2000);
		driver.findElement(By.id("male")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("sunday")).click();
		Thread.sleep(1000);
		///
		
		Select dropdown = new Select(driver.findElement(By.id("country"))); 
		dropdown.selectByVisibleText("Japan");  
		
		
		driver.findElement(By.xpath("//option[@value='red']")).click();
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).click();
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("USA");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[normalize-space()='USA']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		//Double click
		action.doubleClick(element).perform();
		Thread.sleep(1000);
		WebElement From=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		Thread.sleep(2000);
		WebElement To=driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(From, To).build().perform();
		Thread.sleep(3000);
		WebElement slider= driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
	    Actions builder = new Actions(driver);
	    org.openqa.selenium.interactions.Action action1 = builder.dragAndDropBy(slider, 150, 0).build();
	    action1.perform();
	    Thread.sleep(3000);
	    driver.switchTo().frame(0);
	    Thread.sleep(3000);
	    driver.findElement(By.id("RESULT_TextField-0")).click();
	    driver.findElement(By.id("RESULT_TextField-0")).sendKeys("Nazrul");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"q2\"]/table/tbody/tr[1]/td/label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"q4\"]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[2]/a")).click();
	    Thread.sleep(5000);
	    Select dropdown1 = new Select(driver.findElement(By.id("RESULT_RadioButton-3"))); 
		dropdown1.selectByVisibleText("Manager");  
		//Thread.sleep(5000);
		//driver.findElement(By.id("FSsubmit")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.cssSelector("#FSsubmit")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("")).click();
		new Actions(driver);
		action.dragAndDropBy(element, 300, 100).perform();
		

	}

}
