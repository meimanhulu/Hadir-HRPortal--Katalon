package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.concurrent.ConcurrentHashMap.KeySetView
import org.openqa.selenium.Keys
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
import global.ObjectGlobalPages
import internal.GlobalVariable

public class ApprovalWorkflowPages{
	ObjectGlobalPages ObjectGlobal = new ObjectGlobalPages()

	private TestObject searchMenu
	private TestObject btnPopup
	private TestObject menuItem
	private TestObject menuItem2
	private TestObject btnView
	private TestObject description
	private TestObject fieldCommnt
	private TestObject btnApprve
	private TestObject btnYes
	private TestObject btnNo
	private TestObject btnRejct
	private TestObject btnBack
	private TestObject fieldStart
	private TestObject btnMonth
	private TestObject btnMonth2
	private TestObject btnYear
	private TestObject btnStartMonth
	private TestObject btnStartYear
	private TestObject btnStartDate
	private TestObject fieldEnd
	private TestObject btnEndMonth
	private TestObject btnEndYear
	private TestObject btnEndDate
	private TestObject btnstartToday
	private TestObject btnendToday
	private TestObject btnApply
	private TestObject btnSearch
	private TestObject btnOK
	private TestObject Nodata
	private TestObject btnStatus



	def ApprovalWorkflowPages(String menu, String submenu, String startDate, String endDate, String status) {
		//Search
		searchMenu = ObjectGlobal.getTestObject("(//input[@name=''])[2]")
		btnPopup = ObjectGlobal.getTestObject("//div[3]//ul/li//span[text()='${menu}']")
		menuItem = ObjectGlobal.getTestObject("//span[text()='${submenu}']")
		//		menuItem2 = ObjectGlobal.getTestObject("//span[text()='Biller Manager']")
		btnView = ObjectGlobal.getTestObject("//button[.//span[text()='View Details']]")
		fieldCommnt = ObjectGlobal.getTestObject("//textarea[@placeholder='Comments']")
		btnApprve = ObjectGlobal.getTestObject("//button[.//span[text()='Approve']]")
		btnYes = ObjectGlobal.getTestObject("//button[.//span[text()='Yes']]")
		btnNo = ObjectGlobal.getTestObject("//button[.//span[text()='No']]")
		btnRejct = ObjectGlobal.getTestObject("//button[.//span[text()='Reject']]")
		btnBack = ObjectGlobal.getTestObject("//button[.//span[text()='Back']]")
		fieldStart = ObjectGlobal.getTestObject("//input[@placeholder='Start Date']")
		btnMonth = ObjectGlobal.getTestObject("//button[contains(@class, 'ant-picker-month-btn')]")
		btnMonth2 = ObjectGlobal.getTestObject("//div[contains(@class, 'ant-picker')]//button[contains(@class, 'month-btn')]")
		btnYear = ObjectGlobal.getTestObject("//button[contains(@class, 'ant-picker-year-btn')]")
		//		btnStartMonth = ObjectGlobal.getTestObject("//div[text()='${StartMonthName}']")
		btnStartYear = ObjectGlobal.getTestObject("//div[text()='2025']") //jika ingin gunakan dinamis menentukan Tahun ubah tahun 2025 menjadi ${StartYear} lalu tambahkan di String
		btnStartDate = ObjectGlobal.getTestObject("//div[2]//div[2]//td[@title='${startDate}']")
		fieldEnd = ObjectGlobal.getTestObject("//input[@placeholder='End Date']")
		btnEndYear = ObjectGlobal.getTestObject("//div[text()='2025']") //jika ingin gunakan dinamis menentukan Tahun ubah tahun 2025 menjadi ${EndYear} lalu tambahkan di String
		//		btnEndMonth = ObjectGlobal.getTestObject("//div[text()='${EndMonthName}']")
		btnEndDate = ObjectGlobal.getTestObject("//div[3]//div[2]//td[@title='${endDate}']") //perhatikan pada div[3], jika saat run tidak terbaca ubah ke [4] dan sebaliknya
		btnstartToday = ObjectGlobal.getTestObject("//div[2]//div[2]/a[text()='Today']")
		btnendToday = ObjectGlobal.getTestObject("//div[3]//div[2]/a[text()='Today']") //perhatikan pada div[3], jika saat run tidak terbaca ubah ke [4] dan sebaliknya
		btnApply = ObjectGlobal.getTestObject("//button[span[text()='Apply']]")
		btnSearch = ObjectGlobal.getTestObject("//span[.//input[@placeholder='Search...']]")
		description = ObjectGlobal.getTestObject("//div[contains(@class, 'jss8112') and text()='Pulsa Habis']") //utk ini bisa saja selain 'Pulsa Habis', tergantung text dalam Xpath
		btnOK = ObjectGlobal.getTestObject("//button[.//span[text()='OK']]")
		Nodata = ObjectGlobal.getTestObject("//div[text()='No Data']")
		btnStatus = ObjectGlobal.getTestObject("//button[span[text()='${status}']]")
	}

