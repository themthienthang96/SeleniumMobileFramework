package TestCases;

import Pages.LoginPage;
import Utility.AppiumDriverEx;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC01_Admin_Login {

    @Test
    public void LaunchApp(){
        AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();
        LoginPage loginPage = new LoginPage(appiumDriver);
        loginPage.LaunchApp();
    }
}
