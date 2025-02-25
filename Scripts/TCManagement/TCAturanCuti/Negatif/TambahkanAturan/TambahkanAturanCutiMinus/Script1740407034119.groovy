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

import java.nio.file.Files
import java.nio.file.Paths

// **1. Buat timestamp unik untuk screenshot**
String timestamp = new SimpleDateFormat('yyyyMMdd_HHmmss').format(new Date())

// **2. Buat path folder screenshot secara dinamis**
String screenshotDir = System.getProperty("user.dir") + "/Screenshots/Management/AturanCuti/Minus/"

// **3. Pastikan folder ada, jika tidak buat folder baru**
if (!Files.exists(Paths.get(screenshotDir))) {
	Files.createDirectories(Paths.get(screenshotDir))
}
// **2. Klik tombol untuk menambahkan aturan cuti**
WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_Tambahkan Aturan Cuti'))

// **3. Isi form dengan data negatif**
WebUI.setText(findTestObject('Object Repository/ManagemenHalaman/input_Nama Aturan Cuti_name'), 'Test Bug Cuti Minus')

WebUI.setText(findTestObject('Object Repository/ManagemenHalaman/input_Eligible Pengaturan Cuti (Bulan)_elig_9860f4'), '-1')

WebUI.setText(findTestObject('Object Repository/ManagemenHalaman/input_Maksimal Sisa Cuti_max_carry_forward'), '-2')

WebUI.setText(findTestObject('Object Repository/ManagemenHalaman/input_Jumlah Bulan Kerja Sisa Cuti_carry_fo_08b2bb'), '-99')

// **4. Screenshot sebelum klik tombol submit**
String beforeSubmitPath = ((screenshotDir + 'before_submit_') + timestamp) + '.png'

WebUI.takeScreenshot(beforeSubmitPath)

WebUI.comment('📸 Screenshot sebelum submit: ' + beforeSubmitPath)

// **5. Klik tombol submit**
WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_Tambahkan'))

// **6. Verifikasi apakah pesan error muncul**
boolean isErrorDisplayed = WebUI.verifyTextPresent('Input tidak valid', false, FailureHandling.CONTINUE_ON_FAILURE)

// **7. Screenshot saat verifikasi error**
String afterSubmitPath = ((screenshotDir + 'after_submit_') + timestamp) + '.png'

WebUI.takeScreenshot(afterSubmitPath)

WebUI.comment('📸 Screenshot setelah submit: ' + afterSubmitPath)

// **8. Log status validasi**
if (isErrorDisplayed) {
    WebUI.comment('✅ Validasi UI berjalan: Sistem menampilkan error.')
} else {
    WebUI.comment('❌ BUG: Tidak ada pesan error yang muncul.')
}

