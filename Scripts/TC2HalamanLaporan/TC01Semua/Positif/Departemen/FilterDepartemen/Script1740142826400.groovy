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
import java.nio.file.Files as Files
import java.nio.file.Paths as Paths

// **2. Buat path folder screenshot secara dinamis**
String folderPath = System.getProperty('user.dir') + '/Screenshots/Semua/Departemen/'

// **3. Pastikan folder ada, jika tidak buat folder baru**
if (!(Files.exists(Paths.get(folderPath)))) {
	Files.createDirectories(Paths.get(folderPath))
}

String timestamp = new SimpleDateFormat('yyyyMMdd_HHmmss').format(new Date())

WebUI.delay(1)

// Klik menu Laporan
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/div_Laporan'))

// Klik menu Semua
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/div_Semua'))

WebUI.delay(1)

// Klik filter departemen
WebUI.click(findTestObject('SemuaHalaman/Page_HADIR/button__MuiButtonBase-root MuiButton-root M_9b21ec'))

// Isi filter dengan nama "Sysmex"
WebUI.setText(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/input_Unit_job_departement'), 'Sysmex')

// Klik pilihan dari dropdown
WebUI.clickOffset(findTestObject('SemuaHalaman/Page_HADIR/li_Sysmex'), 0, 0)

WebUI.delay(1)

// Ambil screenshot sebelum klik tombol Terapkan
String beforeApplyPath = ((folderPath + 'BeforeApplyFilter_') + timestamp) + '.png'

WebUI.takeScreenshot(beforeApplyPath)

println('Screenshot sebelum klik Terapkan disimpan di: ' + beforeApplyPath)

// Klik tombol "Terapkan"
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_Terapkan'))

WebUI.delay(1)

// Verifikasi bahwa hasil pencarian menampilkan "Sysmex"
boolean isSysmexDisplayed = WebUI.verifyElementText(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/h6_Sysmex'), 
    'Sysmex', FailureHandling.CONTINUE_ON_FAILURE)

if (!(isSysmexDisplayed)) {
    // Ambil screenshot jika Sysmex tidak ditemukan
    String screenshotPath = ((folderPath + 'SysmexNotFound_') + timestamp) + '.png'

    WebUI.takeScreenshot(screenshotPath)

    println('Test gagal, screenshot disimpan di: ' + screenshotPath)

    // Tandai test sebagai failed tetapi tetap lanjut ke test case berikutnya
    assert false // Klik pada hasil jika ditemukan
} else {
    WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/h6_Sysmex'))
}

WebUI.scrollToPosition(0, 500)

WebUI.delay(1)

