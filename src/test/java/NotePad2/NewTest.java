package NotePad2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	// define the chrome driver
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");

		   // define the drive instance
		  WebDriver driver = new ChromeDriver();
		  // nagivate the browser to this url
		  driver.get("http://localhost:8083/NotePad2/NoteServlet/dashboard");
		  // browser look for link with text value "Add New User"
		  driver.findElement(By.linkText("Add New User")).click();
		  
		  //driver.findElement(By.id("Name")).sendKeys("h");
		  //driver.findElement(By.id("Title")).sendKeys("h");
		  //driver.findElement(By.id("Details")).sendKeys("h");
		  
		  //driver.findElement(By.linkText("Call Servlet")).click();
		  
		  // browser look for link with text value "Edit"
		  //driver.findElement(By.linkText("Edit")).click();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
