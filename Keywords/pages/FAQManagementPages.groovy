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

public class FAQManagementPages {
	ObjectGlobalPages ObjectGlobal = new ObjectGlobalPages()

	private TestObject searchField
	private TestObject searchField2
	private TestObject btnApply
	private TestObject btnPaginationNext
	private TestObject btnLastPages
	private TestObject btnPreviousPage
	private TestObject btnFirstPage
	private TestObject btnFilterBy1
	private TestObject btnFilterBy2
	private TestObject btnYes
	private TestObject btnNo
	private TestObject btnOK
	private TestObject btnEdit
	private TestObject btnAddFAQ
	private TestObject EditField
	private TestObject EditField2
	private TestObject EditField3
	private TestObject EditField4
	private TestObject field
	private TestObject field2
	private TestObject field3
	private TestObject field4
	private TestObject btnBack
	private TestObject btnDelete
	private TestObject btnSave
	private TestObject btnCancel
	private TestObject AddFAQ
	private TestObject radioUser
	private TestObject fieldOrder
	private TestObject Nodata
	private TestObject errorOrder


	def FAQManagementPages(String User) {
		//Add FAQ
		AddFAQ = ObjectGlobal.getTestObject("//button[contains(span, 'FAQ')]")
		radioUser = ObjectGlobal.getTestObject("//input[@value='${User}']")
		fieldOrder = ObjectGlobal.getTestObject("//div[2]/div[2]/input[@placeholder='Enter Ordering']")
		field = ObjectGlobal.getTestObject("//div[1]//div[3]/div[1]/div[1]//div[@contenteditable='true']")
		field2 = ObjectGlobal.getTestObject("//div[1]//div[3]/div[1]/div[2]//div[@contenteditable='true']")
		field3 = ObjectGlobal.getTestObject("//div[1]//div[3]/div[2]/div[1]//div[@contenteditable='true']")
		field4 = ObjectGlobal.getTestObject("//div[1]//div[3]/div[2]/div[2]//div[@contenteditable='true']")

		//Edit FAQ
		btnEdit = ObjectGlobal.getTestObject("//span[text()='Edit']")
		EditField = ObjectGlobal.getTestObject("//div[contains(@class, 'se-wrapper-inner')]")
		EditField2 = ObjectGlobal.getTestObject("//div[contains(@class, 'se-wrapper-inner')]")
		EditField3 = ObjectGlobal.getTestObject("//div[contains(@class, 'se-wrapper-inner')]")
		EditField4 = ObjectGlobal.getTestObject("//div[contains(@class, 'se-wrapper-inner')]")

		//Page
		searchField = ObjectGlobal.getTestObject("//input[@placeholder='Search...']")
		searchField2 = ObjectGlobal.getTestObject("//input[@placeholder='Search...']")
		btnApply = ObjectGlobal.getTestObject("//button[.//span[text()='Apply']]")
		btnFilterBy1 = ObjectGlobal.getTestObject("//span[text()='Admin Bank']")
		btnFilterBy2 = ObjectGlobal.getTestObject("//span[text()='Customer']")
		btnPaginationNext = ObjectGlobal.getTestObject("//button[@aria-label='Go to next page']//*[name()='svg']")
		btnLastPages = ObjectGlobal.getTestObject("//button[@aria-label='Go to last page']//*[name()='svg']")
		btnPreviousPage = ObjectGlobal.getTestObject("//button[@aria-label='Go to previous page']//*[name()='svg']")
		btnFirstPage = ObjectGlobal.getTestObject("//button[@aria-label='Go to first page']//*[name()='svg']")
		Nodata = ObjectGlobal.getTestObject("//div[text()='No Data']")

		//general
		btnCancel = ObjectGlobal.getTestObject("//button[span[text()='Cancel']]")
		btnBack = ObjectGlobal.getTestObject("//button[span[text()='Back']]")
		btnSave = ObjectGlobal.getTestObject("//button[span[text()='Save']]")
		btnDelete = ObjectGlobal.getTestObject("//span[text()='Delete']")
		btnYes = ObjectGlobal.getTestObject("//*[@type = 'button' and (text() = 'Yes' or . = 'Yes')]")
		btnNo = ObjectGlobal.getTestObject("//*[@type = 'button' and (text() = 'No' or . = 'No')]")
		btnOK = ObjectGlobal.getTestObject("//*[@type = 'button' and (text() = 'OK' or . = 'OK')]")
		errorOrder = ObjectGlobal.getTestObject("//div[text()='Ordering already exists']")
	}

