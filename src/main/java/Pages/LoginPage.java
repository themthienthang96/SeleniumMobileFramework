package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginPage {
    private AppiumDriver<MobileElement> appiumDriver;

    public LoginPage(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public void LaunchApp(){
        MobileElement acceptBtn = appiumDriver.findElementById("com.android.chrome:id/terms_accept");
        acceptBtn.click();
    }
}
