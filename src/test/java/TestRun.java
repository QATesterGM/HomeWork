import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRun {

    private WebDriver driver;

    @Test
    public void fillForm () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.bluealert.pl/ba/form/formularz-testowy");
        Thread.sleep(2000);
        Page page = new Page(driver);
        page.fillFirstName("Lukasz");
        page.fillLastName("Gajda");
        page.fillEmail("gajdalukasz89@gmail.com");
        page.fillPhone("502174381");
        page.fillPesel("33011992239");
        page.fillIdNumber("AMJ177116");
        page.fillDate("1989-07-15");
        page.sendForm();
        driver.quit();
    }
}
