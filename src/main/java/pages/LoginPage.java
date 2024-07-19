package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLOutput;


public class LoginPage {
        WebDriver driver;

        public LoginPage(WebDriver driver  ) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(id ="user-name")
        public WebElement username;

        @FindBy(id="password")
        public WebElement passwordInput;

        @FindBy(id="login-button")
        public WebElement loginButton;

        public void testLogin(String name, String password){
            username.sendKeys(name);
            passwordInput.sendKeys(password);
            loginButton.click();

            System.out.println("asdsFs");
        }
    }

