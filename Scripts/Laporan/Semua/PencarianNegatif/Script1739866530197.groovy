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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Semua/Page_HADIR/div_Laporan'))

WebUI.click(findTestObject('Semua/Page_HADIR/p_Semua'))

WebUI.setText(findTestObject('Object Repository/Semua/Page_HADIR/input_Search_search'), 'abcxyz')

WebUI.click(findTestObject('Semua/Page_HADIR/button_Search'))

WebUI.click(findTestObject('Semua/Page_HADIR/p_0-0 of 0'))
// Verifikasi apakah objek "0-0 of 0" ada di halaman
boolean isObjectPresent = WebUI.verifyElementPresent(findTestObject('Semua/Page_HADIR/p_0-0 of 0'), 3, FailureHandling.CONTINUE_ON_FAILURE)

// Jika objek ada, klik
if (isObjectPresent) {
	WebUI.click(findTestObject('Semua/Page_HADIR/p_0-0 of 0'))
	println('✅ Objek "0-0 of 0" berhasil diverifikasi dan diklik.')
} else {
	println('❌ Objek "0-0 of 0" tidak ditemukan!')
	WebUI.takeScreenshot()
	assert false
}

