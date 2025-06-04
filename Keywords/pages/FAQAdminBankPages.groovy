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

public class FAQAdminBankPages {
	ObjectGlobalPages ObjectGlobal = new ObjectGlobalPages()

	private TestObject FAQ01
	private TestObject FAQ02
	private TestObject FAQ03
	private TestObject FAQ04
	private TestObject FAQ05
	private TestObject FAQ06
	private TestObject FAQ07
	private TestObject FAQ08
	private TestObject FAQ09
	private TestObject FAQ10
	private TestObject FAQ11
	private TestObject FAQ12
	private TestObject FAQ13
	private TestObject FAQ14
	private TestObject FAQ15
	private TestObject FAQ16
	private TestObject FAQ17
	private TestObject FAQ18
	private TestObject FAQ19
	private TestObject FAQ20
	private TestObject FAQ21
	private TestObject FAQ22
	private TestObject FAQ23


	def FAQAdminBankPages() {
		//FAQ Button
		FAQ01 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[1]")
		FAQ02 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[2]")
		FAQ03 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[3]")
		FAQ04 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[4]")
		FAQ05 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[5]")
		FAQ06 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[6]")
		FAQ07 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[7]")
		FAQ08 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[8]")
		FAQ09 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[9]")
		FAQ10 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[10]")
		FAQ11 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[11]")
		FAQ12 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[12]")
		FAQ13 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[13]")
		FAQ14 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[14]")
		FAQ15 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[15]")
		FAQ16 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[16]")
		FAQ17 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[17]")
		FAQ18 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[18]")
		FAQ19 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[19]")
		FAQ20 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[20]")
		FAQ21 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[21]")
		FAQ22 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[22]")
		FAQ23 = ObjectGlobal.getTestObject("//div[2]/div[2]/div/div[2]/div/div[23]")
	}

	def FAQcheck() {
		WebUI.verifyElementPresent(FAQ01, 10)
		WebUI.click(FAQ01)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq01")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ01, 10)  // Verify again before clicking
		WebUI.click(FAQ01)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq01")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ02, 10)
		WebUI.click(FAQ02)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq02")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ02, 10)  // Verify again before clicking
		WebUI.click(FAQ02)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq02")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ03, 10)
		WebUI.click(FAQ03)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq03")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ03, 10)  // Verify again before clicking
		WebUI.click(FAQ03)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq03")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ04, 10)
		WebUI.click(FAQ04)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq04")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ04, 10)  // Verify again before clicking
		WebUI.click(FAQ04)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq04")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ05, 10)
		WebUI.click(FAQ05)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq05")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ05, 10)  // Verify again before clicking
		WebUI.click(FAQ05)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq05")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ06, 10)
		WebUI.click(FAQ06)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq06")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ06, 10)  // Verify again before clicking
		WebUI.click(FAQ06)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq06")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ07, 10)
		WebUI.scrollToElement(FAQ07, 5)  // Scroll only after verifying
		WebUI.click(FAQ07)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq07")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ07, 10)  // Verify again before clicking
		WebUI.click(FAQ07)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq07")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ08, 10)
		WebUI.scrollToElement(FAQ08, 5)  // Scroll only after verifying
		WebUI.click(FAQ08)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq08")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ08, 10)  // Verify again before clicking
		WebUI.click(FAQ08)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq08")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ09, 10)
		WebUI.scrollToElement(FAQ09, 5)  // Scroll only after verifying
		WebUI.click(FAQ09)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq09")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ09, 10)  // Verify again before clicking
		WebUI.click(FAQ09)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq09")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ10, 10)
		WebUI.scrollToElement(FAQ10, 5)  // Scroll only after verifying
		WebUI.click(FAQ10)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq10")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ10, 10)  // Verify again before clicking
		WebUI.click(FAQ10)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq10")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ11, 10)
		WebUI.scrollToElement(FAQ11, 5)  // Scroll only after verifying
		WebUI.click(FAQ11)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq11")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ11, 10)  // Verify again before clicking
		WebUI.click(FAQ11)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq11")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ12, 10)
		WebUI.scrollToElement(FAQ12, 5)  // Scroll only after verifying
		WebUI.click(FAQ12)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq12")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ12, 10)  // Verify again before clicking
		WebUI.click(FAQ12)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq12")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ13, 10)
		WebUI.scrollToElement(FAQ13, 5)  // Scroll only after verifying
		WebUI.click(FAQ13)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq13")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ13, 10)  // Verify again before clicking
		WebUI.click(FAQ13)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq13")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ14, 10)
		WebUI.scrollToElement(FAQ14, 5)  // Scroll only after verifying
		WebUI.click(FAQ14)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq14")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ14, 10)  // Verify again before clicking
		WebUI.click(FAQ14)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq14")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ15, 10)
		WebUI.scrollToElement(FAQ15, 5)  // Scroll only after verifying
		WebUI.click(FAQ15)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq15")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ15, 10)  // Verify again before clicking
		WebUI.click(FAQ15)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq15")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ16, 10)
		WebUI.scrollToElement(FAQ16, 5)  // Scroll only after verifying
		WebUI.click(FAQ16)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq16")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ16, 10)  // Verify again before clicking
		WebUI.click(FAQ16)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq16")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ17, 10)
		WebUI.scrollToElement(FAQ17, 5)  // Scroll only after verifying
		WebUI.click(FAQ17)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq17")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ17, 10)  // Verify again before clicking
		WebUI.click(FAQ17)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq17")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ18, 10)
		WebUI.scrollToElement(FAQ18, 5)  // Scroll only after verifying
		WebUI.click(FAQ18)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq18")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ18, 10)  // Verify again before clicking
		WebUI.click(FAQ18)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq18")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ19, 10)
		WebUI.scrollToElement(FAQ19, 5)  // Scroll only after verifying
		WebUI.click(FAQ19)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq19")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ19, 10)  // Verify again before clicking
		WebUI.click(FAQ19)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq19")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ20, 10)
		WebUI.scrollToElement(FAQ20, 5)  // Scroll only after verifying
		WebUI.click(FAQ20)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq20")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ20, 10)  // Verify again before clicking
		WebUI.click(FAQ20)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq20")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ21, 10)
		WebUI.scrollToElement(FAQ21, 5)  // Scroll only after verifying
		WebUI.click(FAQ21)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq21")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ21, 10)  // Verify again before clicking
		WebUI.click(FAQ21)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq21")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ22, 10)
		WebUI.scrollToElement(FAQ22, 5)  // Scroll only after verifying
		WebUI.click(FAQ22)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq22")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ22, 10)  // Verify again before clicking
		WebUI.click(FAQ22)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq22")  // Screenshot after clicking second time with description

		WebUI.verifyElementPresent(FAQ23, 10)
		WebUI.scrollToElement(FAQ23, 5)  // Scroll only after verifying
		WebUI.click(FAQ23)
		WebUI.takeScreenshot("Screenshot_Klik_Pertama_Faq23")  // Screenshot after clicking first time with description
		WebUI.verifyElementPresent(FAQ23, 10)  // Verify again before clicking
		WebUI.click(FAQ23)
		WebUI.takeScreenshot("Screenshot_Klik_Kedua_Faq23")  // Screenshot after clicking second time with description
	}
}
