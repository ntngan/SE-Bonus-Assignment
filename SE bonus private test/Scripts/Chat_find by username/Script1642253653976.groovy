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

WebUI.click(findTestObject('Object Repository/Page_Element/a_Sign In (7)'))

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Sign in with_username (8)'), 'yes_yes')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Username_password (8)'), 'jMiN+Qtu4gD0Iloo12uvRg==')

WebUI.click(findTestObject('Object Repository/Page_Element/input_Forgot password_mx_Login_submit (8)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Verify this device_mx_AccessibleButton _90ce45 (7)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Ill verify later (7)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_People_mx_AccessibleButton mx_RoomSubli_de75e7 (4)'))

WebUI.setText(findTestObject('Object Repository/Page_Element/input_yes_yesmatrix.org_focus-visible (3)'), 'nono_nono')

WebUI.click(findTestObject('Object Repository/Page_Element/div_Nnono_nononono_nonomatrix.org10 minutes ago'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Go (3)'))

WebUI.click(findTestObject('Object Repository/Page_Element  nono_nono/div'))

WebUI.setText(findTestObject('Object Repository/Page_Element  nono_nono/div_test chat by finding account_mx_BasicMe_cbca2a (1)'), 
    '<div style=""><br></div>')

WebUI.closeBrowser()

