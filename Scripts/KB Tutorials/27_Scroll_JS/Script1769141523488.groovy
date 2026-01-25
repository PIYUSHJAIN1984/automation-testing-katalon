import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.executeJavaScript('window.scrollTo(0,document.body.scrollHeight)', null)

WebUI.click(findTestObject('Object Repository/KB Tutorials/Page_Facebook  log in or sign up/a_Log in'))

WebUI.closeBrowser()