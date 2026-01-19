import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class MyKeywordDemo {
	/**
	 * Hello world1 
	 */
	@Keyword
	def hello() {
		println "Hello World !"
	}

	@Keyword
	def helloUser(String user) {
		println("Hello " +user)
	}

	@Keyword(keywordObject = "browser")
	def helloUser1(String user1) {
		println("Hello " +user1)
	}


	@Keyword(keywordObject = "login")
	def login(String username, String password) {
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), password)
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))
	
	}
}


