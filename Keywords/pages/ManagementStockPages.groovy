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

public class ManagementStockPages{
	ObjectGlobalPages ObjectGlobal = new ObjectGlobalPages()

	private TestObject DropdownSearch
	private TestObject btnView
	private TestObject fieldCommnt
	private TestObject btnApprve
	private TestObject btnYes
	private TestObject btnNo
	private TestObject btnRejct
	private TestObject btnBack
	private TestObject fieldStart
	private TestObject btnStartDate
	private TestObject fieldEnd
	private TestObject btnEndDate
	private TestObject btnstartToday
	private TestObject btnendToday
	private TestObject btnApply
	private TestObject searchField
	private TestObject btnOK
	private TestObject Nodata
	private TestObject btnStatus
	private TestObject btnPaginationNext
	private TestObject btnLastPages
	private TestObject btnPreviousPage
	private TestObject btnFirstPage
	private TestObject businessField
	private TestObject branch
	private TestObject DocDownload1
	private TestObject DocDownload2
	private TestObject btnAdvance
	private TestObject startPreviousMonth
	private TestObject startSuperPreviousMonth
	private TestObject startNextMonth
	private TestObject startSuperNextMonth
	private TestObject endPreviousMonth
	private TestObject endSuperPreviousMonth
	private TestObject endNextMonth
	private TestObject endSuperNextMonth
	private TestObject listbox
	private TestObject NoDescript


	def ManagementStockPages(String startDate, String endDate, String status) {

		//Page
		DropdownSearch = ObjectGlobal.getTestObject("//input[@id='dropdown-search']")
		listbox = ObjectGlobal.getTestObject("//div[@class='ant-select-selector']//span[@title='All']")
		searchField = ObjectGlobal.getTestObject("//span[.//input[@placeholder='Search...']]")
		btnPaginationNext = ObjectGlobal.getTestObject("//button[@aria-label='Go to next page']//*[name()='svg']")
		btnLastPages = ObjectGlobal.getTestObject("//button[@aria-label='Go to last page']//*[name()='svg']")
		btnPreviousPage = ObjectGlobal.getTestObject("//button[@aria-label='Go to previous page']//*[name()='svg']")
		btnFirstPage = ObjectGlobal.getTestObject("//button[@aria-label='Go to first page']//*[name()='svg']")
		Nodata = ObjectGlobal.getTestObject("//div[text()='No Data']")
		NoDescript = ObjectGlobal.getTestObject("///div[@class='ant-empty-description' and text()='No data']")
		btnAdvance = ObjectGlobal.getTestObject("//button[span[contains(text(),'Advance')]]")
		btnStatus = ObjectGlobal.getTestObject("//button[span[text()='${status}']]")
		fieldStart = ObjectGlobal.getTestObject("//input[@placeholder='Start Date']")
		fieldEnd = ObjectGlobal.getTestObject("//input[@placeholder='End Date']")
		startPreviousMonth = ObjectGlobal.getTestObject("//div[2]//button[span[@class='ant-picker-prev-icon']]")
		startSuperPreviousMonth = ObjectGlobal.getTestObject("//div[2]//button[.//span[@class='ant-picker-super-prev-icon']]")
		startNextMonth = ObjectGlobal.getTestObject("//div[2]//button[span[@class='ant-picker-next-icon']]")
		startSuperNextMonth = ObjectGlobal.getTestObject("//div[2]//button[span[@class='ant-picker-super-next-icon']]")
		endPreviousMonth = ObjectGlobal.getTestObject("//div[3]//button[span[@class='ant-picker-prev-icon']]")
		endSuperPreviousMonth = ObjectGlobal.getTestObject("//div[3]//button[.//span[@class='ant-picker-super-prev-icon']]")
		endNextMonth = ObjectGlobal.getTestObject("//div[3]//button[span[@class='ant-picker-next-icon']]")
		endSuperNextMonth = ObjectGlobal.getTestObject("//div[3]//button[span[@class='ant-picker-super-next-icon']]")
		btnStartDate = ObjectGlobal.getTestObject("//div[4]//td[@title='${startDate}']")
		btnEndDate = ObjectGlobal.getTestObject("//div[5]//td[@title='${endDate}']") //perhatikan pada div[5], jika saat run tidak terbaca ubah ke [4] dan sebaliknya
		btnstartToday = ObjectGlobal.getTestObject("//div[2]//a[text()='Today']")
		btnendToday = ObjectGlobal.getTestObject("//div[3]//a[text()='Today']") //perhatikan pada div[5], jika saat run tidak terbaca ubah ke [4] dan sebaliknya

		//View Details
		btnView = ObjectGlobal.getTestObject("//button[.//span[text()='View Details']]")
		fieldCommnt = ObjectGlobal.getTestObject("//textarea[@placeholder='Comments']")
		businessField = ObjectGlobal.getTestObject("//div[text()='Business Field Profile']")
		branch = ObjectGlobal.getTestObject("//div[text()='Branch']")
		DocDownload1 = ObjectGlobal.getTestObject("//span[contains(text(), 'Document Registration')]")
		DocDownload2 = ObjectGlobal.getTestObject("//span[contains(text(), 'Application Letter Hard Token')]")
		btnApprve = ObjectGlobal.getTestObject("//button[.//span[text()='Approve']]")

		//General
		btnYes = ObjectGlobal.getTestObject("//button[.//span[text()='Yes']]")
		btnNo = ObjectGlobal.getTestObject("//button[.//span[text()='No']]")
		btnRejct = ObjectGlobal.getTestObject("//button[.//span[text()='Reject']]")
		btnBack = ObjectGlobal.getTestObject("//button[.//span[text()='Back']]")
		btnApply = ObjectGlobal.getTestObject("//button[span[text()='Apply']]")
		btnOK = ObjectGlobal.getTestObject("//button[.//span[text()='OK']]")
	}


