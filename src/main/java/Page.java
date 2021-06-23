
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {

    @FindBy(id = "id_first_name")
    private WebElement imputFirstName;

    @FindBy(id = "id_last_name")
    private WebElement imputLastName;

    @FindBy(id = "id_email")
    private WebElement imputEmail;

    @FindBy(id = "id_phone")
    private WebElement imputPhone;

    @FindBy(id = "id_pesel")
    private WebElement imputPesel;

    @FindBy(id = "id_id_numer")
    private WebElement imputIdNumber;

    @FindBy(id = "id_date")
    private WebElement imputDate;

    @FindBy(id = "form_button_next")
    private WebElement buttonNext;

    public Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void fillFirstName (String name){
        imputFirstName.click();
        imputFirstName.sendKeys(name);
    }

    public void fillLastName (String lastName){
        imputLastName.click();
        imputLastName.sendKeys(lastName);
    }

    public void fillEmail (String mail){
        imputEmail.click();
        imputEmail.sendKeys(mail);
    }

    public void fillPhone (String numberPhone){
        imputPhone.click();
        imputPhone.sendKeys(numberPhone);
    }

    public void fillPesel (String pesel){
        imputPesel.click();
        imputPesel.sendKeys(pesel);
    }
    public void fillIdNumber (String idNumber){
        imputIdNumber.click();
        imputIdNumber.sendKeys(idNumber);
    }

    public void fillDate (String date) throws InterruptedException {
        imputDate.click();
        imputDate.sendKeys(date);
        imputDate.submit();
        Thread.sleep(2000);
    }

    public void sendForm () throws InterruptedException {
        buttonNext.click();
        Thread.sleep(2000);

    }
}
