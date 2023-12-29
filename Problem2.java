import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Exception;
public class Problem2 {
    public static void main(String[] args)throws Exception{
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");//Launch the browser
        driver.manage().window().maximize();  //Maximize the browser

        Thread.sleep(2000);
    if(driver.getTitle().equals("STORE"))
        {
            System.out.println("Page landed on correct website");
        }
        else
        {
            System.out.println("Page not landed on correct website");
        }
        driver.quit();
    }
}