	def pagination() {
		//Pagination
		for (int i = 0; i < 1; i++) {
			if (WebUI.verifyElementClickable(btnPaginationNext, FailureHandling.OPTIONAL)) {
				WebUI.click(btnPaginationNext)
				WebUI.delay(2) // Tunggu sejenak agar halaman update
				// Take Screenshot after going to next page
				WebUI.takeScreenshot("screenshots/page_${i + 1}.png")
			}else {
				println("❌ Pagination tidak aktif, berhenti di iterasi ke-${i + 1}.")
				break // Keluar dari loop kalau pagination tidak aktif
			}
		}
		for (int i = 0; i < 1; i++) {
			if (WebUI.verifyElementClickable(btnLastPages, FailureHandling.OPTIONAL)) {
				WebUI.click(btnLastPages)
				WebUI.delay(2) // Tunggu sejenak agar halaman update
				// Take Screenshot after going to Last Page
				WebUI.takeScreenshot("screenshots/last_page_${i + 1}.png")
			} else {
				println("❌ Last Page tidak aktif, berhenti di iterasi ke-${i + 1}.")
				break // Keluar dari loop kalau Last Page tidak aktif
			}
		}
		for (int i = 0; i < 1; i++) {
			if (WebUI.verifyElementClickable(btnPreviousPage, FailureHandling.OPTIONAL)) {
				WebUI.click(btnPreviousPage)
				WebUI.delay(2) // Tunggu sejenak agar halaman update
				// Take Screenshot after going to previous page
				WebUI.takeScreenshot("screenshots/previous_page_${i + 1}.png")
			} else {
				println("❌ Previous page tidak aktif, berhenti di iterasi ke-${i + 1}.")
				break // Keluar dari loop kalau PreviousPage tidak aktif
			}
		}
		// Loop for First Page button
		for (int i = 0; i < 1; i++) {
			if (WebUI.verifyElementClickable(btnFirstPage, FailureHandling.OPTIONAL)) {
				WebUI.click(btnFirstPage)
				WebUI.delay(2) // Tunggu sejenak agar halaman update
				// Take Screenshot after going to First Page
				WebUI.takeScreenshot("screenshots/first_page_${i + 1}.png")
			} else {
				println("❌ First Page tidak aktif, berhenti di iterasi ke-${i + 1}.")
				break // Keluar dari loop kalau First Page tidak aktif
			}
		}
	}

