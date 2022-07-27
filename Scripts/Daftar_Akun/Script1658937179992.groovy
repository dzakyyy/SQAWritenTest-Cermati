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

WebUI.navigateToUrl('https://www.cermati.com/app/gabung')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Input_Email'), 'qwerty@gmail.com')

WebUI.setText(findTestObject('Input_MobilePhone'), '085873623873')

WebUI.setText(findTestObject('Input_Password'), 'Qwerty123')

WebUI.setText(findTestObject('Input_ConfirmPassword'), 'Qwerty123')

WebUI.setText(findTestObject('Input_FirstName'), 'Qwerty')

WebUI.setText(findTestObject('Input_LastName'), 'Uiop')

WebUI.setText(findTestObject('Input_KabupatenKota'), 'jakarta')

WebUI.click(findTestObject('Pilih_KabupatenKota'))

WebUI.check(findTestObject('Checkbox_Approval'))

WebUI.check(findTestObject('Checkbox_Approval'))

WebUI.click(findTestObject('Button_Daftar'))

