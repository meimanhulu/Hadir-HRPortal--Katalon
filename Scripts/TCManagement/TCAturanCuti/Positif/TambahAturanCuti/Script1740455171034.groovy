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

WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_Tambahkan Aturan Cuti'))

WebUI.setText(findTestObject('Object Repository/ManagemenHalaman/input_Nama Aturan Cuti_name'), 'Cuti Hamil')

WebUI.setText(findTestObject('Object Repository/ManagemenHalaman/input_Eligible Pengaturan Cuti (Bulan)_elig_9860f4'), '3')

WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_Tanggal Batas Sisa Cuti_MuiButtonBas_811cb7'))

WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_17'))

WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_Bulan Batas Sisa Cuti_MuiButtonBase-_111390'))

WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_Agt'))

WebUI.setText(findTestObject('Object Repository/ManagemenHalaman/input_Maksimal Sisa Cuti_max_carry_forward'), '8')

WebUI.setText(findTestObject('Object Repository/ManagemenHalaman/input_Jumlah Bulan Kerja Sisa Cuti_carry_fo_08b2bb'), '2')

WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_Tambahkan'))

WebUI.verifyElementText(findTestObject('Object Repository/ManagemenHalaman/div_Sukses Membuat Aturan Cuti'), 'Sukses Membuat Aturan Cuti')

WebUI.verifyElementText(findTestObject('Object Repository/ManagemenHalaman/p_Cuti Hamil'), 'Cuti Hamil')

