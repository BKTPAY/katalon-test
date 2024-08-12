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

WebUI.callTestCase(findTestCase('Test_Mobile/Login Success'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.ImageView'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Create a business account'),
	0)

WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Business type'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Sole Proprietorship'),
	0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Nse vazhdoni, ju keni rn dakord me Termat'),
	0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Vazhdo'), 0)

not_run: Mobile.closeApplication()

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Emri i subjektit'), 0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Emri i subjektit'),
	'ozlem test1', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Emri Tregtar'), 0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Emri Tregtar'), 'test ozlem1',
	0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - NIPT'), 0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - NIPT'), 'Y12567854Y',
	0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Shteti'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Albania'), 0)

WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Tirana'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Rruga'), 0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Rruga'), 'DENEME',
	0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Numri i Godins'), 0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Numri i Godins (1)'),
	'test11', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Kodi Postar'), 0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Kodi Postar (1)'),
	'12345678', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Aktiviteti i biznesit'),
	0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Aktiviteti i biznesit (1)'),
	'deneme', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - e-mail'), 0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - e-mail (1)'), 'ozdemir@finartz.com',
	0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.EditText (5)'), 0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Account/android.widget.EditText (5)'), '689586638', 0)

Mobile.hideKeyboard()
WebUI.delay(1)
Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Data e themelimit te biznesit'),
	0)
WebUI.delay(1)
Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Vazhdo'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Account/android.widget.TextView - Vazhdo'), 0)

//Mobile.closeApplication()

