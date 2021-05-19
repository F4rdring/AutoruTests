package AutoTestsN1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tests {
    public static class PageTasts {
        WebDriver driver;
        WebDriverWait webDriverWait;

        @BeforeAll
        static void beforeAll() {
            WebDriverManager.chromedriver().setup();
        }

        @BeforeEach
        public void setupBrowser() {
            driver = new ChromeDriver();
            webDriverWait = new WebDriverWait(driver, 5);
        }

        @Test
        void pageTest() {
            new Page(driver).page1.click();
            new Page(driver).page2.click();
            new Page(driver).page3.sendKeys("700000");
            new Page(driver).page4.click();
            new Page(driver).page5.click();
            new Page(driver).page6.click();
            new Page(driver).page7.sendKeys("85000");
            new Page(driver).page8.click();
        }
    }
}
