import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem3 {

    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence", Keys.ENTER);
        driver.findElement(By.xpath("//li[@id='ca-history']")).click();
        String url= driver.getTitle();

        if(url.equals("Artificial intelligence: Revision history - Wikipedia"))
        {
            System.out.println(url);
        }
        else
        {
            System.out.println("Page not landed correctly");
        }
        driver.quit();
    }
}
