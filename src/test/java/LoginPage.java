import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public static void main(StringInbuiltFunc[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().fullscreen();
        driver.quit();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        
        

        
        
        
    }
}