	def approvalworkflow(String search) {

		WebUI.takeScreenshot("SearchInitial.png")
		WebUI.verifyElementPresent(searchMenu, 5)
		WebUI.click(searchMenu)
		WebUI.setText(searchMenu, search)
		WebUI.takeScreenshot("SearchFilled.png")
	}

	def noData() {
		WebUI.takeScreenshot()
		WebUI.verifyElementPresent(searchMenu, 5)
		WebUI.click(searchMenu)
		WebUI.sendKeys(searchMenu, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(searchMenu, Keys.chord(Keys.BACK_SPACE))
		WebUI.takeScreenshot()
	}

	def searchMenu() {
		if (searchMenu == null) {
			println("Pencarian gagal, tidak melanjutkan filter tanggal.")
			WebUI.takeScreenshot("screenshots/startbyToday_search_null.png")
			return
		}
		WebUI.takeScreenshot("screenshots/startbyToday_before_popup.png")
		WebUI.verifyElementPresent(btnPopup, 5)
		WebUI.click(btnPopup)
		//		WebUI.verifyElementText(menuItem, 'Billers Category', FailureHandling.STOP_ON_FAILURE)
		//		WebUI.takeScreenshot("screenshots/startbyToday_billers_category.png")
		//		WebUI.click(menuItem)
		WebUI.verifyElementPresent(menuItem, 5)
		WebUI.takeScreenshot("screenshots/startbyToday.png")
		WebUI.click(menuItem)
	}

	def startbyToday() {
		WebUI.verifyElementPresent(fieldStart, 5)
		WebUI.click(fieldStart)
		WebUI.delay(2)
		WebUI.takeScreenshot("screenshots/startbyToday_before_select.png")
		WebUI.verifyElementPresent(btnstartToday, 5)
		WebUI.click(btnstartToday)
		WebUI.takeScreenshot("screenshots/startbyToday_after_select.png")
	}

	def startbyTgl() {
		WebUI.verifyElementPresent(fieldStart, 5)
		WebUI.click(fieldStart)
		WebUI.delay(2)
		WebUI.takeScreenshot("screenshots/startbyTgl_before_select.png")
		WebUI.verifyElementPresent(btnStartDate, 5)
		WebUI.click(btnStartDate)
		WebUI.takeScreenshot("screenshots/startbyTgl_after_select.png")
	}

	def endbyToday() {
		WebUI.takeScreenshot("screenshots/endbyToday_start.png")
		WebUI.verifyElementPresent(fieldEnd, 5)
		WebUI.click(fieldEnd)
		WebUI.delay(2)
		WebUI.waitForElementClickable(btnendToday, 10)
		WebUI.verifyElementPresent(btnendToday, 5)
		WebUI.takeScreenshot("screenshots/endbyToday_before_select.png")
		WebUI.click(btnendToday)
	}

	def endbyTgl() {
		WebUI.takeScreenshot("screenshots/EndDate_start.png")
		WebUI.verifyElementPresent(fieldEnd, 5)
		WebUI.click(fieldEnd)
		WebUI.delay(2)
		WebUI.verifyElementPresent(btnEndDate, 5)
		WebUI.takeScreenshot("screenshots/EndDate_before_select.png")
		WebUI.click(btnEndDate)
	}

	def Status() {
		WebUI.verifyElementPresent(btnStatus, 5)
		WebUI.waitForElementClickable(btnStatus, 5)
		WebUI.click(btnStatus)
		WebUI.takeScreenshot()
		WebUI.verifyElementPresent(btnApply, 5)
		WebUI.click(btnApply)
		WebUI.takeScreenshot()
		boolean isElementPresent = WebUI.verifyElementPresent(Nodata, 5, FailureHandling.OPTIONAL)
		if (isElementPresent) {
			println "No Data"
		} else {
			WebUI.takeScreenshot()
		}
	}

	def view(String Comments) {
		WebUI.takeScreenshot("screenshots/view_start.png")
		WebUI.verifyElementPresent(btnView, 5)
		WebUI.waitForElementPresent(btnView, 3)
		WebUI.click(btnView)
		WebUI.takeScreenshot("screenshots/view_after_click.png")
		WebUI.delay(2)
		WebUI.scrollToPosition(0, 2000, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementPresent(fieldCommnt, 5)
		WebUI.waitForElementPresent(fieldCommnt, 3)
		WebUI.click(fieldCommnt)
		WebUI.setText(fieldCommnt, Comments)
		WebUI.verifyElementAttributeValue(fieldCommnt, 'value', Comments, 5)
		WebUI.takeScreenshot("screenshots/view_after_comment.png")
	}

	def ApproveYes() {
		WebUI.verifyElementPresent(btnApprve, 5)
		WebUI.click(btnApprve)
		WebUI.takeScreenshot("screenshots/view_after_approve.png")
		WebUI.verifyElementPresent(btnYes, 5)
		WebUI.click(btnYes)
		WebUI.takeScreenshot("screenshots/view_after_yes.png")
		WebUI.verifyElementPresent(btnOK, 5)
		WebUI.click(btnOK)
		WebUI.takeScreenshot("screenshots/view_after_ok.png")
	}

	def ApproveNo() {
		WebUI.verifyElementPresent(btnApprve, 5)
		WebUI.click(btnApprve)
		WebUI.takeScreenshot("screenshots/view_after_approve.png")
		WebUI.verifyElementPresent(btnNo, 5)
		WebUI.click(btnNo)
		WebUI.takeScreenshot("screenshots/view_after_no.png")
		WebUI.verifyElementPresent(btnOK, 5)
		WebUI.click(btnOK)
		WebUI.takeScreenshot("screenshots/view_after_ok.png")
	}

	def RejectYes() {
		WebUI.verifyElementPresent(btnRejct, 5)
		WebUI.click(btnRejct)
		WebUI.takeScreenshot("screenshots/view_after_approve.png")
		WebUI.verifyElementPresent(btnYes, 5)
		WebUI.click(btnYes)
		WebUI.takeScreenshot("screenshots/view_after_yes.png")
		WebUI.verifyElementPresent(btnOK, 5)
		WebUI.click(btnOK)
		WebUI.takeScreenshot("screenshots/view_after_ok.png")
	}

	def RejectNo() {
		WebUI.verifyElementPresent(btnRejct, 5)
		WebUI.click(btnRejct)
		WebUI.takeScreenshot("screenshots/view_after_approve.png")
		WebUI.verifyElementPresent(btnNo, 5)
		WebUI.click(btnNo)
		WebUI.takeScreenshot("screenshots/view_after_yes.png")
		WebUI.verifyElementPresent(btnOK, 5)
		WebUI.click(btnOK)
		WebUI.takeScreenshot("screenshots/view_after_ok.png")
	}

	def backView() {
		WebUI.verifyElementPresent(btnBack, 5)
		WebUI.scrollToElement(btnBack, 5)
		WebUI.waitForElementClickable(btnBack, 5)
		WebUI.click(btnBack)
	}
}