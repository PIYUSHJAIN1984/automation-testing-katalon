import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://data-momentum-7717.my.salesforce.com/')

WebUI.setText(findTestObject('Object Repository/Page_Login  Salesforce/input_Username_username'), 'piyushmnit-tt7f@force.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_password'), 'gS/5CWqqSBMvOLDqFuE/lQ==')

WebUI.click(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_Login'))

// WebUI.setText(findTestObject('Object Repository/Page_Verify Your Identity  Salesforce/input_Verification Code_emc'), '482663')
//WebUI.click(findTestObject('Object Repository/Page_Verify Your Identity  Salesforce/input_Verification Code_RememberDeviceCheckbox'))
// WebUI.click(findTestObject('Object Repository/Page_Verify Your Identity  Salesforce/input_Verification Code_save'))
WebUI.click(findTestObject('Object Repository/Page_Home  Salesforce/button_Search'))

WebUI.delay(120)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home  Salesforce/input_Search_input-151'), '')

WebUI.click(findTestObject('Page_Home  Salesforce/img'))

Windows.click(findTestObject('Page_Recently Viewed  Accounts  Salesforce/a_testone'))

Windows.verifyElementPresent(findTestObject('Page_testone  Account  Salesforce/lightning-formatted-text_testone'), 0)

WebUI.closeBrowser()

