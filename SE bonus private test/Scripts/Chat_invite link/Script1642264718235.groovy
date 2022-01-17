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

WebUI.navigateToUrl('https://matrix.to/#/@nono_nono:matrix.org')

WebUI.click(findTestObject('Object Repository/Page_Youre invited to talk on Matrix/input_Ask every time_primary fullwidth'))

WebUI.click(findTestObject('Object Repository/Page_Youre invited to talk on Matrix/a_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Youre invited to talk on Matrix/a_Continue in your browser'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Message'))

WebUI.click(findTestObject('Object Repository/Page_Element/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Sign in with_username'), 'yes_yes')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Username_password'), 'jMiN+Qtu4gD0Iloo12uvRg==')

WebUI.click(findTestObject('Object Repository/Page_Element/input_Forgot password_mx_Login_submit'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Verify this login_mx_AccessibleButton m_da0542'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Ill verify later'))

WebUI.navigateToUrl('https://matrix.to/#/@nono_nono:matrix.org')

WebUI.click(findTestObject('Object Repository/Page_Youre invited to talk on Matrix/a_Continue_1'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Message'))

WebUI.closeBrowser()

