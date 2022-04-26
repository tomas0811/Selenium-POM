package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    //variables
    private By txtUser= By.name("userName");
    private By txtPass= By.name("password");
    private By btnLogin= By.name("submit");
    private By txtMensajeError= By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/span");
    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void IniciarSesion(String user, String pass)
    {
        driver.findElement(txtUser).sendKeys(user);
        driver.findElement(txtPass).sendKeys(pass);
        driver.findElement(btnLogin).click();


    }

    public String getMensajeError()
    {
        return driver.findElement(txtMensajeError).getText();
    }

}