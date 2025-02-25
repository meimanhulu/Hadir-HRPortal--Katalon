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

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_Aksi_MuiButtonBase-root MuiIconButto_5ee4e8'))

WebUI.click(findTestObject('Object Repository/ManagemenHalaman/li_Delete'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ManagemenHalaman/p_Apakah anda yakin ingin menghapus aturan _3414cd'), 
    0)

WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_Hapus'))

WebUI.verifyElementText(findTestObject('Object Repository/ManagemenHalaman/div_Berhasil Menghapus Aturan Cuti'), 'Berhasil Menghapus Aturan Cuti')

WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_Berhasil Menghapus Aturan Cuti_MuiBu_6bc29e'))

