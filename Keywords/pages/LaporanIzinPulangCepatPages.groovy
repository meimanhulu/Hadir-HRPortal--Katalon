package pages

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
import org.openqa.selenium.WebElement
import com.kms.katalon.core.testobject.ConditionType
import java.text.SimpleDateFormat
import java.util.Date

public class LaporanIzinPulangCepatPages {
	private static TestObject SEARCH_INPUT = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//input[@id='search']")
	private static TestObject SEARCH_BUTTON = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//button[@type='submit']")
	private static TestObject FILTER_BUTTON = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1k0lhp1']//*[name()='svg']")
	private static TestObject DEPARTMENT_INPUT_FIELD = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[@id=\"job_departement\"]")
	private static TestObject FIRST_DEPARTMENT_INPUT_OPTION = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[@id=\"job_departement-option-0\"]")
	private static TestObject FILTER_SAVE_BUTTON = new TestObject().addProperty("xpath", ConditionType.EQUALS, "/html/body/div[3]/div[3]/div/form/div[2]/button[2]")
	private static TestObject FILTER_DATE_BUTTON = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-7 MuiGrid-grid-lg-8 css-kw2xn2']//div[1]//div[1]//div[1]//button[1]")
	private static TestObject FILTER_START_YEAR_SELECT = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//span[@class='rdrYearPicker']//select")
	private static TestObject FILTER_START_MONTH_SELECT = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//span[@class='rdrMonthPicker']//select")
	private static TestObject FILTER_END_YEAR_SELECT = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//span[@class='rdrYearPicker']//select")
	private static TestObject FILTER_END_MONTH_SELECT = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//span[@class='rdrYearPicker']//select")
	private static TestObject FILTER_RESET_BUTTON = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//button[normalize-space()='Reset']")
	private static TestObject ROWS_PER_PAGE_SELECT = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//div[@id='mui-3']")
	private static TestObject ROWS_PER_PAGE_OPTION_5 = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//ul/li[text()='5']")
	private static TestObject ROWS_PER_PAGE_OPTION_10 = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//ul/li[text()='10']")
	private static TestObject ROWS_PER_PAGE_OPTION_25 = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//ul/li[text()='25']")
	private static TestObject DATA_TABLE = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//tbody/tr")
	private static TestObject NEXT_PAGE_BUTTON = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//button[@title='Go to next page']//*[name()='svg']")
	private static TestObject DISPLAYED_ROWS = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//p[@class='MuiTablePagination-displayedRows css-kim0d']")
	private static TestObject PREVIOUS_PAGE_BUTTON = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//button[@title='Go to previous page']//*[name()='svg']")
	private static TestObject LAST_PAGE_BUTTON = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//button[@title='Go to last page']//*[name()='svg']")
	private static TestObject FIRST_PAGE_BUTTON = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//button[@title='Go to first page']//*[name()='svg']")
	private static TestObject MENU = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//p[text()='Laporan']")
	private static TestObject SUBMENU = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//p[text()='Izin Pulang Cepat']")
	private static TestObject START_DATE_INPUT = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//input[@placeholder='Start Date']");
	private static TestObject END_DATE_INPUT = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//input[@placeholder='End Date']");
	private static TestObject DATA_TABLE_TBODY = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//tbody");

	static int getNumberOfTableRows() {
		if (WebUI.getText(DATA_TABLE_TBODY).isEmpty()) {
			return 0;
		}
		List<WebElement> dataTableElements = WebUI.findWebElements(DATA_TABLE, 10)
		return dataTableElements.size()
	}

	static def inputName(String name) {
		WebUI.setText(SEARCH_INPUT, name)
	}

	static def pressSearchButton() {
		WebUI.click(SEARCH_BUTTON)
	}

