import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
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

// **Logger untuk mencatat error di laporan Katalon**
KeywordLogger log = new KeywordLogger()

// **Direktori untuk Menyimpan Screenshot Error (Opsional)**
String errorFolder = 'D:\\JuaraCoding\\katalon\\ErrorSS\\Hadir\\Managemen\\AturanCuti'

// **Klik Dropdown**
TestObject dropdownAlternative = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    '//div[contains(@class, \'MuiSelect-select\')]')

WebUI.click(dropdownAlternative)

// **Menunggu Opsi Muncul**
WebUI.delay(2)

// **Klik Opsi 5**
TestObject option5 = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '//li[text()="5"]')

WebUI.waitForElementVisible(option5, 5)

WebUI.click(option5)

// **Verifikasi Jumlah Data dalam Tabel (5)**
TestObject tableRows = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '//table/tbody/tr')

List<WebElement> rows5 = WebUiCommonHelper.findWebElements(tableRows, 5)

println('Jumlah data setelah pilih 5: ' + rows5.size())

if (rows5.size() != 5) {
    WebUI.comment(('❌ Verifikasi Gagal: Ditemukan ' + rows5.size()) + ' data, mengambil screenshot...')

    WebUI.scrollToPosition(0, 550)

    WebUI.takeScreenshot( // Screenshot otomatis masuk ke laporan HTML
        )

    KeywordUtil.markFailed(('❌ Verifikasi Gagal! Ditemukan: ' + rows5.size()) + ' data setelah memilih 5.')
}

// **Lanjutkan ke Opsi 10**
WebUI.click(dropdownAlternative)

WebUI.delay(1)

// **Klik Opsi 10**
TestObject option10 = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '//li[text()="10"]')

WebUI.waitForElementVisible(option10, 5)

WebUI.click(option10)

// **Verifikasi Jumlah Data dalam Tabel (10)**
List<WebElement> rows10 = WebUiCommonHelper.findWebElements(tableRows, 5)

println('Jumlah data setelah pilih 10: ' + rows10.size())

if (rows10.size() != 10) {
    WebUI.comment(('❌ Verifikasi Gagal: Ditemukan ' + rows10.size()) + ' data, mengambil screenshot...')

    WebUI.takeScreenshot( // Screenshot otomatis masuk ke laporan HTML
        )

    KeywordUtil.markFailed(('❌ Verifikasi Gagal! Ditemukan: ' + rows10.size()) + ' data setelah memilih 10.')
}

// **🚀 Browser Tetap Terbuka untuk Test Case Selanjutnya**
println('✅ Selesai! Browser tetap terbuka untuk test case berikutnya.')

