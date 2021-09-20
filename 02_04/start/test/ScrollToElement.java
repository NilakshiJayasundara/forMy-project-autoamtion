import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:/My Courses/LinkedIN/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement fullName = driver.findElement(By.id("name"));


        Actions action = new Actions(driver);
        action.moveToElement(fullName);
        fullName.sendKeys("Nilakhi Jayasundara");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("09/19/2021");


        driver.quit();
    }
}
