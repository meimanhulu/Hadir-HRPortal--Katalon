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

public class BillerCategoryPages{
	ObjectGlobalPages ObjectGlobal = new ObjectGlobalPages()

	private TestObject searchField
	private TestObject searchField2
	private TestObject searchField3
	private TestObject searchField4
	private TestObject searchField5
	private TestObject searchField6
	private TestObject btnApply
	private TestObject btnShow
	private TestObject btnShow2
	private TestObject btnBill
	private TestObject btnPurc
	private TestObject btnSimpMenu
	private TestObject btnEdit
	private TestObject btnBack
	private TestObject btnCancel
	private TestObject btnTog
	private TestObject btnSave
	private TestObject btnYes
	private TestObject btnNo
	private TestObject btnOK
	private TestObject fieldDesc
	private TestObject fieldCod
	private TestObject fieldTrans
	private TestObject btnInact




	def BillerCategoryPages() {
		//Search
		searchField = ObjectGlobal.getTestObject("//input[@placeholder='Search...']")
		searchField2 = ObjectGlobal.getTestObject("//input[@placeholder='Search...']")
		searchField3 = ObjectGlobal.getTestObject("//input[@placeholder='Search...']")
		searchField4 = ObjectGlobal.getTestObject("//input[@placeholder='Search...']")
		searchField5 = ObjectGlobal.getTestObject("//input[@placeholder='Search...']")
		searchField6 = ObjectGlobal.getTestObject("//input[@placeholder='Search...']")
		btnApply = ObjectGlobal.getTestObject("//button[.//span[text()='Apply']]")
		btnShow = ObjectGlobal.getTestObject("//input[@aria-owns='rc_select_0_list']")
		btnShow2 = ObjectGlobal.getTestObject("//span[@class='ant-select-selection-item'][normalize-space()='BILLPAYMENT']")
		btnBill = ObjectGlobal.getTestObject("//div[@class='ant-select-item-option-content'][normalize-space()='BILLPAYMENT']")
		btnPurc = ObjectGlobal.getTestObject("//*[@class = 'ant-select-item-option-content' and (text() = 'PURCHASE' or . = 'PURCHASE')]")

		//Edit
		btnEdit = ObjectGlobal.getTestObject("//li/span[text()='Edit']")
		btnSimpMenu = ObjectGlobal.getTestObject("//button[@aria-controls='simple-menu']")
		btnBack = ObjectGlobal.getTestObject("//button/span[text()='Back']")
		btnSave = ObjectGlobal.getTestObject("//*[@type = 'button' and (text() = 'Save' or . = 'Save')]")
		btnCancel = ObjectGlobal.getTestObject("//button/span[text()='Cancel']")
		btnYes = ObjectGlobal.getTestObject("//*[@type = 'button' and (text() = 'Yes' or . = 'Yes')]")
		btnNo = ObjectGlobal.getTestObject("//*[@type = 'button' and (text() = 'No' or . = 'No')]")
		btnOK = ObjectGlobal.getTestObject("//*[@type = 'button' and (text() = 'OK' or . = 'OK')]")
		//Edit Biller Form
		//		fieldTrans = ObjectGlobal.getTestObject("//input[@type='text' and @placeholder='Transaction Code' and @value='PAYMENT']")
		//		fieldCod = ObjectGlobal.getTestObject("//input[@type='text' and @placeholder='Code' and @value='PURCHASE_PHONE']")
		fieldDesc = ObjectGlobal.getTestObject("//textarea[@placeholder='Add Description']")
		btnTog = ObjectGlobal.getTestObject("//input[contains(@class, 'MuiSwitch-input') and @type='checkbox']")
		//Inactive
		btnInact = ObjectGlobal.getTestObject("//span[text()='Inactive']")
	}