	static boolean verifySearchResult(String expectedName) {
		for(int i = 0; i < getNumberOfTableRows(); i++) {
			TestObject nameDataFromTable = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//tbody/tr[" + (i + 1) + "]/td[2]/h6[1]")
			boolean isValid = WebUI.getText(nameDataFromTable).toLowerCase().contains(expectedName.toLowerCase())
			if (!isValid) {
				return false
			}
		}
		return true
	}

	static def inputDepartment(String department) {
		WebUI.click(FILTER_BUTTON)
		WebUI.setText(DEPARTMENT_INPUT_FIELD, department)
		WebUI.click(FIRST_DEPARTMENT_INPUT_OPTION)
	}

	static def pressFilterSaveButton() {
		WebUI.click(FILTER_SAVE_BUTTON)
	}

	static boolean verifyDepartmentFilterResult(String expectedDepartment) {
		for(int i = 0; i < getNumberOfTableRows(); i++) {
			TestObject departmentDataFromTableElement = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//tbody/tr[" + (i + 1) + "]/td[4]/h6[1]")
			boolean isValid = WebUI.getText(departmentDataFromTableElement).equals(expectedDepartment)
			if (!isValid) {
				return false
			}
		}
		return true
	}

	static def inputFilterStartDate(String startDate) {
		String[] startDateArray = startDate.split("/")
		WebUI.click(FILTER_DATE_BUTTON)
		WebUI.click(FILTER_START_YEAR_SELECT)
		TestObject filterStartYearSelectOption = new TestObject().addProperty("xpath", ConditionType.EQUALS, "/html/body/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[1]/div[3]/div/div/div[1]/div[2]/span/span[3]/select/option[@value='" + startDateArray[2] + "']")
		WebUI.click(filterStartYearSelectOption)
		WebUI.click(FILTER_START_MONTH_SELECT)
		TestObject filterStartMonthSelectOption = new TestObject().addProperty("xpath", ConditionType.EQUALS,  "/html/body/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[1]/div[3]/div/div/div[1]/div[2]/span/span[1]/select/option[@value='" + (Integer.parseInt(startDateArray[1]) - 1) + "']")
		WebUI.click(filterStartMonthSelectOption)
		TestObject filterStartDay = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//div[@class='rdrDays']/button/span/span[text()='" + Integer.parseInt(startDateArray[0]) + "']")
		List<WebElement> filterStartDays = WebUI.findWebElements(filterStartDay, 10)
		if (filterStartDays.size() > 1 && Integer.parseInt(startDateArray[0]) > 15) {
			filterStartDays.get(1).click();
		} else {
			filterStartDays.get(0).click();
		}
	}

	static def inputFilterEndDate(String endDate) {
		
		String[] endDateArray = endDate.split("/")
		WebUI.click(FILTER_END_YEAR_SELECT)
		TestObject filterEndYearSelectOption = new TestObject().addProperty("xpath", ConditionType.EQUALS, "/html/body/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[1]/div[3]/div/div/div[1]/div[2]/span/span[3]/select/option[@value='" + endDateArray[2] + "']")
		WebUI.click(filterEndYearSelectOption)
		WebUI.click(FILTER_END_MONTH_SELECT)
		TestObject filterEndMonthSelectOption = new TestObject().addProperty("xpath", ConditionType.EQUALS,  "/html/body/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[1]/div[3]/div/div/div[1]/div[2]/span/span[1]/select/option[@value='" + (Integer.parseInt(endDateArray[1]) - 1) + "']")
		WebUI.click(filterEndMonthSelectOption)
		TestObject filterEndDay = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//div[@class='rdrDays']/button/span/span[text()='" + Integer.parseInt(endDateArray[0]) + "']")
		List<WebElement> filterEndDays = WebUI.findWebElements(filterEndDay, 10)
		if (filterEndDays.size() > 1 && Integer.parseInt(endDateArray[0]) > 15) {
			filterEndDays.get(1).click();
		} else {
			filterEndDays.get(0).click();
		}
	}

