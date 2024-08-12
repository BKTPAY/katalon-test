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


Mobile.startApplication('/Data Files/epara.apk', true)

WebUI.delay(200)

Mobile.tap(findTestObject('Object Repository/Login Success/android.widget.TextView - Vijo'), 0)

WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/Login Success/android.widget.TextView - Hyr'), 0)

WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/Login Success/android.widget.TextView - e-mail'), 0)

Mobile.tap(findTestObject('Object Repository/Login Success/android.widget.EditText - e-mail'), 0)

Mobile.setText(findTestObject('Object Repository/Login Success/android.widget.EditText - e-mail (1)'), 'anilserin@hotmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Login Success/android.widget.EditText - Fjalkalimi (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Login Success/android.widget.EditText - Fjalkalimi (1)'), '616223', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Login Success/android.widget.TextView - Hyr (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login Success/android.view.ViewGroup (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Login Success/android.view.ViewGroup (1)'), '123456', 0)

WebUI.delay(3)

Mobile.verifyElementText(findTestObject('Object Repository/Login Success/android.widget.TextView - TOTALI'), 'TOTALI')

