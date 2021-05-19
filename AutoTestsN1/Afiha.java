package AutoTestsN1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Afiha {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://afisha.yandex.ru/moscow?utm_source=main_stripe_big");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/header/div/div/div[2]/div/nav/ul[1]/li[1]/div/div/a/span")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div/div[2]/main/div[1]/div[2]/div[1]/div[1]/div/div/a/div[2]/h2")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[7]/div/div[2]/div[1]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[1]/span/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div/div[2]/div[1]/div/main/div[1]/div[3]/div[1]/a/button")).click();

        driver.quit();
    }
}