	static boolean verifyStartDateFilterResult(String expectedStartDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy")
		Date expectedStartDateParsed = sdf.parse(expectedStartDate)
		for (int i = 0; i < getNumberOfTableRows(); i++) {
			TestObject dateDataFromTable = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//tbody/tr[" + (i + 1) + "]/td[5]/h6[1]")
			sdf = new SimpleDateFormat("dd MMM yyyy", new Locale("id", "ID"))
			Date dateDataFromTableParsed = sdf.parse(WebUI.getText(dateDataFromTable))
			boolean isValid = expectedStartDateParsed.before(dateDataFromTableParsed) || expectedStartDateParsed.equals(dateDataFromTableParsed)
			if (!isValid) {
				return false
			}
		}
		return true;
	}

	static boolean verifyEndDateFilterResult(String expectedEndDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy")
		Date expectedEndDateParsed = sdf.parse(expectedEndDate)
		for (int i = 0; i < getNumberOfTableRows(); i++) {
			TestObject dateDataFromTable = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//tbody/tr[" + (i + 1) + "]/td[5]/h6[1]")
			sdf = new SimpleDateFormat("dd MMM yyyy", new Locale("id", "ID"))
			Date dateDataFromTableParsed = sdf.parse(WebUI.getText(dateDataFromTable))
			boolean isValid = expectedEndDateParsed.after(dateDataFromTableParsed) || expectedEndDateParsed.equals(dateDataFromTableParsed)
			if (!isValid) {
				return false
			}
		}
		return true;
	}

	static def pressFilterResetButton() {
		WebUI.click(FILTER_RESET_BUTTON)
	}

	static def changeRowsPerPage(int rowsPerPage) {
		WebUI.click(ROWS_PER_PAGE_SELECT)
		switch (rowsPerPage) {
			case 5:
				WebUI.click(ROWS_PER_PAGE_OPTION_5)
				break
			case 10:
				WebUI.click(ROWS_PER_PAGE_OPTION_10)
				break
			case 25:
				WebUI.click(ROWS_PER_PAGE_OPTION_25)
				break
			default:
				WebUI.click(ROWS_PER_PAGE_OPTION_10)
				break
		}
	}

	static def pressNextPageButton() {
		WebUI.click(NEXT_PAGE_BUTTON)
	}

	static boolean isSecondPage() {
		int rowsPerPage = Integer.parseInt(WebUI.getText(ROWS_PER_PAGE_SELECT))
		int rowsFrom = Integer.parseInt(WebUI.getText(DISPLAYED_ROWS).split("-")[0])
		return rowsPerPage + 1 == rowsFrom
	}

	static def pressPreviousPageButton() {
		WebUI.click(PREVIOUS_PAGE_BUTTON)
	}

	static boolean isFirstPage() {
		int rowsFrom = Integer.parseInt(WebUI.getText(DISPLAYED_ROWS).split("-")[0])
		return rowsFrom == 1
	}

	static def pressLastPageButton() {
		WebUI.click(LAST_PAGE_BUTTON)
	}

	static boolean isLastPage() {
		int rowsTo = Integer.parseInt(WebUI.getText(DISPLAYED_ROWS).split("-")[1].split(" of ")[0]);
		int rowsOf = Integer.parseInt(WebUI.getText(DISPLAYED_ROWS).split(" of ")[1]);
		return rowsTo == rowsOf;
	}

	static def pressFirstPageButton() {
		WebUI.click(FIRST_PAGE_BUTTON)
	}

	static def open() {
		WebUI.click(MENU)
		WebUI.click(SUBMENU)
	}

	static boolean isDataShowed() {
		return getNumberOfTableRows() > 0
	}

	static boolean isStartDateFilled() {
		return !WebUI.getAttribute(START_DATE_INPUT, "value").isEmpty();
	}

	static boolean isEndDateFilled() {
		return !WebUI.getAttribute(END_DATE_INPUT, "value").isEmpty();
	}
}
