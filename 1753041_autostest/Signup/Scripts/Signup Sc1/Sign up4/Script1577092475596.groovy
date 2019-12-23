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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('file:///C:/Users/pc/Desktop/AURORA/signin.html')

WebUI.setText(findTestObject('Page_Document/input_Email_email'), 'dupham@yahoo.com')

'password testchuongtrinh'
WebUI.setEncryptedText(findTestObject('Page_Document/input_Password_password'), '6tgqq7bMwUx2NOhcLQjkjw==')

WebUI.setText(findTestObject('Page_Document/input_First Name_fname'), 'abc')

WebUI.setText(findTestObject('Page_Document/input_Last Name_lname'), 'test')

WebUI.click(findTestObject('Page_Document/input_concat(By signing in I agree to DDOHA_bc6a56'))

WebUI.click(findTestObject('Page_Document/button_Create Acount'))

WebUI.click(findTestObject('Object Repository/Page_Booking tours and resort/input_SIGN UP_search'))

