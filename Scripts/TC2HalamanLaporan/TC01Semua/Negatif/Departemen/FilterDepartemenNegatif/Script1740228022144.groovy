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
import java.text.SimpleDateFormat
import java.util.Date

String folderPath = 'D:/JuaraCoding/katalon/ErrorSS/Hadir/Semua/Departemen/'
String timestamp = new SimpleDateFormat('yyyyMMdd_HHmmss').format(new Date())

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/div_Laporan'))
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/div_Semua'))

WebUI.delay(2)
WebUI.click(findTestObject('SemuaHalaman/Page_HADIR/button__MuiButtonBase-root MuiButton-root M_9b21ec'))

// Isi filter dengan nama "Security"
WebUI.setText(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/input_Unit_job_departement'), 'Security')

// Ambil screenshot sebelum tombol "Terapkan" diklik
String screenshotPathBefore = folderPath + 'Before_Terapkan_' + timestamp + '.png'
WebUI.takeScreenshot(screenshotPathBefore)
println('Screenshot sebelum Terapkan diambil: ' + screenshotPathBefore)

// Klik tombol "Terapkan"
WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/button_Terapkan'))

WebUI.delay(2)

// Periksa apakah elemen "Tidak Ada Data" muncul
boolean isDataNotFound = WebUI.verifyElementPresent(findTestObject('ManagemenHalaman/b_Tidak Ada Data'), 2, FailureHandling.OPTIONAL)

// Periksa apakah teks "Security" ditemukan
boolean isSecurityPresent = WebUI.verifyTextPresent('Security', false, FailureHandling.OPTIONAL)

if (isDataNotFound && !isSecurityPresent) {
    // Ambil screenshot jika data tidak ditemukan dan "Security" tidak muncul
    String screenshotPath = folderPath + 'Error_DataNotFound_' + timestamp + '.png'
    WebUI.takeScreenshot(screenshotPath)
    println('Test gagal! Tidak ada data dan "Security" tidak ditemukan. Screenshot disimpan di: ' + screenshotPath)
    assert false // Mark test as failed
} else {
    // Klik pada hasil jika ditemukan
    WebUI.click(findTestObject('Object Repository/SemuaHalaman/Page_HADIR/h6_Sysmex'))
}

WebUI.scrollToPosition(0, 500)
WebUI.delay(2)
