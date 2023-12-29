import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.String;
import java.lang.Exception;


public class Problem1 {
    public static void main(String[] args)throws Exception{

        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.quit();





    }
}
