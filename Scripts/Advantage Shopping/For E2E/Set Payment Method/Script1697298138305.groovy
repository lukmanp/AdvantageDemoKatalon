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

Mobile.tap(findTestObject('Advantage/Order Payment Page/Payment Method box'), 0)

Mobile.tap(findTestObject('Advantage/Payment Method Page/Card Number type box (Payment)'), 0)

Mobile.clearText(findTestObject('Advantage/Payment Method Page/Card Number type box (Payment)'), 0)

Mobile.setText(findTestObject('Advantage/Payment Method Page/Card Number type box (Payment)'), '516729863927', 0)

Mobile.tap(findTestObject('Advantage/Payment Method Page/CVV type box (Payment)'), 0)

Mobile.clearText(findTestObject('Advantage/Payment Method Page/CVV type box (Payment)'), 0)

Mobile.setText(findTestObject('Advantage/Payment Method Page/CVV type box (Payment)'), '234', 0)

Mobile.tap(findTestObject('Advantage/Payment Method Page/Exp date month type box (Payment)'), 0)

Mobile.selectListItemByLabel(findTestObject('Advantage/Payment Method Page/Select Dialog Month'), '07', 0)

Mobile.tap(findTestObject('Advantage/Payment Method Page/Exp date Year type box'), 0)

Mobile.selectListItemByLabel(findTestObject('Advantage/Payment Method Page/Select Dialog Year'), '2030', 0)

Mobile.tap(findTestObject('Advantage/Payment Method Page/Card holder name'), 0)

Mobile.clearText(findTestObject('Advantage/Payment Method Page/Card holder name'), 0)

Mobile.setText(findTestObject('Advantage/Payment Method Page/Card holder name'), 'Lintani Afina', 0)

Mobile.tap(findTestObject('Advantage/Payment Method Page/Apply button (Payment)'), 0)

