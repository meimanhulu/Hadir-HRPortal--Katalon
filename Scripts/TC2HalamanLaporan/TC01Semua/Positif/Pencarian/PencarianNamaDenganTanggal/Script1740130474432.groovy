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

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/div_Laporan'))

WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/div_Semua'))

WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_Start Date_MuiButtonBase-root MuiIco_4f75ca'))

WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_1'))

WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_28'))

WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_save'))

WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_Search'))

WebUI.setText(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/input_Search_search'), 'Momo')

WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_Search'))

// Verifikasi bahwa hasil pencarian menampilkan nama "Momo"
WebUI.verifyElementText(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/h6_Momo'), 'Momo')

