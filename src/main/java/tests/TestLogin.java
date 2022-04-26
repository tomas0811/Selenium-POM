package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class TestLogin {
    //variables
    WebDriver driver;
    String PATH_DRIVER= "C:\\Users\\Usuario\\Desktop\\Selenium POM\\src\\main\\resources\\drivers\\chromedriver.exe";
    String TYPE_DRIVER= "webdriver.chrome.driver";
    String URL= "https://demo.guru99.com/test/newtours/";
    LoginPage login;
    HomePage home;

    @Before
    public void setUp()
    {
        System.setProperty(TYPE_DRIVER,PATH_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        login = new LoginPage(driver);




    }

    @Test
    public void TestLoginExitoso()
    {
        login.IniciarSesion("El_Perverso","lunapocho2012");
        //verificacion
        home = new HomePage(driver);
        Assert.assertEquals("Login Successfully",home.getMensajeExito());





    }
    @Test
    public void Opciones()
    {
        WebElement Contact= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[4]"));
        Contact.click();

    }










}






