import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import pages.LaporanIzinPulangCepatPages as LaporanIzinPulangCepatPages

LaporanIzinPulangCepatPages.inputName('juned')

LaporanIzinPulangCepatPages.pressSearchButton()

LaporanIzinPulangCepatPages.inputDepartment('Brodo')

LaporanIzinPulangCepatPages.pressFilterSaveButton()

LaporanIzinPulangCepatPages.inputFilterStartDate('24/02/2025')

LaporanIzinPulangCepatPages.inputFilterEndDate('25/02/2025')

LaporanIzinPulangCepatPages.pressSearchButton()

LaporanIzinPulangCepatPages.pressFilterResetButton()

WebUI.delay(3)

WebUI.verifyEqual(LaporanIzinPulangCepatPages.verifySearchResult('juned'), false)

WebUI.verifyEqual(LaporanIzinPulangCepatPages.verifyDepartmentFilterResult('Brodo'), false)

WebUI.verifyEqual(LaporanIzinPulangCepatPages.isStartDateFilled(), false)

WebUI.verifyEqual(LaporanIzinPulangCepatPages.isEndDateFilled(), false)