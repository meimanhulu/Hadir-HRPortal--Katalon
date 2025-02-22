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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

// Buat path folder penyimpanan screenshot jika terjadi error
String folderPath = 'D:/JuaraCoding/katalon/ErrorSS/Hadir/Semua/Departemen/'
String timestamp = new SimpleDateFormat('yyyyMMdd_HHmmss').format(new Date())

// Klik tombol Reset
WebUI.click(findTestObject('SemuaHalaman/Page_HADIR/button_Reset'))
WebUI.delay(2)

// Navigasi ke menu Laporan -> Semua
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/div_Laporan'))
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/div_Semua'))

// Buka filter tanggal
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/svg_Start Date_feather feather-calendar'))
WebUI.delay(2)

// Scroll dan pilih tahun awal dan akhir
WebUI.scrollToPosition(0, 250)
WebUI.selectOptionByValue(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/select_204520442043204220412040203920382037_364d99'), '2023', true)
WebUI.delay(1)
WebUI.clickOffset(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_1'), 2, 2)
WebUI.selectOptionByValue(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/select_204520442043204220412040203920382037_364d99'), '2026', true)
WebUI.clickOffset(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_1'), 1, 1)
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_save'))

// Klik tombol "Search"
WebUI.scrollToPosition(0, 5)
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_Search'))
WebUI.delay(2)

// Buka filter departemen
WebUI.click(findTestObject('SemuaHalaman/Page_HADIR/button__MuiButtonBase-root MuiButton-root M_9b21ec'))
WebUI.delay(1)

// Isi filter dengan nama "Sysmex"
WebUI.setText(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/input_Unit_job_departement'), 'Sysmex')
WebUI.clickOffset(findTestObject('SemuaHalaman/Page_HADIR/li_Sysmex'), 0, 0)

// Screenshot sebelum klik tombol "Terapkan"
String beforeApplyPath = folderPath + 'BeforeApplyFilter_' + timestamp + '.png'
WebUI.takeScreenshot(beforeApplyPath)
println('Screenshot sebelum klik Terapkan disimpan di: ' + beforeApplyPath)

WebUI.delay(2)

// Klik tombol "Terapkan"
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_Terapkan'))
WebUI.delay(2)

// Screenshot setelah klik tombol "Terapkan"
String afterApplyPath = folderPath + 'AfterApplyFilter_' + timestamp + '.png'
WebUI.takeScreenshot(afterApplyPath)
println('Screenshot setelah klik Terapkan disimpan di: ' + afterApplyPath)

// Verifikasi hasil pencarian menampilkan "Sysmex"
boolean isSysmexDisplayed = WebUI.verifyElementText(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/h6_Sysmex'), 'Sysmex', FailureHandling.CONTINUE_ON_FAILURE)

if (!isSysmexDisplayed) {
    // Jika tidak ditemukan, ambil screenshot error
    String screenshotPath = folderPath + 'SysmexNotFound_' + timestamp + '.png'
    WebUI.takeScreenshot(screenshotPath)
    println('Test gagal, screenshot disimpan di: ' + screenshotPath)
    assert false
} else {
    // Klik pada hasil jika ditemukan
    WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/h6_Sysmex'))
}

// Scroll dan reset kembali
WebUI.scrollToPosition(0, 2)
WebUI.delay(2)
WebUI.click(findTestObject('SemuaHalaman/Page_HADIR/button_Reset'))
