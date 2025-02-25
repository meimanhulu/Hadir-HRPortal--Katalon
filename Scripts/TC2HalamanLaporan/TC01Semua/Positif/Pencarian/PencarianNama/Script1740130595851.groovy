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
String folderPath = System.getProperty('user.dir') + '/Screenshots/Semua/Nama/'

// **3. Pastikan folder ada, jika tidak buat folder baru**
if (!(Files.exists(Paths.get(folderPath)))) {
	Files.createDirectories(Paths.get(folderPath))
}

// Tambahkan timestamp agar nama file unik
String timestamp = new SimpleDateFormat('yyyyMMdd_HHmmss').format(new Date())

// Delay untuk memastikan halaman siap
WebUI.delay(1)

// Klik menu Laporan
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/div_Laporan'))

// Klik menu Semua
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/div_Semua'))

// Input nama karyawan "Momo"
WebUI.setText(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/input_Search_search'), 'Momo')

// Klik tombol Search
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_Search'))

// Verifikasi bahwa hasil pencarian menampilkan nama "Momo"
boolean isTextCorrect = WebUI.verifyElementText(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/h6_Momo'), 'Momo', 
    FailureHandling.CONTINUE_ON_FAILURE)

if (!(isTextCorrect)) {
    // Ambil screenshot hanya jika terjadi error
    String screenshotPath = ((folderPath + 'FailedSearch_') + timestamp) + '.png'

    WebUI.takeScreenshot(screenshotPath)

    println('Test gagal, screenshot disimpan di: ' + screenshotPath)

    // Tandai test case sebagai gagal agar dianggap failed
    assert false
}

