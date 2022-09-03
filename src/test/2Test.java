// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class 2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void 2() {
    driver.get("https://vikisews.com/profile/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.cssSelector(".mb-3 > .align-items-center:nth-child(1) > .fa")).click();
    driver.findElement(By.name("chest_girth")).sendKeys("90");
    driver.findElement(By.cssSelector(".mb-3 > .align-items-center:nth-child(1) > .btn")).click();
    driver.findElement(By.cssSelector(".mb-3 > .align-items-center:nth-child(2) > .fa")).click();
    driver.findElement(By.name("waist")).sendKeys("60");
    driver.findElement(By.cssSelector(".mb-3 > .align-items-center:nth-child(2) > .btn")).click();
    driver.findElement(By.cssSelector(".mb-3 > .align-items-center:nth-child(3) > .fa")).click();
    driver.findElement(By.name("hip_girth")).sendKeys("90");
    driver.findElement(By.cssSelector(".mb-3 > .align-items-center:nth-child(3) > .btn")).click();
  }
}