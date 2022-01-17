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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/')

WebUI.click(findTestObject('Page_Element/a_Sign In'))

WebUI.setText(findTestObject('Page_Element/input_Sign in with_username'), 'yes_yes')

WebUI.setEncryptedText(findTestObject('Page_Element/input_Username_password'), 'jMiN+Qtu4gD0Iloo12uvRg==')

WebUI.click(findTestObject('Page_Element/input_Forgot password_mx_Login_submit'))

WebUI.click(findTestObject('Page_Element/div_Verify this device_mx_AccessibleButton _90ce45'))

WebUI.click(findTestObject('Page_Element/div_Ill verify later'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Verify_mx_SpaceButton_icon'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_PublicOpen space for anyone, best for c_08629a'))

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Upload_spaceName'), 'user_public10')

WebUI.setText(findTestObject('Object Repository/Page_Element/input__mx_Field_5'), '')

WebUI.click(findTestObject('Object Repository/Page_Element/div_Create'))

WebUI.closeBrowser()

