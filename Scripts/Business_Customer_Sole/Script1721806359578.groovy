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

WebUI.callTestCase(findTestCase('Login Success'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.widget.ImageView'), 0)
WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.widget.ScrollView'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.widget.TextView - Vazhdo'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText - Business Sole Name'), 0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText - Business Sole Name'), 
    'Sole Legal Name', 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText (2)'), 'Business Name', 
    0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText (3)'), 0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText (3)'), 'H123487643Y', 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.view.ViewGroup (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.view.ViewGroup (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.view.ViewGroup (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.view.ViewGroup (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText (4)'), 0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText (5)'), 'deneme', 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText (3)'), 0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText (6)'), '111222', 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText (5)'), 0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Sole/android.widget.TextView - Kodi Postar'), '123123', 
    0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText'), 'activate', 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText (2)'), 'deneme@finartz.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Business_Customer_Sole/android.widget.EditText (7)'), '689523322', 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.view.ViewGroup (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/com.horcrux.svg.SvgView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.view.ViewGroup (9)'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.view.ViewGroup (8)'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.widget.TextView - Vazhdo'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.widget.TextView - Vazhdo'), 0)

Mobile.tap(findTestObject('Object Repository/Business_Customer_Sole/android.view.ViewGroup (10)'), 0)

Mobile.closeApplication()

