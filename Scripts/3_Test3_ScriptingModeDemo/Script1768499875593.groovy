import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser("")
WebUI.navigateToUrl("https://katalon-demo-cura.herokuapp.com/")
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service_3/a_Make Appointment'))
WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service_3/input_Username_txt-username'), "John Doe")
WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service_3/input_Password_txt-password'), "g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM")
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service_3/button_Login'))
WebUI.closeBrowser()