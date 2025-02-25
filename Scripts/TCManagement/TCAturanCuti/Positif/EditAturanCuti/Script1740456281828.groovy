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

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_Aksi_MuiButtonBase-root MuiIconButto_5ee4e8'))

WebUI.click(findTestObject('Object Repository/ManagemenHalaman/li_Edit'))

WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_Tanggal Batas Sisa Cuti_MuiButtonBas_811cb7'))

WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_20'))

WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_Simpan'))

WebUI.verifyElementText(findTestObject('Object Repository/ManagemenHalaman/div_Sukses Mengubah Aturan Cuti'), 'Sukses Mengubah Aturan Cuti')

