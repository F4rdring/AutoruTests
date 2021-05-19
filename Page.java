package AutoTestsN1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
    WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"LayoutIndex\"]/div/div/div[1]/div/div[1]/div[3]/div/div[6]/a[3]/div[1]")
    public WebElement page1;

    @FindBy(xpath = "//a[text()='Jetta']")
    public WebElement page2;

    @FindBy(xpath = "//*[@id=\"listing-filters\"]/div[2]/div[2]/div[3]/div[3]/span/label[2]/div/span/input")
    public WebElement page3;

    @FindBy(xpath = "//*[@id=\"listing-filters\"]/div[2]/div[1]/div[1]/span/label[3]/button/span")
    public  WebElement page4;

    @FindBy(xpath = "//*[@id=\"listing-filters\"]/div[2]/div[2]/div[3]/div[1]/span/div[1]/button")
    public WebElement page5;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[11]")
    public WebElement page6;

    @FindBy(xpath = "//*[@id=\"listing-filters\"]/div[2]/div[2]/div[3]/div[2]/span/label[2]/div/span/input")
    public WebElement page7;

    @FindBy(xpath = "//*[@id=\"listing-filters\"]/div[2]/div[3]/div[3]/button/span")
    public WebElement page8;
}
