import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import java.util.Arrays as Arrays
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

// **Klik Dropdown**
TestObject dropdownAlternative = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    '//div[contains(@class, \'MuiSelect-select\')]')

WebUI.click(dropdownAlternative)

// **Menunggu Opsi Muncul**
WebUI.delay(2 // Bisa diganti dengan WebUI.waitForElementVisible() jika opsi punya TestObject
    )

// **Klik Opsi 5**
TestObject option5 = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '//li[text()="5"]')

WebUI.waitForElementVisible(option5, 2)

WebUI.click(option5)

// **Klik Dropdown Lagi untuk Pilih Opsi 10**
WebUI.click(dropdownAlternative)

WebUI.delay(1)

// **Klik Opsi 10 dengan JavaScript**
TestObject option10 = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '//li[text()="10"]')

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(WebUiCommonHelper.findWebElement(option10, 5)))

// **Klik Dropdown Lagi untuk Pilih Opsi 25**
WebUI.click(dropdownAlternative)

WebUI.delay(1)

// **Klik Opsi 25 dengan JavaScript**
TestObject option25 = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '//li[text()="25"]')

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(WebUiCommonHelper.findWebElement(option25, 5)))

// **Menunggu Data Muncul**
WebUI.delay(1 // Pastikan data sudah ter-load sebelum verifikasi
    // Pastikan data sudah ter-load sebelum verifikasi
    )

// **Verifikasi Jumlah Data yang Ditampilkan adalah 25**
TestObject tableRows = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '//table/tbody/tr')

List<WebElement> rows = WebUiCommonHelper.findWebElements(tableRows, 5)

int jumlahData = rows.size()

println('Jumlah data yang ditemukan: ' + jumlahData)

// **Validasi Jika Data Tidak 25**
if (jumlahData == 25) {
    WebUI.comment('✅ Jumlah data yang ditampilkan sudah benar (25).' // Ambil screenshot jika gagal
        )
} else {
    WebUI.comment('❌ ERROR: Jumlah data tidak sesuai! Ditemukan: ' + jumlahData)

    WebUI.takeScreenshot()
}

WebUI.click(findTestObject('SemuaHalaman/Page_HADIR/button_Reset'))

