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

WebUI.click(findTestObject('Page_Element/a_Create Account'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Continue with_mx_AccessibleButton mx_SS_da05a4'))

WebUI.click(findTestObject('Object Repository/Page_Authorize application/button_Authorize matrix-org'))

WebUI.setText(findTestObject('Object Repository/Page_Create your account/input__username'), 'signup_git')

WebUI.click(findTestObject('Object Repository/Page_Create your account/input_matrix.org_primary-button'))

WebUI.click(findTestObject('Object Repository/Page_Agree to terms and conditions/input_signup_gitmatrix.org_accepted_version'))

WebUI.click(findTestObject('Object Repository/Page_Agree to terms and conditions/input_terms and conditions_primary-button'))

WebUI.click(findTestObject('Object Repository/Page_Continue to your account/a_Continue'))

WebUI.closeBrowser()

