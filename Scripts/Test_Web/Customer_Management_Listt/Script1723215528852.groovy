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

WebUI.navigateToUrl('https://auth-uat.epara.app/auth/realms/backoffice-realm/protocol/openid-connect/auth?client_id=wallet-ui&redirect_uri=https%3A%2F%2Fbackofficeui-uat.epara.app%2F&state=abb9a0ed-1827-491f-8407-4a05506aaa12&response_mode=fragment&response_type=code&scope=openid&nonce=ffc969da-2673-4b3c-849d-e5cae756b071&code_challenge=0izcAaGALJ94G8EJpAN-_mk_0my7CGhu54vC3XQE_0w&code_challenge_method=S256')

WebUI.setText(findTestObject('Object Repository/Customer_Management_List/Page_E-Para Backoffice/input_E-mail_username'),
	'ozlem.ozdemir@finartz.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Customer_Management_List/Page_E-Para Backoffice/input_Password_password'),
	'JRVbc697Q+q9cSOs8Xgkxw==')

WebUI.click(findTestObject('Object Repository/Customer_Management_List/Page_E-Para Backoffice/input_Forgot Password_login'))
WebUI.delay(8)
WebUI.click(findTestObject('Object Repository/Customer_Management_List/Page_E-Para Backoffice/div_Customer Management'))
WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Customer_Management_List/Page_E-Para Backoffice/div_Individual'))
WebUI.delay(8)

WebUI.verifyElementText(findTestObject('Object Repository/Customer_Management_List/Page_E-Para Backoffice/span_List'), 'List')
WebUI.delay(8)

WebUI.closeBrowser()

