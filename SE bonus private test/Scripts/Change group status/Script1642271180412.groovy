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

WebUI.click(findTestObject('Object Repository/Page_Element/a_Sign In (15)'))

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Sign in with_username (16)'), 'yes_yes')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Username_password (16)'), 'jMiN+Qtu4gD0Iloo12uvRg==')

WebUI.click(findTestObject('Object Repository/Page_Element/input_Forgot password_mx_Login_submit (16)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Verify this device_mx_AccessibleButton _90ce45 (15)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Ill verify later (15)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Ttest_create_private_group (2)'))

WebUI.click(findTestObject('Object Repository/Page_Element  test_create_private_group/div_test_create_private_group'))

WebUI.click(findTestObject('Object Repository/Page_Element  test_create_private_group/div_Settings'))

WebUI.click(findTestObject('Object Repository/Page_Element  test_create_private_group/div_Security  Privacy'))

WebUI.click(findTestObject('Object Repository/Page_Element  haha4 and nono_nono/div_Private (invite only)'))

WebUI.click(findTestObject('Object Repository/Page_Element  test_create_private_group/div_Room Settings - test_create_private_gro_1bb296'))

WebUI.closeBrowser()

