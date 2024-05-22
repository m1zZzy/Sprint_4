package basicQATest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static pages.BasicPage.BASE_URI;

public class Base_Test {

    public WebDriver driver;

    @Before
    public void startUp() {
        System.setProperty("chromedriver", "./src/main/java/resources/webdriver/chrome/chromedriver");
        System.setProperty("geckodriver", "./src/main/java/resources/webdriver/firefox/geckodriver");
        // выбор браузера для прогона тестов:
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URI);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}