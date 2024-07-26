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

WebUI.navigateToUrl('https://auth-dev.epara.app/auth/realms/backoffice-realm/protocol/openid-connect/auth?client_id=wallet-ui&redirect_uri=https%3A%2F%2Fbackofficeui-dev.epara.app%2F&state=35683512-3c68-455f-8c96-a2a67ee6b247&response_mode=fragment&response_type=code&scope=openid&nonce=effcf8fb-10a7-4c94-8558-bfac2d2c9c71&code_challenge=Qqv-S2nSKnMQquGuG-ozo8X0KcCgWMTWKiL4xjtO70Y&code_challenge_method=S256')

WebUI.setText(findTestObject('Object Repository/Success_Logout/Page_E-Para Backoffice/input_E-mail_username'), 'ozlem.ozdemir@finartz.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Success_Logout/Page_E-Para Backoffice/input_Password_password'), 
    'JRVbc697Q+q9cSOs8Xgkxw==')

WebUI.click(findTestObject('Object Repository/Success_Logout/Page_E-Para Backoffice/input_Forgot Password_login'))

WebUI.click(findTestObject('Object Repository/Success_Logout/Page_E-Para Backoffice/div_Logout'))

WebUI.closeBrowser()

