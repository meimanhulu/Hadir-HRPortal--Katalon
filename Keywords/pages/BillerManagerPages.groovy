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

public class BillerManagerPages {
	ObjectGlobalPages ObjectGlobal = new ObjectGlobalPages()


	private TestObject searchField
	private TestObject searchField2
	private TestObject btnSearch
	private TestObject btnPaginationNext
	private TestObject btnLastPages
	private TestObject btnPreviousPage
	private TestObject btnFirstPage
	private TestObject btnSimpMenu
	private TestObject btnInact
	private TestObject btnYes
	private TestObject btnNo
	private TestObject btnOK
	private TestObject btnEdit
	private TestObject btnEditField
	private TestObject btnEditField2
	private TestObject btnEditField3
	private TestObject btnEditField4
	private TestObject btnDotmenu1
	private TestObject btnDotmenu2
	private TestObject btnDotmenu3
	private TestObject btnDotmenu4
	private TestObject btnBack
	private TestObject btnDelet
	private TestObject btnSave
	private TestObject btnSave2
	private TestObject btnSave3
	private TestObject btnCancel
	private TestObject btnClear
	private TestObject btnClear2
	private TestObject fieldMin
	private TestObject fieldMax
	private TestObject AddBill


	def BillerManagerPages() {
		//Search
		searchField = ObjectGlobal.getTestObject("//input[@placeholder='Search...']")
		searchField2 = ObjectGlobal.getTestObject("//input[@placeholder='Search...']")
		btnSearch = ObjectGlobal.getTestObject("//button[.//span[text()='Apply']]")

		//pagination
		btnPaginationNext = ObjectGlobal.getTestObject("//button[@aria-label='Go to next page']//*[name()='svg']")
		btnLastPages = ObjectGlobal.getTestObject("//button[@aria-label='Go to last page']//*[name()='svg']")
		btnPreviousPage = ObjectGlobal.getTestObject("//button[@aria-label='Go to previous page']//*[name()='svg']")
		btnFirstPage = ObjectGlobal.getTestObject("//button[@aria-label='Go to first page']//*[name()='svg']")

		//AddBiller
		AddBill = ObjectGlobal.getTestObject("//button[contains(span, 'Biller')]")

		//Edit
		btnEdit = ObjectGlobal.getTestObject("//li[span[text()='Edit'] and img[@alt='Edit']]")
		btnDotmenu2 = ObjectGlobal.getTestObject("//tr[2]/td[11]")
		btnDotmenu3 = ObjectGlobal.getTestObject("//tr[3]/td[11]")
		btnSave = ObjectGlobal.getTestObject("//form//div[2]//div[2]/div[4]/button[span[text()='Save']]")
		btnClear = ObjectGlobal.getTestObject("//form//div[2]//div[2]/div[4]/button[span[text()='Clear']]")
		btnEditField2 = ObjectGlobal.getTestObject("//div[@id='simple-menu']/div[3]/ul/li[(text() = 'Edit' or . = 'Edit')]")
		fieldMin = ObjectGlobal.getTestObject("//input[@name='minFieldLength']")
		fieldMax = ObjectGlobal.getTestObject("//input[@name='maxFieldLength']")
		btnSave2 = ObjectGlobal.getTestObject("//form//div[2]//div[3]/div[4]/div[2]/button[span[text()='Save']]")
		btnClear2 = ObjectGlobal.getTestObject("//form//div[2]//div[3]/div[4]/div[2]/button[span[text()='Clear']]")
		btnSave3 = ObjectGlobal.getTestObject("//div/div[3]/button[2]")
		btnCancel = ObjectGlobal.getTestObject("//div/div[3]/button[1]")
		btnBack = ObjectGlobal.getTestObject("//button[.//img[@alt='Kembali']]")


		//Inactive
		btnSimpMenu = ObjectGlobal.getTestObject("//button[@aria-controls='simple-menu']")
		btnInact = ObjectGlobal.getTestObject("//span[text()='Inactive']")
		btnYes = ObjectGlobal.getTestObject("//*[@type = 'button' and (text() = 'Yes' or . = 'Yes')]")
		btnNo = ObjectGlobal.getTestObject("//*[@type = 'button' and (text() = 'No' or . = 'No')]")
		btnOK = ObjectGlobal.getTestObject("//*[@type = 'button' and (text() = 'OK' or . = 'OK')]")
	}