	def paginationAdmin() {
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


	def filterbyCustomer() {
		println("btnFilterBy2: " + btnFilterBy2)
		if (btnFilterBy2 != null) {
			println("btnFilterBy2 is initialized.")
			if (WebUI.waitForElementVisible(btnFilterBy2, 10)) {
				println("btnFilterBy2 is visible.")
				WebUI.takeScreenshot()
				if (WebUI.waitForElementClickable(btnFilterBy2, 5)) {
					println("btnFilterBy2 is clickable. Clicking the button.")
					WebUI.click(btnFilterBy2)
					WebUI.takeScreenshot()
					if (WebUI.verifyElementPresent(btnApply, 5)) {
						println("btnApply is present. Clicking Apply button.")
						WebUI.click(btnApply)
						WebUI.takeScreenshot()
					} else {
						println("btnApply is not present.")
					}
				} else {
					println("btnFilterBy2 is not clickable.")
				}
			} else {
				println("btnFilterBy2 is not visible.")
			}
		} else {
			println("btnFilterBy2 is null, element could not be found.")
		}
	}



	def paginationCustomer() {
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

	def filterbyAdminBank() {
		println("btnFilterBy1: " + btnFilterBy1)
		if (btnFilterBy1 != null) {
			println("btnFilterBy1 is initialized.")
			if (WebUI.waitForElementVisible(btnFilterBy1, 10)) {
				println("btnFilterBy1 is visible.")
				WebUI.takeScreenshot()
				if (WebUI.waitForElementClickable(btnFilterBy1, 5)) {
					println("btnFilterBy1 is clickable. Clicking the button.")
					WebUI.click(btnFilterBy1)
					WebUI.takeScreenshot()

					// Cek apakah tombol Apply tersedia dan klik
					if (WebUI.verifyElementPresent(btnApply, 5)) {
						println("btnApply is present. Clicking Apply button.")
						WebUI.click(btnApply)
						WebUI.takeScreenshot()
					} else {
						println("btnApply is not present.")
					}
				} else {
					println("btnFilterBy1 is not clickable.")
				}
			} else {
				println("btnFilterBy1 is not visible.")
			}
		} else {
			println("btnFilterBy1 is null, element could not be found.")
		}
	}


	def searchID(String search) {
		WebUI.verifyElementPresent(searchField, 5)
		WebUI.click(searchField)
		WebUI.setText(searchField, search)
		WebUI.delay(3)
		WebUI.takeFullPageScreenshot()
		WebUI.sendKeys(searchField, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(searchField, Keys.chord(Keys.BACK_SPACE))
		WebUI.takeFullPageScreenshot()
		boolean isElementPresent = WebUI.verifyElementPresent(Nodata, 5, FailureHandling.OPTIONAL)
		if (!isElementPresent) {
			println "Data dengan ID '${search}' tidak ditemukan."
		}
	}

	def searchEN(String search2) {
		WebUI.verifyElementPresent(searchField2, 5)
		WebUI.click(searchField2)
		WebUI.setText(searchField2, search2)
		WebUI.delay(3)
		WebUI.takeFullPageScreenshot()
		WebUI.sendKeys(searchField2, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(searchField2, Keys.chord(Keys.BACK_SPACE))
		WebUI.takeFullPageScreenshot()
		boolean isElementPresent = WebUI.verifyElementPresent(Nodata, 5, FailureHandling.OPTIONAL)
		if (!isElementPresent) {
			println "Data with EN '${search2}' Not Found."
		}
	}

	def addOrdering(String Order) {
		// Verifikasi elemen AddFAQ dan klik
		WebUI.verifyElementPresent(AddFAQ, 5)
		WebUI.click(AddFAQ)
		WebUI.delay(2)
		WebUI.verifyElementPresent(fieldOrder, 10)
		WebUI.click(fieldOrder)
		WebUI.sendKeys(fieldOrder, Order)
		boolean isElementPresent = WebUI.verifyElementPresent(errorOrder, 5, FailureHandling.OPTIONAL)
		if (isElementPresent) {
			println "Ordering already exists"
			// Hapus data yang sudah ada (select all and backspace)
			WebUI.sendKeys(fieldOrder, Keys.chord(Keys.CONTROL, 'a'))
			WebUI.sendKeys(fieldOrder, Keys.chord(Keys.BACK_SPACE))
		} else {
			WebUI.takeScreenshot()
		}
	}

	def editOrdering(String search2, String Order) {
		WebUI.verifyElementPresent(searchField2, 5)
		WebUI.click(searchField2)
		WebUI.setText(searchField2, search2)
		WebUI.delay(3)
		WebUI.takeFullPageScreenshot()
		WebUI.verifyElementPresent(btnEdit, 5)
		WebUI.click(btnEdit)
		WebUI.delay(2)
		WebUI.verifyElementPresent(fieldOrder, 10)
		WebUI.click(fieldOrder)
		WebUI.sendKeys(fieldOrder, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(fieldOrder, Keys.chord(Keys.BACK_SPACE))
		WebUI.sendKeys(fieldOrder, Order)
		boolean isElementPresent = WebUI.verifyElementPresent(errorOrder, 5, FailureHandling.OPTIONAL)
		if (isElementPresent) {
			println "Ordering already exists"
			// Hapus data yang sudah ada (select all and backspace)
			WebUI.sendKeys(fieldOrder, Keys.chord(Keys.CONTROL, 'a'))
			WebUI.sendKeys(fieldOrder, Keys.chord(Keys.BACK_SPACE))
		} else {
			WebUI.takeScreenshot()
		}
	}

	def addFAQAdminBank(String QuestionID, String QuestionEN, String AnswerID, String AnswerEN) {
		WebUI.verifyElementPresent(field, 5)
		WebUI.click(field)
		WebUI.setText(field, QuestionID)
		WebUI.verifyElementText(field, QuestionID)
		WebUI.sendKeys(field, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(field, Keys.chord(Keys.CONTROL, 'b'))
		WebUI.delay(2)
		WebUI.verifyElementPresent(field2, 5)
		WebUI.click(field2)
		WebUI.delay(2)
		WebUI.setText(field2, QuestionEN)
		WebUI.verifyElementText(field2, QuestionEN)
		WebUI.sendKeys(field2, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(field2, Keys.chord(Keys.CONTROL, 'b'))
		WebUI.scrollToElement(field3, 10, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementPresent(field3, 5)
		WebUI.click(field3)
		WebUI.delay(2)
		WebUI.setText(field3, AnswerID)
		WebUI.verifyElementText(field3, AnswerID)
		WebUI.sendKeys(field3, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(field3, Keys.chord(Keys.CONTROL, 'i'))
		WebUI.verifyElementPresent(field4, 5)
		WebUI.click(field4)
		WebUI.delay(2)
		WebUI.setText(field4, AnswerEN)
		WebUI.verifyElementText(field4, AnswerEN)
		WebUI.sendKeys(field4, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(field4, Keys.chord(Keys.CONTROL, 'i'))
		WebUI.takeFullPageScreenshot()
	}

	def addFAQCustomer(String QuestionID, String QuestionEN, String AnswerID, String AnswerEN) {
		WebUI.verifyElementPresent(radioUser, 5)
		WebUI.click(radioUser)
		WebUI.takeScreenshot()
		WebUI.verifyElementPresent(field, 5)
		WebUI.click(field)
		WebUI.setText(field, QuestionID)
		WebUI.verifyElementText(field, QuestionID)
		WebUI.sendKeys(field, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(field, Keys.chord(Keys.CONTROL, 'b'))
		WebUI.delay(2)
		WebUI.verifyElementPresent(field2, 5)
		WebUI.click(field2)
		WebUI.setText(field2, QuestionEN)
		WebUI.verifyElementText(field2, QuestionEN)
		WebUI.sendKeys(field2, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(field2, Keys.chord(Keys.CONTROL, 'b'))
		WebUI.delay(2)
		WebUI.scrollToElement(field3, 10, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementPresent(field3, 5)
		WebUI.click(field3)
		WebUI.setText(field3, AnswerID)
		WebUI.verifyElementText(field3, AnswerID)
		WebUI.sendKeys(field3, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(field3, Keys.chord(Keys.CONTROL, 'i'))
		WebUI.delay(2)
		WebUI.verifyElementPresent(field4, 5)
		WebUI.click(field4)
		WebUI.setText(field4, AnswerEN)
		WebUI.verifyElementText(field4, AnswerEN)
		WebUI.sendKeys(field4, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(field4, Keys.chord(Keys.CONTROL, 'i'))
		WebUI.delay(2)
		WebUI.takeFullPageScreenshot()
	}

	def backFAQ() {
		WebUI.verifyElementPresent(btnBack, 10)
		WebUI.waitForElementClickable(btnBack, 5)
		WebUI.click(btnBack)
	}

	def saveYesFAQ() {
		WebUI.verifyElementPresent(btnSave, 10)
		WebUI.click(btnSave)
		WebUI.takeScreenshot()
		WebUI.verifyElementPresent(btnYes, 5)
		WebUI.click(btnYes)
		WebUI.takeScreenshot()
		WebUI.verifyElementPresent(btnOK, 5)
		WebUI.click(btnOK)
		WebUI.takeScreenshot()
	}

	def saveNoFAQ() {
		WebUI.verifyElementPresent(btnSave, 10)
		WebUI.click(btnSave)
		WebUI.takeScreenshot()
		WebUI.verifyElementPresent(btnNo, 5)
		WebUI.click(btnNo)
		WebUI.takeScreenshot()
	}

	def cancelFAQ() {
		WebUI.verifyElementPresent(btnCancel, 10)
		WebUI.waitForElementClickable(btnCancel, 5)
		WebUI.click(btnCancel)
	}
}
