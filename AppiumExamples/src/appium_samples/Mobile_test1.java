package appium_samples;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Mobile_test1 {
	@Test
	public void mobiletest() throws MalformedURLException
	{
		File appDir = new File("src");
		
		File app = new File(appDir, "add the apk file here ");//app object knows where exactly the apk file lies.
		
		DesiredCapabilities d = new DesiredCapabilities();//This is a class which tells Appium server which session to run 
		d.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		d.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		d.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());//Tells which app to execute in the andriod OS.
		 //In previous version we had to use AppiumDriver class to work with both ANdroid and iOS
		//Now in latest version we should define two different drivers for both android and iOS.
		//Android driver
		AndroidDriver A = new AndroidDriver(new URL("https://127.0.0.1:4723/wd/hub"),d);
		//AndroidDriver takes two arguments ----1)Appium server location 2)Parameters to be passed to appium server
		//We have to tell the android app to go look for the appium server 
		//by providing the Appium server IP address&port info as first argument --- and second argument should be the desired capabilities information to invoke android info.
		
		
	}

}
