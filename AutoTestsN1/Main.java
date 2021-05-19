package AutoTestsN1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://auto.ru/moskva/");

        driver.findElement(By.xpath("//*[@id=\"LayoutIndex\"]/div/div/div[1]/div/div[1]/div[3]/div/div[6]/a[3]/div[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Jetta']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"listing-filters\"]/div[2]/div[2]/div[3]/div[3]/span/label[2]/div/span/input")).sendKeys("700000");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"listing-filters\"]/div[2]/div[1]/div[1]/span/label[3]/button/span")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"listing-filters\"]/div[2]/div[2]/div[3]/div[1]/span/div[1]/button")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[11]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"listing-filters\"]/div[2]/div[2]/div[3]/div[2]/span/label[2]/div/span/input")).sendKeys("85000");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"listing-filters\"]/div[2]/div[3]/div[3]/button/span")).click();
        Thread.sleep(2000);


        Thread.sleep(5000);
        //driver.close();
        driver.quit();
    }
}
