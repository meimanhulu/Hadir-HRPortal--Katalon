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

public class CutiPages {
	ObjectGlobalPages ObjectGlobal = new ObjectGlobalPages()

	private TestObject searchField
	private TestObject btnSearch
	private TestObject btnfilterField
	private TestObject searchDepartemen
	private TestObject selectDepartemen
	private TestObject btnTerapkan
	private TestObject btnTgl
	private TestObject btnTglStartDate
	private TestObject btnTglEndDate
	private TestObject btnTglStartMonth
	private TestObject btnTglEndMonth
	private TestObject btnTglStartYear
	private TestObject btnTglEndYear
	private TestObject btnSave
	private TestObject btnReset
	private TestObject btnPaginationNext
	private TestObject btnLastPages
	private TestObject btnPreviousPage
	private TestObject btnFirstPage
	private TestObject btndropdown
	private TestObject btnSelect5
	private TestObject btnSelect10
	private TestObject btnSelect25

	def CutiPages(String StartMonth, String StartYear, String StartDate, String EndMonth, String EndYear, String EndDate) {
		//Search Name
		searchField = ObjectGlobal.getTestObject("//input[@id='search']")
		btnSearch = ObjectGlobal.getTestObject("//button[text()='Search']")
		//Filter Departemen
		btnfilterField = ObjectGlobal.getTestObject("//button[contains(@class, 'MuiButton-containedSecondary')]")
		searchDepartemen = ObjectGlobal.getTestObject("//input[@id='job_departement']")
		selectDepartemen = ObjectGlobal.getTestObject("//li[@id='job_departement-option-2']")
		btnTerapkan = ObjectGlobal.getTestObject("//button[text()='Terapkan']")
		//Filter Tanggal
		btnTgl = ObjectGlobal.getTestObject("//button[@aria-label='toggle password visibility']")
		btnTglStartMonth = ObjectGlobal.getTestObject("//select/option[text()='${StartMonth}']")
		btnTglStartYear = ObjectGlobal.getTestObject("//select/option[@value='${StartYear}']")
		btnTglStartDate = ObjectGlobal.getTestObject("//span[text()='${StartDate}']")
		btnTglEndMonth = ObjectGlobal.getTestObject("//select/option[text()='${EndMonth}']")
		btnTglEndYear = ObjectGlobal.getTestObject("//select/option[@value='${EndYear}']")
		btnTglEndDate = ObjectGlobal.getTestObject("//span[text()='${EndDate}']")
		btnSave = ObjectGlobal.getTestObject("//button[text()='save']")
		btnReset = ObjectGlobal.getTestObject("//button[text()='Reset']")
		//Pagination
		btndropdown = ObjectGlobal.getTestObject("//div[contains(@class, 'MuiSelect-select')]")
		btnSelect5 = ObjectGlobal.getTestObject("//li[@data-value='5']")
		btnSelect10 = ObjectGlobal.getTestObject("//li[@data-value='10']")
		btnSelect25 = ObjectGlobal.getTestObject("//li[@data-value='25']")
		btnPaginationNext = ObjectGlobal.getTestObject("//button[@aria-label='Go to next page']")
		btnLastPages = ObjectGlobal.getTestObject("//button[@aria-label='Go to last page']")
		btnPreviousPage = ObjectGlobal.getTestObject("//button[@aria-label='Go to previous page']")
		btnFirstPage = ObjectGlobal.getTestObject("//button[@aria-label='Go to first page']")
	}

	def cuti(String search, String Departmen) {
		//Search Name
		WebUI.setText(searchField, search)
		//Filter Tgl
		WebUI.click(btnTgl)
		WebUI.click(btnTglStartMonth)
		WebUI.click(btnTglStartYear)
		WebUI.click(btnTglStartDate)
		WebUI.click(btnTglEndMonth)
		WebUI.click(btnTglEndYear)
		WebUI.click(btnTglEndDate)
		WebUI.click(btnSave)
		//Filter Departemen
		WebUI.click(btnfilterField)
		WebUI.setText(searchDepartemen, Departmen)
		WebUI.click(selectDepartemen)
		WebUI.click(btnTerapkan)
		// Take Screenshot after applying departemen filter
		WebUI.takeScreenshot("screenshots/departemen_filtered.png")
		WebUI.click(btnSearch)
		// Take Screenshot after applying date filters
		WebUI.takeScreenshot("screenshots/date_filtered.png")
		//Pagination
		// Pagination: Pilih nilai dropdown pertama 25
		WebUI.scrollToElement(btndropdown, 5)
		WebUI.takeScreenshot("screenshots/scroll_to_dropdown_25.png") // Screenshot setelah ScrollToElement
		WebUI.click(btndropdown)
		WebUI.click(btnSelect25)
		WebUI.delay(2)
		WebUI.takeScreenshot("screenshots/select_25.png") // Screenshot setelah memilih 25

		// Pagination: Pilih nilai dropdown pertama 10
		WebUI.scrollToElement(btndropdown, 5)
		WebUI.takeScreenshot("screenshots/scroll_to_dropdown_10.png") // Screenshot setelah ScrollToElement
		WebUI.click(btndropdown)
		WebUI.click(btnSelect10)
		WebUI.delay(2)
		WebUI.takeScreenshot("screenshots/select_10.png") // Screenshot setelah memilih 10

		// Pagination: Pilih nilai dropdown pertama 5
		WebUI.scrollToElement(btndropdown, 5)
		WebUI.takeScreenshot("screenshots/scroll_to_dropdown_5.png") // Screenshot setelah ScrollToElement
		WebUI.click(btndropdown)
		WebUI.click(btnSelect5)
		WebUI.delay(2)
		WebUI.takeScreenshot("screenshots/select_5.png") // Screenshot setelah memilih 5
		for (int i = 0; i < 2; i++) {
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
		// Loop for Last Page button
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

		for (int i = 0; i < 2; i++) {
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
		WebUI.takeScreenshot("screenshots/first_page.png")
		// Reset
		WebUI.click(btnReset)
		// Take Screenshot after resetting the form
		WebUI.takeScreenshot("screenshots/form_reset.png")
	}
}
