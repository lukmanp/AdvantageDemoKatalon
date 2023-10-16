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

Mobile.tap(findTestObject('Advantage/Login/Dont have acc'), 0)

Mobile.setText(findTestObject('Advantage/Sign Up Page/Username type box (Sign up)'), 'jesikajodi44', 0)

Mobile.setText(findTestObject('Advantage/Sign Up Page/Email type box (Sign up)'), 'jesikajoss@gmail.com', 0)

Mobile.setText(findTestObject('Advantage/Sign Up Page/Password type box (Sign up)'), 'jeje123J', 0)

Mobile.setText(findTestObject('Advantage/Sign Up Page/Confirm Passsword Type box (Sign up)'), 'jeje123J', 0)

Mobile.setText(findTestObject('Advantage/Sign Up Page/First name type box (Sign up)'), 'Jesika', 0)

Mobile.setText(findTestObject('Advantage/Sign Up Page/Last name type box (Sign up)'), 'Jodi', 0)

Mobile.setText(findTestObject('Advantage/Sign Up Page/Phone number type box (Sign up)'), '08128363892', 0)

Mobile.tap(findTestObject('Advantage/Sign Up Page/Country type box (Sign up)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Indonesia')

Mobile.tap(findTestObject('Advantage/Sign Up Page/Country Indonesia'), 0)

Mobile.setText(findTestObject('Advantage/Sign Up Page/State type box (Sign Up)'), 'DKI Jakarta', 0)

Mobile.scrollToText('REGISTER', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Advantage/Sign Up Page/Address type box'), 'Jl. Kesuksesan', 0)

Mobile.setText(findTestObject('Advantage/Sign Up Page/City type box (Sign up)'), 'Jakarta Utara', 0)

Mobile.setText(findTestObject('Advantage/Sign Up Page/ZIP type box (Sign up)'), '67546', 0)

Mobile.tap(findTestObject('Advantage/Sign Up Page/Button Register'), 0)

