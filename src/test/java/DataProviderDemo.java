import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {


    @Test(dataProvider = "dataSender")
    public void google(String query)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys(query);
    }

    @DataProvider
    public Object[] dataSender()
    {
      Object[] object = new Object[4];
      object[0] = "Automation";
      object[1]= "Selenium";
        object[2] = "Python";
        object[3]= "Java Script";
      return object;
    }
}
