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

not_run: Mobile.startApplication('epara.apk', true)

Mobile.tap(findTestObject('Object Repository/Send_Money_Txn_Detail/android.widget.TextView - Shih t gjitha'), 0)
WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/filter button/com.horcrux.svg.u'), 0)

Mobile.tap(findTestObject('Object Repository/Send_Money_Txn_Detail/android.widget.TextView - Lloji i transaksionit'), 0)

Mobile.tap(findTestObject('Object Repository/Send_Money_Txn_Detail/android.widget.TextView - Drgo Para'), 0)

Mobile.tap(findTestObject('Object Repository/Send_Money_Txn_Detail/android.widget.TextView - Monedha'), 0)

Mobile.tap(findTestObject('Object Repository/Send_Money_Txn_Detail/android.widget.TextView - LEK'), 0)

Mobile.tap(findTestObject('Object Repository/Send_Money_Txn_Detail/android.widget.TextView - Apliko filtrat'), 0)

Mobile.tap(findTestObject('Object Repository/Send_Money_Txn_Detail/android.widget.TextView -'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Send_Money_Txn_Detail/android.widget.TextView - 15.00 Lek'), 
    '15.00 Lekë')

not_run: Mobile.closeApplication()
