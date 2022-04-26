package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //Variable
    private By txtMensajeExito = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3");


    private WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getMensajeExito()
    {
        return driver.findElement(txtMensajeExito).getText();

    }


}