	def pagination() {

		//Pagination
		for (int i = 0; i < 3; i++) {
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

		for (int i = 0; i < 3; i++) {
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

	def billerName(String search) {
		// Set text in the first search field
		WebUI.verifyElementPresent(searchField, 5)
		WebUI.setText(searchField, search)
		WebUI.getAttribute(searchField, 'value')
		println("Biller's Name: " + search)
		//		WebUI.delay(2)
		WebUI.delay(1)
		WebUI.sendKeys(searchField, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(searchField, Keys.chord(Keys.BACK_SPACE))
		WebUI.takeFullPageScreenshot()
	}


	def payeeCode(String search2) {
		// Set text in the second search field
		WebUI.verifyElementPresent(searchField2, 5)
		WebUI.setText(searchField2, search2)
		//		WebUI.getAttribute(searchField2, 'value')
		//		println("Payee Code: " + search2)
		//		WebUI.delay(2)
		WebUI.delay(1)
		WebUI.sendKeys(searchField2, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(searchField2, Keys.chord(Keys.BACK_SPACE))
		WebUI.takeFullPageScreenshot()
	}

	def payeeCodeEdit(String search2) {
		WebUI.verifyElementPresent(searchField2, 5)
		WebUI.setText(searchField2, search2)
		WebUI.verifyElementAttributeValue(searchField2, 'value', search2, 5)
		WebUI.delay(1)
		WebUI.takeFullPageScreenshot()
		WebUI.waitForElementClickable(btnSimpMenu, 5)
		WebUI.click(btnSimpMenu)
		WebUI.verifyElementVisible(btnEdit)
		WebUI.waitForElementClickable(btnEdit, 5)
		WebUI.click(btnEdit)
		WebUI.delay(1)
		WebUI.takeFullPageScreenshot()
	}

	def billerNameEdit(String search) {
		WebUI.verifyElementPresent(searchField, 5)
		WebUI.setText(searchField, search)
		WebUI.verifyElementAttributeValue(searchField, 'value', search, 5)
		WebUI.delay(1)
		WebUI.takeFullPageScreenshot()
		WebUI.waitForElementClickable(btnSimpMenu, 5)
		WebUI.click(btnSimpMenu)
		WebUI.verifyElementVisible(btnEdit)
		WebUI.click(btnEdit)
		WebUI.delay(1)
		WebUI.takeFullPageScreenshot()
	}

	def editBiller(String Min, String Max) {
		WebUI.scrollToPosition(0, 700, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementVisible(btnDotmenu2)
		WebUI.verifyElementPresent(btnDotmenu2, 5)
		WebUI.click(btnDotmenu2)
		WebUI.waitForElementClickable(btnEditField2, 5)
		WebUI.click(btnEditField2)
		WebUI.scrollToPosition(0, 500, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementPresent(fieldMin, 5)
		WebUI.sendKeys(fieldMin, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(fieldMin, Keys.chord(Keys.BACK_SPACE))
		WebUI.setText(fieldMin, Min)
		WebUI.verifyElementPresent(fieldMax, 5)
		WebUI.sendKeys(fieldMax, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(fieldMax, Keys.chord(Keys.BACK_SPACE))
		WebUI.setText(fieldMax, Max)
		WebUI.takeFullPageScreenshot()
		//		WebUI.verifyElementVisible(btnClear2)
		//		WebUI.click(btnClear2)
		//		WebUI.waitForElementPresent(btnBack, 5, FailureHandling.STOP_ON_FAILURE)
		//		WebUI.verifyElementPresent(btnBack, 5)
		//		WebUI.waitForElementClickable(btnBack, 5)
		//		WebUI.click(btnBack)
		WebUI.verifyElementVisible(btnSave2)
		WebUI.click(btnSave2)
		WebUI.verifyElementVisible(btnSave3)
		WebUI.takeFullPageScreenshot()
		WebUI.click(btnSave3)
		WebUI.waitForElementPresent(btnYes, 5, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementPresent(btnYes, 5)
		WebUI.waitForElementClickable(btnYes, 5)
		WebUI.takeFullPageScreenshot()
		WebUI.click(btnYes)
		WebUI.waitForElementPresent(btnOK, 5, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementPresent(btnOK, 5)
		WebUI.waitForElementClickable(btnOK, 5)
		WebUI.takeFullPageScreenshot()
		WebUI.click(btnOK)
	}


	def inactiveYes() {
		WebUI.click(btnSimpMenu)
		WebUI.verifyElementVisible(btnInact)
		WebUI.click(btnInact)
		WebUI.delay(2)
		WebUI.click(btnYes)
		WebUI.verifyElementText(btnYes, 'Yes', FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(btnOK)
		WebUI.verifyElementText(btnOK, 'OK', FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.takeFullPageScreenshot()
	}

	def inactiveNo() {
		WebUI.click(btnSimpMenu)
		WebUI.click(btnInact)
		WebUI.delay(2)
		WebUI.click(btnNo)
		WebUI.verifyElementText(btnNo, 'No', FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.takeFullPageScreenshot()
	}
	
	def inactiveNo() {
		WebUI.click(btnSimpMenu)
		WebUI.click(btnInact)
		WebUI.delay(2)
		WebUI.click(btnNo)
		WebUI.verifyElementText(btnNo, 'No', FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.takeFullPageScreenshot()
	}
}
