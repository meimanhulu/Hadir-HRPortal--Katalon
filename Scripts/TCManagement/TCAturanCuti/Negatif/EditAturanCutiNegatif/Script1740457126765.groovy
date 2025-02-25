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

// **1. Klik tombol aksi untuk membuka menu edit**
WebUI.refresh()

WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_Aksi_MuiButtonBase-root MuiIconButto_5ee4e8'))

// **2. Klik opsi Edit dari menu yang muncul**
WebUI.click(findTestObject('Object Repository/ManagemenHalaman/li_Edit'))

// **3. Kosongkan input Nama Aturan Cuti**
TestObject inputNamaAturanCuti = findTestObject('Object Repository/ManagemenHalaman/input_Nama Aturan Cuti_name')

// **4. Hapus teks yang ada dengan clearText()**
WebUI.clearText(inputNamaAturanCuti)

// **5. Gunakan sendKeys untuk memastikan input benar-benar kosong**
WebUI.sendKeys(inputNamaAturanCuti, Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

// **6. Tambahkan setText('') sebagai langkah tambahan**
WebUI.setText(inputNamaAturanCuti, '')

// **7. Klik tombol Simpan**
WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_Simpan'))

// **8. Verifikasi bahwa validasi muncul jika input kosong**
boolean isValidationDisplayed = WebUI.verifyElementPresent(findTestObject('Object Repository/ManagemenHalaman/p_Nama aturan cuti harus diisi'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

if (isValidationDisplayed) {
    WebUI.comment('✅ Validasi berjalan dengan benar: Pesan error muncul saat input kosong.')
} else {
    WebUI.comment('❌ BUG: Pesan error tidak muncul ketika input dikosongkan!')
}

// **9. Klik tombol Tutup jika validasi berhasil**
if (isValidationDisplayed) {
    WebUI.click(findTestObject('Object Repository/ManagemenHalaman/button_Tutup'))
}

