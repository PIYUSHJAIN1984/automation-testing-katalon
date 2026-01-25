import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://retail.sbi.bank.in/')

WebUI.click(findTestObject('Object Repository/KB Tutorials/Page_State Bank of India/a_Donations'))

WebUI.switchToWindowTitle('Donations to Religious Entities - Personal Banking')
println(WebUI.getWindowTitle())
println(WebUI.getUrl())

WebUI.switchToWindowIndex(0)
println(WebUI.getWindowTitle())
println(WebUI.getUrl())