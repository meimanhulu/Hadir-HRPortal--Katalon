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

WebUI.click(findTestObject('Object Repository/Semua/Page_HADIR/div_Laporan'))

WebUI.click(findTestObject('Object Repository/Semua/Page_HADIR/div_Semua'))

WebUI.delay(2)

WebUI.click(findTestObject('Semua/Page_HADIR/button__MuiButtonBase-root MuiButton-root M_9b21ec'))

// Isi filter dengan nama "Sysmex"
WebUI.setText(findTestObject('Object Repository/Semua/Page_HADIR/input_Unit_job_departement'), 'Sysmex')

// Klik pilihan dari dropdown
WebUI.clickOffset(findTestObject('Semua/Page_HADIR/li_Sysmex'), 0, 0)

WebUI.delay(2)

// Klik tombol "Terapkan"
WebUI.click(findTestObject('Object Repository/Semua/Page_HADIR/button_Terapkan'))

WebUI.delay(2)

// Verifikasi bahwa elemen hasil benar-benar menampilkan teks "Sysmex"
WebUI.verifyElementText(findTestObject('Object Repository/Semua/Page_HADIR/h6_Sysmex'), 'Sysmex')

// Klik pada hasil untuk memastikan elemen dapat diakses
WebUI.click(findTestObject('Object Repository/Semua/Page_HADIR/h6_Sysmex'))

