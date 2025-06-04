package portalTool

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import java.util.ResourceBundle.Control
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.exception.StepErrorException
import com.kms.katalon.core.exception.StepFailedException

public class ToolsQA {
	@Keyword
	def openMenu(String menu) {
		//Open menu ini digunakan untuk membuka menu (pas di klik akan muncul dropdown)
		switch(menu) {
			case 'Approval':
				WebUI.waitForElementClickable(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Approval') , GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Approval'), FailureHandling.STOP_ON_FAILURE)
				break

			case 'Approval Matrix':
				WebUI.waitForElementClickable(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Approval Matrix') , GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Approval Matrix'), FailureHandling.STOP_ON_FAILURE)
				break

			case 'Approval Workflow':
				WebUI.scrollToElement(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Approval Workflow'), GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Approval Workflow') , FailureHandling.STOP_ON_FAILURE)
				break

			case 'Audit Trail':
				WebUI.waitForElementClickable(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Audit Trail'), GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Audit Trail'), FailureHandling.STOP_ON_FAILURE)
				break

			case 'Blast Promo':

				break

			case 'Company Limit Charge':
				WebUI.waitForElementClickable(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Company Limit  Charge') , GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Company Limit  Charge') , FailureHandling.STOP_ON_FAILURE)
				break

			case 'Company Management':
				WebUI.waitForElementClickable(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Company Management'), GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Company Management'), FailureHandling.STOP_ON_FAILURE)
				break

			case 'Consolidation Report':

				break

			case 'Customers Segmentation':
				WebUI.waitForElementClickable(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Customers Segmentation') , GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Customers Segmentation'), FailureHandling.STOP_ON_FAILURE)
				break

			case 'FAQ Download':
				WebUI.scrollToElement(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_FAQ Download'), GlobalVariable.TimeOut)
				WebUI.waitForElementClickable(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_FAQ Download'), GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_FAQ Download'), FailureHandling.STOP_ON_FAILURE)
				break

			case 'General Maintenance':
				WebUI.waitForElementClickable(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_General Maintenance'), GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_General Maintenance'), FailureHandling.STOP_ON_FAILURE)
				break

			case 'Global Maintenance':
				WebUI.waitForElementClickable(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Global Maintenance') , GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Global Maintenance'), FailureHandling.STOP_ON_FAILURE)
				break

			case 'Payment Setup':

				break

			case 'Pending Task':
				WebUI.waitForElementClickable(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Pending Task'), GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Pending Task'), FailureHandling.STOP_ON_FAILURE)
				break

			case 'Promo Management':
				WebUI.scrollToElement(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Promo Management'), GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.waitForElementClickable(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Promo Management') , GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Promo Management'), FailureHandling.STOP_ON_FAILURE)
				break

			case 'Settings':
				WebUI.waitForElementClickable(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Settings'), GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Settings'), FailureHandling.STOP_ON_FAILURE)
				break

			case 'Utility':
				WebUI.scrollToElement(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Utility'), GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.waitForElementClickable(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Utility'), GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/span_Utility'), FailureHandling.STOP_ON_FAILURE)
				break

			case 'Monitoring & Report':
				WebUI.scrollToElement(findTestObject('Object Repository/IBB Portal/Dashboard/Monitoring and Report/Policy Approval/span_Monitoring and Report'), GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.waitForElementClickable(findTestObject('Object Repository/IBB Portal/Dashboard/Monitoring and Report/Policy Approval/span_Monitoring and Report'), GlobalVariable.TimeOut, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Monitoring and Report/Policy Approval/span_Monitoring and Report'), FailureHandling.STOP_ON_FAILURE)
				break

			default:
				WebUI.comment('Menu Tidak Ditemukan')
				break
		}
	}
	@Keyword
	void clearAllUsingKeyboard(String findTestObj, int switchMode) {
		//keyword ini digunakan untuk clear all text berdasarkan field yang dipilih dengan cara kerjanya ctrl + A lalu backspace
		//Switch Mode = 1 for clear all text in input field
		//Switch Mode = 2 for
		//input[@placeholder = 'Search...' and @type = 'text']
		//yang ditaruh hanya misal "Object Repository/IBB Portal/Dashboard/Utility/User Settings/input_Bank User Settings"
		TestObject testObject = findTestObject(findTestObj)
		switch (switchMode) {
			case 1:
				WebUI.click(testObject)
				WebUI.sendKeys(testObject, Keys.chord(Keys.CONTROL, "a"))
				WebUI.sendKeys(testObject, Keys.chord(Keys.BACK_SPACE))
				break
			case 2:
				WebUI.comment('')
				break
			default:
				WebUI.comment("Invalid switchMode: " + switchMode)
				break
		}
	}

	@Keyword
	void WebdriverWaitUntilElementInvisible(String xpath) {
		//Keyword ini digunakan untuk menunggu element hingga tidak muncul berdasarkan full XPath yang di input
		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, GlobalVariable.TimeOut) // Pastikan TimeOut sudah terdefinisi
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath))) // Tunggu hingga elemen tidak muncul
	}

	void WebdriverWaitUntilElementVisible(String xpath) {
		// Keyword ini digunakan untuk menunggu elemen hingga muncul berdasarkan full XPath yang di-input
		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, GlobalVariable.TimeOut) // Pastikan TimeOut sudah terdefinisi
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))) // Tunggu hingga elemen muncul
	}

	void uploadFileObj(String findTestObj, String path) {
		//Upload File berdasarkan path katalon
		WebUI.uploadFile(findTestObject(findTestObj), RunConfiguration.getProjectDir() + path, FailureHandling.STOP_ON_FAILURE)
	}

	void Catchinfo(Exception e) {
		//Mempermudah Catch
		KeywordUtil.logInfo("Error Message: " + e.getMessage())
		WebUI.takeFullPageScreenshot()
		throw new StepFailedException("Terjadi kesalahan pada test case: " + e.getMessage())
	}

	void Finallyinfo(int switchMode) {
		//Block Final dijalankan untuk end session ke user portal
		WebUI.closeBrowser()
		KeywordUtil.logInfo("Browser berhasil ditutup.")
		switch(switchMode) {
			case 1:
				GlobalVariable.SwitchUsername = 1
				WebUI.callTestCase(findTestCase('IBB Portal/Back Office/Login Page/1.1 Open Web'), [:], FailureHandling.STOP_ON_FAILURE)
				WebUI.callTestCase(findTestCase('IBB Portal/Back Office/Login Page/1.2 Success Login'), [:], FailureHandling.STOP_ON_FAILURE)
				WebUI.callTestCase(findTestCase('IBB Portal/Back Office/Dashboard/Utility/User Settings/TC 31 Search Data/Search by Name') , [:], FailureHandling.STOP_ON_FAILURE)
				WebUI.callTestCase(findTestCase('IBB Portal/Back Office/Dashboard/Utility/User Settings/TC 32 View Details/View details - End Session User'), [:], FailureHandling.STOP_ON_FAILURE)
			//Perlu penambahan dari utility user settings
				break

			case 2:
				GlobalVariable.SwitchUsername = 2
				WebUI.callTestCase(findTestCase('IBB Portal/Back Office/Login Page/1.1 Open Web'), [:], FailureHandling.STOP_ON_FAILURE)
				WebUI.callTestCase(findTestCase('IBB Portal/Back Office/Login Page/1.2 Success Login'), [:], FailureHandling.STOP_ON_FAILURE)
				WebUI.callTestCase(findTestCase('IBB Portal/Back Office/Dashboard/Utility/User Settings/TC 31 Search Data/Search by Name') , [:], FailureHandling.STOP_ON_FAILURE)
				WebUI.callTestCase(findTestCase('IBB Portal/Back Office/Dashboard/Utility/User Settings/TC 32 View Details/View details - End Session User'), [:], FailureHandling.STOP_ON_FAILURE)
			//Perlu penambahan dari utility user settings
				break

			default:
				WebUI.comment('Tidak ada Usernya')
				break
		}
	}
}
