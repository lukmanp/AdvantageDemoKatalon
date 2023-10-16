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

Mobile.startApplication('AndroidApp/Advantagedemo3.2.apk', false)

Mobile.scrollToText('Mice', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Advantage/Menu/Mice menu'), 0)

Mobile.scrollToText('MICROSOFT SCULPT TOUCH MOUSE', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Advantage/Layout Product Page/Item mice'), 0)

Mobile.tap(findTestObject('Advantage/Item View/Item mice (datails)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Advantage/Item View/Add to cart Button'), 0)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Advantage/Menu/Search'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Advantage/Menu/Search'), 'Notebook', 0)

Mobile.tap(findTestObject('Advantage/Menu/Icon search'), 0)

Mobile.tap(findTestObject('Advantage/Layout Product Page/Item notebook'), 0)

Mobile.tap(findTestObject('Advantage/Item View/Add to cart Button'), 0)

Mobile.tap(findTestObject('Advantage/Shopping Cart/Icon cart'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Advantage/Shopping Cart/Button Checkout'), 0)

Mobile.tap(findTestObject('Advantage/Payment Method Page/Pay now button (Payment)'), 0)

