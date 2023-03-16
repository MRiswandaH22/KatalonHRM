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

WebUI.click(findTestObject('hrm/Page_OrangeHRM Recruitment/span_Recruitment'))

WebUI.click(findTestObject('Object Repository/hrm/Page_OrangeHRM Recruitment/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/hrm/Page_OrangeHRM Recruitment/button_Add'))

WebUI.getText(findTestObject('hrm/Page_OrangeHRM Recruitment/span_Recruitment'))

WebUI.verifyElementText(findTestObject('hrm/Page_OrangeHRM Recruitment/span_Recruitment'), 'Recruitment')

WebUI.setText(findTestObject('Object Repository/hrm/Page_OrangeHRM Recruitment/input_Full Name_firstName'), 'Muhammad')

WebUI.setText(findTestObject('Object Repository/hrm/Page_OrangeHRM Recruitment/input_Full Name_middleName'), 'Riswanda')

WebUI.setText(findTestObject('Object Repository/hrm/Page_OrangeHRM Recruitment/input_Full Name_lastName'), 'Hasan')

WebUI.click(findTestObject('Object Repository/hrm/Page_OrangeHRM Recruitment/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

WebUI.setText(findTestObject('Object Repository/hrm/Page_OrangeHRM Recruitment/input_Email_oxd-input oxd-input--focus'), 
    'mriswandahasan@gmail.com')

WebUI.setText(findTestObject('Object Repository/hrm/Page_OrangeHRM Recruitment/textarea_Notes_oxd-textarea oxd-textarea--f_0ce0e8'), 
    'asssiap')

WebUI.click(findTestObject('Object Repository/hrm/Page_OrangeHRM Recruitment/button_Save'))

WebUI.verifyElementText(findTestObject('hrm/Page_OrangeHRM Recruitment/candidateName'), 'Muhammad Riswanda Hasan')

WebUI.click(findTestObject('Object Repository/hrm/Page_OrangeHRM Recruitment/div_Application StageNameMuhammad Riswanda _d07a0d'))

WebUI.click(findTestObject('Object Repository/hrm/Page_OrangeHRM Recruitment/div_Application StageNameMuhammad Riswanda _d07a0d'))

WebUI.click(findTestObject('Object Repository/hrm/Page_OrangeHRM Recruitment/p_Paul Collings'))

WebUI.click(findTestObject('Object Repository/hrm/Page_OrangeHRM Recruitment/a_Logout'))

WebUI.closeBrowser()

