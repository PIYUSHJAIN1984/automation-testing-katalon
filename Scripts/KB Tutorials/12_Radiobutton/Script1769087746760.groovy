import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.spicejet.com/')
WebUI.delay(15)

unchecked = WebUI.verifyElementNotChecked(findTestObject('KB Tutorials/Page_SpiceJet_Radio/roundTrip'), 10)

if (unchecked == true) {
    WebUI.check(findTestObject('KB Tutorials/Page_SpiceJet_Radio/roundTrip'))
}