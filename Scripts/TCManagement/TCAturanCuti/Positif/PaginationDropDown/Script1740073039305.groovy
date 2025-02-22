import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import java.util.Arrays as Arrays

WebUI.click(findTestObject('Object Repository/test/div_Management'))

WebUI.click(findTestObject('Object Repository/test/div_Aturan Cuti'))

// **Klik Dropdown**
TestObject dropdownAlternative = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    '//div[contains(@class, \'MuiSelect-select\')]')

WebUI.click(dropdownAlternative)

// **Menunggu Opsi Muncul**
WebUI.delay(2 // Bisa diganti dengan WebUI.waitForElementVisible() jika opsi punya TestObject
    )

// **Klik Opsi 5 (Metode 1 - Klik Langsung Jika Bisa)**
TestObject option5 = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '//li[text()="5"]')

WebUI.waitForElementVisible(option5, 5)

WebUI.click(option5)

// **Klik Dropdown Lagi untuk Pilih Opsi 10**
WebUI.click(dropdownAlternative)

WebUI.delay(1)

// **Klik Opsi 10 (Metode 2 - JavaScript Klik Jika Tidak Bisa Diklik Biasa)**
TestObject option10 = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '//li[text()="10"]')

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(WebUiCommonHelper.findWebElement(option10, 5)))

// **Klik Dropdown Lagi untuk Pilih Opsi 25**
WebUI.click(dropdownAlternative)

WebUI.delay(1)

// **Klik Opsi 10 (Metode 2 - JavaScript Klik Jika Tidak Bisa Diklik Biasa)**
TestObject option25 = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '//li[text()="25"]')

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(WebUiCommonHelper.findWebElement(option25, 5)))

WebUI.scrollToPosition(0, 1000)

WebUI.delay(5)

WebUI.closeBrowser()

