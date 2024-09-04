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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import java.util.HashMap



// Set these capabilities using RunConfiguration
RunConfiguration.setDriverPreferencesProperty("Android", "appium:skipDeviceInitialization", true)
RunConfiguration.setDriverPreferencesProperty("Android", "appium:skipServerInstallation", true)
RunConfiguration.setDriverPreferencesProperty("Android", "appium:androidInstallTimeout", 200000)
RunConfiguration.setDriverPreferencesProperty("Android", "appium:uiautomator2ServerInstallTimeout", 200000)
RunConfiguration.setDriverPreferencesProperty("Android", "uiautomator2ServerInstallTimeout", 200000)


WebUI.delay(35)


def path = RunConfiguration.getProjectDir() + '/Data Files/epara3.apk'

Mobile.startApplication(path, true)

Mobile.delay(33)

Mobile.tap(findTestObject('Object Repository/ALB-KSV_Check/android.widget.TextView - Shqipria'), 0)

Mobile.delay(33)

Mobile.tap(findTestObject('Object Repository/ALB-KSV_Check/android.widget.TextView - Vazhdo'), 0)

Mobile.delay(33)

Mobile.tap(findTestObject('Object Repository/Login Success/android.widget.TextView - Vijo'), 0)

Mobile.delay(33)

Mobile.tap(findTestObject('Object Repository/Login Success/android.widget.TextView - Hyr'), 0)

Mobile.delay(23)

Mobile.tap(findTestObject('Object Repository/Login Success/android.widget.TextView - e-mail'), 0)
Mobile.delay(23)

Mobile.tap(findTestObject('Object Repository/Login Success/android.widget.EditText - e-mail'), 0)


Mobile.delay(23)

Mobile.setText(findTestObject('Object Repository/Login Success/android.widget.EditText - e-mail (1)'), 'anilserin@hotmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Login Success/android.widget.EditText - Fjalkalimi (1)'), 0)
Mobile.delay(11)


Mobile.setText(findTestObject('Object Repository/Login Success/android.widget.EditText - Fjalkalimi (1)'), '616223', 0)

Mobile.hideKeyboard()
Mobile.delay(11)

Mobile.tap(findTestObject('Object Repository/Login Success/android.widget.TextView - Hyr (1)'), 0)
Mobile.delay(11)


Mobile.tap(findTestObject('Object Repository/Login Success/android.view.ViewGroup (1)'), 0)
Mobile.delay(11)

Mobile.setText(findTestObject('Object Repository/Login Success/android.view.ViewGroup (1)'), '123456', 0)

Mobile.delay(11)

Mobile.verifyElementText(findTestObject('Object Repository/Login Success/android.widget.TextView - TOTALI'), 'TOTALI')

