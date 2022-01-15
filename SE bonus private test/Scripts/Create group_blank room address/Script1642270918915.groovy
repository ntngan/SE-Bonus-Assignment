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

WebUI.click(findTestObject('Object Repository/Page_Element/a_Sign In (14)'))

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Sign in with_username (15)'), 'yes_yes')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Username_password (15)'), 'jMiN+Qtu4gD0Iloo12uvRg==')

WebUI.click(findTestObject('Object Repository/Page_Element/input_Forgot password_mx_Login_submit (15)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Verify this device_mx_AccessibleButton _90ce45 (14)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Ill verify later (14)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Rooms_mx_AccessibleButton mx_RoomSublis_27fc2e (1)'))

WebUI.click(findTestObject('Object Repository/Page_Element/span_Create new room'))

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Create a private room_mx_Field_4 (2)'), 'test_publicGroup_noRoomAddress')

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Name_mx_Field_5 (1)'), 'math')

WebUI.click(findTestObject('Object Repository/Page_Element/div_Private room (invite only) (2)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Public room (1)'))

WebUI.click(findTestObject('Object Repository/Page_Element/button_Create Room (3)'))

WebUI.closeBrowser()

