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

WebUI.navigateToUrl('http://localhost:8080/')

WebUI.click(findTestObject('Object Repository/Page_Element/a_Sign In (9)'))

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Sign in with_username (10)'), 'yes_yes')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Username_password (10)'), 'jMiN+Qtu4gD0Iloo12uvRg==')

WebUI.click(findTestObject('Object Repository/Page_Element/input_Forgot password_mx_Login_submit (10)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Verify this device_mx_AccessibleButton _90ce45 (9)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Ill verify later (9)'))

WebUI.click(findTestObject('Object Repository/Page_Youre invited to talk on Matrix/input_Ask every time_primary fullwidth (1)'))

WebUI.click(findTestObject('Object Repository/Page_Youre invited to talk on Matrix/a_Continue (1)'))

WebUI.click(findTestObject('Object Repository/Page_Youre invited to talk on Matrix/a_Continue in your browser (1)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Message (1)'))

WebUI.click(findTestObject('Object Repository/Page_Element/button_Sign In (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Sign in with_username (10)'), 'yes_yes')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Username_password (10)'), 'jMiN+Qtu4gD0Iloo12uvRg==')

WebUI.click(findTestObject('Object Repository/Page_Element/input_Forgot password_mx_Login_submit (10)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Verify this device_mx_AccessibleButton _90ce45 (9)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Ill verify later (9)'))

WebUI.click(findTestObject('Object Repository/Page_Youre invited to talk on Matrix/a_Continue_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Message (1)'))

WebUI.click(findTestObject('Object Repository/Page_Element  hihi1/div (3)'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Element  hihi1/div_test chat by invite link but log in already'))

WebUI.setText(findTestObject('Object Repository/Page_Element  hihi1/div_test chat by invite link _ log in alrea_0d609d'), 
    '<div style=""><br></div>')

WebUI.closeBrowser()

