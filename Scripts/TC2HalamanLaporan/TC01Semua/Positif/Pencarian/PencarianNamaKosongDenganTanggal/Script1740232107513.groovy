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
String folderPath = "D:/JuaraCoding/katalon/ErrorSS/Hadir/Semua/Pencarian/"

WebUI.delay(3)

// Navigasi ke halaman laporan
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/div_Laporan'))
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/div_Semua'))

// Pilih tanggal
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_Start Date_MuiButtonBase-root MuiIco_4f75ca'))
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_1'))
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_28'))
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_save'))

// Klik tombol pencarian
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_Search'))

// Masukkan nama "Momo" dan cari
WebUI.setText(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/input_Search_search'), 'Momo')
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_Search'))

try {
	// Verifikasi bahwa hasil pencarian menampilkan nama "Momo"
	WebUI.verifyElementText(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/h6_Momo'), 'Momo')
} catch (Exception e) {
	// Ambil screenshot jika gagal
	WebUI.takeScreenshot(folderPath + "Error_Verifikasi_Momo.png")
	throw e // Tetap lempar error agar test gagal
}

// Hapus input pencarian dan cari ulang
WebUI.clearText(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/input_Search_search'))
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_Search'))

try {
	// Verifikasi bahwa "Momo" tidak muncul lagi dalam hasil pencarian
	WebUI.verifyElementNotPresent(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/h6_Momo'), 5)
} catch (Exception e) {
	// Ambil screenshot jika hasil masih muncul
	WebUI.takeScreenshot(folderPath + "Error_Momo_Masih_Ada.png")
	throw e // Tetap lempar error agar test gagal
}
