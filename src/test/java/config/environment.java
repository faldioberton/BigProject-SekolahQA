package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


public class environment {

        public static AppiumDriver driver;
        public static DesiredCapabilities capabilities;
        public static int duration = 10;

        public static WebDriverWait wait;
        public static String baseUrl = "http://127.0.0.1:4723/wd/hub";
    }

