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

WebUI.navigateToUrl('file:///C:/Users/pc/Desktop/AURORA/Owner/Owner.html')

WebUI.setText(findTestObject('Object Repository/Page_Document/input_Name Hotel_name'), 'Ddoha')

WebUI.setText(findTestObject('Object Repository/Page_Document/input_Phone Number_phone'), '0123456789')

WebUI.setText(findTestObject('Object Repository/Page_Document/input_Address_address'), 'Nguyen van cu,phuong 14, quan5, tphcm')

WebUI.click(findTestObject('Object Repository/Page_Document/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_Booking tours and resort/input_SIGN UP_search'))

