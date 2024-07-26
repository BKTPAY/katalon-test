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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

WebUI.callTestCase(findTestCase('Login Success'), [:], FailureHandling.STOP_ON_FAILURE)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

not_run: Mobile.startApplication('/home/vsts/work/1/s/app-release (3).apk', true)

Mobile.tap(findTestObject('Object Repository/Send_Money/android.widget.TextView - Transfero'), 0)

Mobile.tap(findTestObject('Object Repository/Send_Money/android.widget.TextView - Drgo Para'), 0)

WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/Send_Money/android.widget.EditText - emrnumri eparanumr telefoni'), 0)

Mobile.setText(findTestObject('Object Repository/Send_Money/android.widget.EditText - emrnumri eparanumr telefoni (1)'), 
    '406764579', 0)

WebUI.delay(1)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Send_Money/android.widget.TextView - zgn nsal'), 0)

Mobile.tap(findTestObject('Object Repository/Send_Money/android.widget.TextView - 0.00'), 0)

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_5))

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Send_Money/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/Send_Money/android.widget.EditText (1)'), 'Deneme', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Send_Money/android.widget.TextView - Vazhdo'), 0)

Mobile.tap(findTestObject('Object Repository/Send_Money/android.widget.TextView - Konfirmo dhe drgo'), 0)

WebUI.delay(4)

Mobile.verifyElementText(findTestObject('Object Repository/Send_Money/android.widget.TextView - Drgimi i parave u krye me sukses'), 
    'Dërgimi i parave u krye me sukses')

not_run: Mobile.closeApplication()

