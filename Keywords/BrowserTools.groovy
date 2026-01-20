import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.driver.chrome.ChromeDriverUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class BrowserTools {
	@Keyword
	def openSecureBrowser(String url) {
	// Define preferences to disable password manager and leak detection
	Map<String, Object> prefs = new HashMap<String, Object>()
	prefs.put("profile.password_manager_leak_detection", false)
	prefs.put("profile.password_manager_enabled", false)
	prefs.put("credentials_enable_service", false)
	
	ChromeOptions options = new ChromeOptions()
	options.setExperimentalOption("prefs", prefs)
	options.addArguments("--disable-features=PasswordLeakDetection")
	
	// 3. Initialize the driver
	String driverPath = ChromeDriverUtil.getChromeDriverPath()
	System.setProperty("webdriver.chrome.driver", driverPath)
	
	ChromeDriver driver = new ChromeDriver(options)

	// 4. Link the custom driver to Katalon's engine
	DriverFactory.changeWebDriver(driver)
	
	
	// 5. Navigate to the URL provided
	if (url != null && !url.isEmpty()) {
		WebUI.navigateToUrl(url)
	}
	}
}
