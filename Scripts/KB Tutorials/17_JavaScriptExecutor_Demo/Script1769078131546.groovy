import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/KB Tutorials/Page_Amazon.com/input_India_a-button-input'))

//Add attribute using javascript
WebElement el = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/KB Tutorials/Page_Amazon.com/input_searchtextbox'), 
    30)

WebUI.executeJavaScript('arguments[0].setAttribute(\'value\',\'piano\')', Arrays.asList(el))

//Click element using javascript
WebElement searchBtn = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/KB Tutorials/Page_Amazon.com/submit-button'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(searchBtn))

//Remove attribute from inspect element
WebElement el = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/KB Tutorials/Page_Amazon.com/input_searchtextbox'), 
    30)

WebUI.executeJavaScript('arguments[0].removeAttribute(\'id\')', Arrays.asList(el))

WebUI.closeBrowser()