	def paycode(String search) {
		// FilterShow
		WebUI.click(btnShow)
		WebUI.takeFullPageScreenshot()
		WebUI.click(btnBill)
		WebUI.takeFullPageScreenshot()
		WebUI.click(btnApply)
		WebUI.takeFullPageScreenshot()
		WebUI.delay(2)

		WebUI.setText(searchField, search)
		WebUI.delay(3)
		WebUI.takeFullPageScreenshot()
		WebUI.sendKeys(searchField, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(searchField, Keys.chord(Keys.BACK_SPACE))
		WebUI.takeFullPageScreenshot()
	}

	def paycategoryEN(String search2) {
		// Isi searchField dan hapus teks setelahnya
		WebUI.setText(searchField2, search2)
		WebUI.verifyElementText(searchField2, search2, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.takeFullPageScreenshot()
		WebUI.sendKeys(searchField2, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(searchField2, Keys.chord(Keys.BACK_SPACE))
		WebUI.takeFullPageScreenshot()
	}

	def paycategoryID(String search3) {
		// Isi searchField dan hapus teks setelahnya
		WebUI.setText(searchField3, search3)
		WebUI.verifyElementText(searchField3, search3, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.takeFullPageScreenshot()
		WebUI.sendKeys(searchField3, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(searchField3, Keys.chord(Keys.BACK_SPACE))		//jika ingin menggunakan editData Slash dari control a sampai TakefullScreenshot
		WebUI.takeFullPageScreenshot()
	}

	def purcode(String search4) {
		//filter
		WebUI.click(btnShow2)
		WebUI.takeScreenshot("screenshots/after_btnShow2_click.png")
		WebUI.verifyElementText(btnPurc, 'PURCHASE', FailureHandling.STOP_ON_FAILURE)
		WebUI.click(btnPurc)
		WebUI.takeScreenshot("screenshots/after_btnPurc_click.png")
		WebUI.click(btnApply)
		WebUI.delay(2)
		WebUI.takeScreenshot("screenshots/after_btnApply_click.png")
		// Isi searchField dan hapus teks setelahnya
		WebUI.setText(searchField4, search4)
		WebUI.delay(3)
		WebUI.takeScreenshot("screenshots/after_search3.png")
		WebUI.sendKeys(searchField4, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(searchField4, Keys.chord(Keys.BACK_SPACE))
		WebUI.takeScreenshot("screenshots/after_clear_search4.png")
	}

	def purcategoryEN(String search5) {
		// Isi searchField dan hapus teks setelahnya
		WebUI.verifyElementPresent(searchField5, 5)
		WebUI.setText(searchField5, search5)
		WebUI.verifyElementText(searchField5, search5, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.takeScreenshot("screenshots/after_search2.png")
		WebUI.sendKeys(searchField3, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(searchField3, Keys.chord(Keys.BACK_SPACE))
		WebUI.takeScreenshot("screenshots/after_clear_search5.png")
	}

	def purcategoryID(String search6) {
		// Isi searchField dan hapus teks setelahnya
		WebUI.verifyElementPresent(searchField6, 5)
		WebUI.setText(searchField6, search6)
		WebUI.verifyElementText(searchField6, search6, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.takeScreenshot("screenshots/after_search4.png")
	}

	def editData(String description) {
		//Edit
		WebUI.click(btnSimpMenu)
		WebUI.click(btnEdit)
		WebUI.delay(2)
		//		WebUI.verifyElementText(fieldCod, 'PURCHASE_PHONE')
		//		WebUI.delay(2)
		WebUI.click(fieldDesc)
		WebUI.sendKeys(fieldDesc, description)
		WebUI.verifyElementText(fieldDesc, description)
		WebUI.verifyElementChecked(btnTog, 5)
		WebUI.takeFullPageScreenshot()
		WebUI.click(btnSave)
		WebUI.verifyElementText(btnYes, 'Yes', FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(btnYes)
		WebUI.verifyElementText(btnOK, 'OK', FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(btnOK)
		WebUI.delay(2)
	}

	def inactiveYes() {
		WebUI.click(btnSimpMenu)
		WebUI.verifyElementPresent(btnInact, 5)
		WebUI.verifyElementVisible(btnInact, 5)
		WebUI.click(btnInact)
		WebUI.delay(2)
		WebUI.verifyElementPresent(btnYes, 5)
		WebUI.verifyElementVisible(btnYes, 5)
		WebUI.verifyElementText(btnYes, 'Yes', FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(btnYes)
		WebUI.verifyElementPresent(btnOK, 5)
		WebUI.verifyElementVisible(btnOK, 5)
		WebUI.verifyElementText(btnOK, 'OK', FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(btnOK)
		WebUI.delay(2)
	}

	def inactiveNo() {
		WebUI.click(btnSimpMenu)
		WebUI.verifyElementPresent(btnInact, 5)
		WebUI.verifyElementVisible(btnInact, 5)
		WebUI.click(btnInact)
		WebUI.delay(2)
		WebUI.verifyElementPresent(btnNo, 5)
		WebUI.verifyElementVisible(btnNo, 5)
		WebUI.verifyElementText(btnNo, 'No', FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(btnNo)
		WebUI.delay(2)
	}
}