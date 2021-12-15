package commons;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTests {

	BrowserProperties properties = new BrowserProperties();

	public void settingsDevice() throws Exception {
		Configuration.remote = "http://127.0.0.1:4723/wd/hub";

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, properties.getPlatformName());
		capabilities.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, true);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, properties.getAppActivity());
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, properties.getAppPackage());
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		capabilities.setCapability("autoGrantPermissions", true);
		capabilities.setCapability("gpsEnabled", true);
		capabilities.setCapability("autoAcceptAlerts", true);

		AndroidDriver<SelenideElement> driver = new AndroidDriver<SelenideElement>(
				new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		WebDriverRunner.setWebDriver(driver);

	}
	

	
	
}