	def companyID(String search) {
		WebUI.takeScreenshot("SearchInitial.png")
		WebUI.verifyElementPresent(searchField, 5)
		WebUI.click(searchField)
		WebUI.setText(searchField, search)
		WebUI.takeScreenshot("SearchFilled.png")
		WebUI.delay(3)
		WebUI.sendKeys(searchField, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(searchField, Keys.chord(Keys.BACK_SPACE))
		WebUI.takeFullPageScreenshot()
		boolean isElementPresent = WebUI.verifyElementPresent(Nodata, 5, FailureHandling.OPTIONAL)
		if (!isElementPresent) {
			println "Data dengan Company ID '${search}' tidak ditemukan."
		}
	}

	def companyName(String search2) {
		WebUI.takeScreenshot("SearchInitial.png")
		WebUI.verifyElementPresent(searchField, 5)
		WebUI.click(searchField)
		WebUI.setText(searchField, search2)
		WebUI.takeScreenshot("SearchFilled.png")
		WebUI.delay(3)
		WebUI.sendKeys(searchField, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(searchField, Keys.chord(Keys.BACK_SPACE))
		WebUI.takeFullPageScreenshot()
		boolean isElementPresent = WebUI.verifyElementPresent(Nodata, 5, FailureHandling.OPTIONAL)
		if (!isElementPresent) {
			println "Data dengan Company Name '${search2}' tidak ditemukan."
		}
	}

	def startDate() {
		WebUI.takeScreenshot("screenshots/StartDate_start.png")
		WebUI.verifyElementPresent(fieldStart, 5)
		WebUI.click(fieldStart)
		WebUI.delay(2)
	}

	def endDate() {
		WebUI.takeScreenshot("screenshots/endbyToday_start.png")
		WebUI.verifyElementPresent(fieldEnd, 5)
		WebUI.click(fieldEnd)
		WebUI.delay(2)
	}

	def startPrevious() {
		WebUI.verifyElementPresent(startPreviousMonth, 5)
		WebUI.click(startPreviousMonth)
		WebUI.takeScreenshot("screenshots/start_Previous.png")
	}

	def startNext() {
		WebUI.verifyElementPresent(startNextMonth, 5)
		WebUI.click(startNextMonth)
		WebUI.takeScreenshot("screenshots/start_Next.png")
	}

	def endPrevious() {
		WebUI.verifyElementPresent(endPreviousMonth, 5)
		WebUI.click(endPreviousMonth)
		WebUI.takeScreenshot("screenshots/End_Previous.png")
	}

	def startbyTgl() {
		WebUI.takeScreenshot("screenshots/startbyTgl_before_select.png")
		WebUI.verifyElementPresent(btnStartDate, 5)
		WebUI.click(btnStartDate)
		WebUI.takeScreenshot("screenshots/startbyTgl_after_select.png")
	}

	def startbyToday() {
		WebUI.takeScreenshot("screenshots/startbyToday_before_select.png")
		WebUI.verifyElementPresent(btnstartToday, 10)
		WebUI.click(btnstartToday)
		WebUI.takeScreenshot("screenshots/startbyToday_after_select.png")
	}

	def endbyToday() {
		WebUI.waitForElementClickable(btnendToday, 10)
		WebUI.verifyElementPresent(btnendToday, 5)
		WebUI.takeScreenshot("screenshots/endbyToday_before_select.png")
		WebUI.click(btnendToday)
	}

	def endbyTgl() {
		WebUI.waitForElementClickable(btnEndDate, 10)
		WebUI.verifyElementPresent(btnEndDate, 5)
		WebUI.takeScreenshot("screenshots/EndDate_before_select.png")
		WebUI.click(btnEndDate)
	}

	def Status() {
		WebUI.verifyElementPresent(btnStatus, 5)
		WebUI.waitForElementClickable(btnStatus, 5)
		WebUI.click(btnStatus)
		WebUI.takeScreenshot()
	}

	//	def Advance(String text) {
	//		WebUI.verifyElementPresent(btnAdvance, 5)
	//		WebUI.click(btnAdvance)
	//		WebUI.verifyElementPresent(listbox, 5)
	//		WebUI.waitForElementClickable(listbox, 5)
	//		WebUI.takeScreenshot()
	//		WebUI.click(listbox)
	//		WebUI.delay(2)
	//		WebUI.verifyElementPresent(DropdownSearch, 5)
	//		WebUI.click(DropdownSearch)
	//		WebUI.setText(DropdownSearch, text)
	//		boolean isElementPresent = WebUI.verifyElementPresent(NoDescript, 5)
	//		if (isElementPresent) {
	//			// Jika elemen NoDescript tidak ditemukan, tampilkan pesan
	//			println "Data dengan '${text}' Tidak Ditemukan."
	//		} else {
	//			WebUI.takeScreenshot()
	//			// Jika elemen NoDescript ditemukan, lakukan tindakan berikut:
	//			WebUI.sendKeys(DropdownSearch, Keys.chord(Keys.CONTROL, 'a'))
	//			WebUI.sendKeys(DropdownSearch, Keys.chord(Keys.BACK_SPACE))
	//		}
	//		WebUI.delay(2)
	//		WebUI.sendKeys(DropdownSearch, Keys.chord(Keys.ENTER))
	//	}

	def Apply() {
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

	def applicantData() {
		WebUI.takeScreenshot("screenshots/before_click.png")
		WebUI.verifyElementPresent(businessField, 5)
		WebUI.click(businessField)
		WebUI.verifyElementPresent(branch, 5)
		WebUI.click(branch)
		WebUI.takeScreenshot("screenshots/after_click.png")
	}

	def Doc1() {
		WebUI.takeScreenshot("screenshots/before_Document_click.png")
		WebUI.verifyElementPresent(DocDownload1, 5)
		WebUI.click(DocDownload1)
		WebUI.takeScreenshot("screenshots/after_Document_click.png")
	}

	def Doc2() {
		WebUI.takeScreenshot("screenshots/before_Document_click.png")
		WebUI.verifyElementPresent(DocDownload2, 5)
		WebUI.click(DocDownload2)
		WebUI.takeScreenshot("screenshots/after_Document_click.png")
	}

	def view() {
		WebUI.takeScreenshot("screenshots/view_start.png")
		WebUI.verifyElementPresent(btnView, 5)
		WebUI.waitForElementPresent(btnView, 3)
		WebUI.click(btnView)
		WebUI.takeScreenshot("screenshots/view_after_click.png")
		WebUI.delay(2)
	}

	def comment(String Comments) {
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