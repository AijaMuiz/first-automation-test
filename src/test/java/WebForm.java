// Page URL: https://www.google.com
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String SDA = "SDA";

    @FindBy(name = "q")
    private WebElement search;

    @FindBy(name = "btnK")
    private WebElement submit;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3")
    private WebElement link;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterSDA(){
        this.search.sendKeys(SDA);
    }

    public void pressSearchButton(){
        this.submit.submit();
    }

    public void pressFirstLink(){
        this.link.click();
    }
}