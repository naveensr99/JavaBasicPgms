package ecolab.koerber.utils;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

  private RandomUtils() {}

  static SecureRandom random = new SecureRandom();
  private static int maxRange = 1000000;

  public static int generateInt() {
    return generateInt(maxRange);
  }
  
  public static String generateText() {
    return "AutoTest" + generateInt(maxRange);
  }

  public static long generateTenDigitNumber() {
    ThreadLocalRandom random = ThreadLocalRandom.current();
    return random.nextLong(1_000_000_000L, 10_000_000_000L);
  }

  public static int generateInt(int n) {
    return 1+random.nextInt(n);
  }
  public static String generateLp(int i) {
	    return "USLP0000000000" + generateInt(maxRange);
	  }
  public static String generateLot(int i) {
	    return "1GE3" + generateInt(maxRange);
	  }
}



==========================



	
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import ecolab.koerber.base.DriverManager;
import ecolab.koerber.base.WrapperClass;
import ecolab.koerber.utils.PropertyStorage;
import io.cucumber.java.en.Then;

public class MainNavigation {

	public MainNavigation() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	private static final String GEN_TEXT = "//span[text()='%s']";

	private static final String WAREHOUSE = "//ul[@class='k-list k-reset']//li[@class='k-item k-state-selected k-state-focused' and text()='<ANY>']/following-sibling::li[contains(text(),'%s')]";

	private static final String PRIMARY_WAREHOUSE = "//ul[@class='k-list k-reset']//li[@class='k-item' and text()='<Select Warehouse>']/following-sibling::li[contains(text(),'%s')]";

	@FindBy(xpath = "//span[text()='Planned Moves']")
	WebElement plannedMoves;

	@FindBy(xpath = "//span[text()='Replenishments']")
	WebElement replenishments;

	@FindBy(xpath = "//span[text()='Forward Pick Locations']")
	WebElement forwardPickLocations;

	@FindBy(xpath = "//span[text()='Select']")
	WebElement select;

	@FindBy(xpath = "//span[text()='K�rber One Mobile']")
	public WebElement koerberOneMobile;

	@FindBy(xpath = "//span[@class='title' and text()='Login']")
	WebElement loginKorber;

	@FindBy(xpath = "//div[contains(text(),'Inventory')]")
	WebElement Inventory;

	@FindBy(xpath = "//div[contains(text(),'Inventory Adjust')]")
	WebElement k1MobileInventoryAdjustment;

	@FindBy(xpath = "//span[contains(text(),'Inventory Adjust')]")
	WebElement inventoryAdjustmentTab;

	@FindBy(xpath = "//input[@class='k-textbox' and @type='text']")
	WebElement inputField;

	@FindBy(xpath = "//span[normalize-space()='Cycle Counting']")
	WebElement cycleCounting;

	@FindBy(xpath = "//span[normalize-space()='Schedule Cycle Counts']")
	WebElement scheduleCycleCounts;

	@FindBy(xpath = "//span[normalize-space()='Generate Cycle Counts']")
	WebElement generateCycleCounts;

	@FindBy(xpath = "//span[text()='Search Item Setup']")
	WebElement SearchItemSetup;

	@FindBy(xpath = "//span[contains(text(),'<ANY>')]")
	WebElement WarehouseID;

	@FindBy(xpath = "//hj-field-group-row[2]//div[1]//hj-field-cell[1]//div[1]//hj-field-control[1]//div[1]//div[1]//span[1]//hj-template[1]//div[1]//div[2]//hj-textbox[1]//input[1]")
	WebElement Item_No;

	@FindBy(xpath = "//span[normalize-space()='Search']")
	WebElement Search;

	@FindBy(xpath = "//span[text()='K.Motion Advanced Fulfillment Application']")
	WebElement Kmot_FulfillmentApp;

	@FindBy(xpath = "//div[contains(text(),'Movement')]")
	WebElement Movement;

	@FindBy(xpath = "//div[contains(text(),'Create Pickup')]")
	WebElement CreatePickup;

	@FindBy(xpath = "//div[@class='functionKeysContainerInner']//div[@class='table-cell' and text()='QC']")
	WebElement F6Button;

//	@FindBy(xpath = "//*[@id=\"menu\"]/ul/li[3]/a/span[1]")
	@FindBy(xpath = "//span[contains(text(),'One Mobile')]")
	WebElement KoerberOneMobile;

	@FindBy(xpath = "//*[@id=\"menu\"]/ul/li[3]/ul/li[1]/a/span")
	public WebElement LoginKorber;

	@FindBy(xpath = "//div[contains(text(),'Cycle Count')]")
	WebElement Cyclecount;

	@FindBy(xpath = "//div[contains(text(),'View Inventory')]")
	WebElement ViewInventory;

	@FindBy(xpath = "//span[text()='Load Planning']")
	WebElement loadplanning;

	@FindBy(xpath = "//span[text()='View Load']")
	WebElement viewload;

	@FindBy(xpath = "//span[text()='Warehouse Setup']")
	WebElement warehouseSetup;

	@FindBy(xpath = "//span[text()='Locations']")
	WebElement loct1;

//	@FindBy(id = "menuButtonToggle")
	@FindBy(xpath = "//a[@href= '#' and @id ='menuButtonToggle']")
	public WebElement menuButton;

	@FindBy(xpath = "//a[@href='#']//span[text()='Supply Chain Advantage']")
	WebElement supplyChainAdvantageTab;

	@FindBy(xpath = "//span[text()='K.Motion Advantage Dashboard']")
	WebElement advantageDashboardTab;

	@FindBy(xpath = "//span[text()='Yard Management']")
	WebElement yardManagement;

	@FindBy(xpath = "//span[text()='Trailer Management']")
	public WebElement trailerManagement;

	@FindBy(xpath = "//span[text()='Inventory']")
	WebElement inventoryTab;

	@FindBy(xpath = "//span[text()='Quality Control']")
	WebElement qualityControl;

	@FindBy(xpath = "//span[text()='Hold and Release Inventory']")
	WebElement holdReleaseInventoryTab;

	@FindBy(xpath = "//span[text()='Warehouse ID']/ancestor::div[@data-hj-test-id='field-cell']//span[text()='<ANY>']")
	public WebElement wHDropDownInboundAppointmentPage;

	@FindBy(xpath = "//ul[@class='k-list k-reset']//li[@class='k-item k-state-selected k-state-focused' and text()='<ANY>']/following-sibling::li[text()='US13 - US13 - Joliet ECCC']")
	public WebElement wHInboundAppointmentPage13;

	@FindBy(xpath = "//span[text()='PO Number']/ancestor::div[@data-hj-test-id='field-cell']//Input[@class='k-textbox' and @type='text']")
	WebElement poFieldInboundAppointmentPage;

	@FindBy(xpath = "//span[text()='K.Motion Warehouse Advantage']")
	WebElement kMotionWarehouseAdvTab;

	@FindBy(xpath = "//span[text()='Query']")
	static WebElement queryButton;

	@FindBy(xpath = "(//span[text()='Warehouse ID']/ancestor::div[@data-hj-test-id='field-cell']//span[text()='<ANY>'])")
	public WebElement any_warehouse;

	@FindBy(xpath = "(//span[text()='*Warehouse ID']//following::span/span/span[@class='k-input'])[1]")
	public WebElement warehouse_ID;

	@FindBy(xpath = "//span[text()='Item Number']/ancestor::div[@data-hj-test-id='field-cell']//Input[@class='k-textbox' and @type='text']")
	WebElement ItemNumInputField;

	@FindBy(xpath = "//span[text()='Search']")
	WebElement search;

	@FindBy(xpath = "//div[@class='name']")
	WebElement userId;

	@FindBy(xpath = "//span[text()='K.Motion User Management']")
	WebElement kMotionUserMangementTab;

	@FindBy(xpath = "//span[text()='Employees']")
	WebElement employees;

	@FindBy(xpath = "//span[text()='Employee']/ancestor::div[@data-hj-test-id='field-cell']//Input[@class='k-textbox' and @type='text']")
	WebElement employeeInputField;

	public WebElement initializeWarehouseElement(String warehouseID) {
		WebElement warehouseSelect = DriverManager.getDriver()
				.findElement(By.xpath(String.format(WAREHOUSE, warehouseID)));
		return warehouseSelect;
	}

	public WebElement initializePrimaryWarehouseElement(String warehouseID) {
		WebElement warehouseSelect = DriverManager.getDriver()
				.findElement(By.xpath(String.format(PRIMARY_WAREHOUSE, warehouseID)));
		return warehouseSelect;
	}

	public void clickOnSupplyChainAdvantage() {
//		DriverManager.getWrapperClass().waitForPageLoaderToDisappear();
		DriverManager.getWrapperClass().clickWithJS(menuButton);
		DriverManager.getWrapperClass().waitForPageLoaderToDisappear();
		DriverManager.getWrapperClass().clickWithJS(supplyChainAdvantageTab);
		ExtentCucumberAdapter.addTestStepLog("Clicked on Supply Chain Dashboard");
	}

	public void clickOnAdvantageDashboard() {
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		DriverManager.getDriver().findElement(By.xpath(String.format(GEN_TEXT, "K.Motion Advantage Dashboard")))
				.click();
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		ExtentCucumberAdapter.addTestStepLog("Clicked on K motion Advantage Dashboard");
	}

	public void goToTrailerManagementPage() {
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		DriverManager.getDriver().findElement(By.xpath(String.format(GEN_TEXT, "Receiving"))).click();
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		DriverManager.getWrapperClass().click(yardManagement);
//		DriverManager.getDriver().findElement(By.xpath(String.format(text_Gen, "Yard Management"))).click();
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		DriverManager.getDriver().findElement(By.xpath(String.format(GEN_TEXT, "Trailer Management"))).click();
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		DriverManager.getDriver().findElement(By.xpath(String.format(GEN_TEXT, "Query"))).click();
		ExtentCucumberAdapter.addTestStepLog("Clicked on Trailer Management");
	}

	public void goToInboundAppointmentsPage(String poNumber) {
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		DriverManager.getDriver().findElement(By.xpath(String.format(GEN_TEXT, "Receiving"))).click();
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		DriverManager.getDriver().findElement(By.xpath(String.format(GEN_TEXT, "Appointments"))).click();
		DriverManager.getDriver().findElement(By.xpath(String.format(GEN_TEXT, "Inbound Appointments"))).click();
		DriverManager.getWrapperClass().waitForTimeOutInSec(5);
		DriverManager.getWrapperClass().selectWarehouse();

		DriverManager.getWrapperClass().waitTillElementClickable(poFieldInboundAppointmentPage);
		poFieldInboundAppointmentPage.clear();
		poFieldInboundAppointmentPage.sendKeys(poNumber);
		queryButton.click();
		ExtentCucumberAdapter.addTestStepLog("Clicked on Inbound Appointment");
	}

	public void goToForwardPickLocations() {
		DriverManager.getWrapperClass().click(plannedMoves);
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		DriverManager.getWrapperClass().click(replenishments);
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		DriverManager.getWrapperClass().click(forwardPickLocations);
		ExtentCucumberAdapter.addTestStepLog("Clicked on Forward Pick Location");
	}

	public void goToHoldAndReleaseInventory() {
		DriverManager.getWrapperClass().click(inventoryTab);
		DriverManager.getWrapperClass().click(qualityControl);
		DriverManager.getWrapperClass().click(holdReleaseInventoryTab);
		DriverManager.getWrapperClass().clickWithJS(menuButton);
		ExtentCucumberAdapter.addTestStepLog("Clicked on Hold and Release Inventory");
	}

	public void generateCycleCount() {
		DriverManager.getWrapperClass().click(inventoryTab);
		DriverManager.getWrapperClass().click(cycleCounting);
		DriverManager.getWrapperClass().click(scheduleCycleCounts);
		DriverManager.getWrapperClass().click(generateCycleCounts);
		ExtentCucumberAdapter.addTestStepLog("Clicked on Inventory and Inventory Adjust");
	}

	public void goToSearchItemAndWarehouseId(String itemNo) {
		DriverManager.getWrapperClass().click(SearchItemSetup);
		DriverManager.getWrapperClass().selectWarehouse();
		ItemNumInputField.sendKeys(itemNo);
		DriverManager.getWrapperClass().click(search);
	}

	public void goToMovementAndCreatePickup() {
		DriverManager.getWrapperClass().waitForTimeOutInSec(5);
		DriverManager.getWrapperClass().clickWithJS(Movement);
		DriverManager.getWrapperClass().waitForTimeOutInSec(5);
		DriverManager.getWrapperClass().clickWithJS(CreatePickup);

		DriverManager.getWrapperClass().click(F6Button);
		ExtentCucumberAdapter.addTestStepLog("Clicked on movement and create pickup");
		WrapperClass.embedScreenshot();
	}

	public void clickOnMenuButtonAndLoginToKoerber1Mobile() {
		boolean success = false;

		int attempts = 0;
		while (!success && attempts < 3) {
			try {
				DriverManager.getWrapperClass().click(menuButton);
				DriverManager.getWrapperClass().clickWithJS(KoerberOneMobile);
				DriverManager.getWrapperClass().waitForTimeOutInSec(5);
				DriverManager.getWrapperClass().click(LoginKorber);
				DriverManager.getWrapperClass().clickWithJS(menuButton);
				DriverManager.getWrapperClass().waitTillElementClickable(inputField);
				DriverManager.getWrapperClass().clickWithJS(inputField);
				inputField.clear();
				inputField.sendKeys(PropertyStorage.getWarehouseId() + userId.getText());
				inputField.sendKeys(Keys.ENTER);
				ExtentCucumberAdapter.addTestStepLog("Clicked on MenuBar and Loginto Koerber1 mobile");
				success = true;
			} catch (Exception e) {
				attempts++;
				if (attempts == 3) {
					throw e;
				}
			}
		}
	}

	public void loginToKoerber1Mobile() {
		DriverManager.getWrapperClass().clickWithJS(menuButton);
		DriverManager.getWrapperClass().waitForPageLoaderToDisappear();
		DriverManager.getWrapperClass().clickWithJS(koerberOneMobile);
		DriverManager.getWrapperClass().waitForTimeOutInSec(5);
		DriverManager.getWrapperClass().clickWithJS(loginKorber);
		DriverManager.getWrapperClass().clickWithJS(menuButton);
		ExtentCucumberAdapter.addTestStepLog("Clicked on MenuBar and Loginto Koerber1 mobile");
	}

	public void goToInventoryAndCycleCount() {
		DriverManager.getWrapperClass().click(Inventory);
		DriverManager.getWrapperClass().click(Cyclecount);
		DriverManager.getWrapperClass().click(menuButton);
		ExtentCucumberAdapter.addTestStepLog("Clicked on Inventory and Cycle count");
	}

	public void goToInventoryAndViewInventory() {
		DriverManager.getWrapperClass().clickWithJS(Inventory);
		DriverManager.getWrapperClass().waitForTimeOutInSec(10);
		DriverManager.getWrapperClass().clickWithJS(ViewInventory);
		DriverManager.getWrapperClass().waitForTimeOutInSec(5);
		ExtentCucumberAdapter.addTestStepLog("Clicked on Inventory and view Inventory");
	}

	public void goToSearchItemAndWarehouseId() {
		DriverManager.getWrapperClass().click(SearchItemSetup);
		DriverManager.getWrapperClass().click(WarehouseID);
		Item_No.sendKeys("1110049");
		DriverManager.getWrapperClass().click(Search);
	}

	public void clickOnFulfillmentApplication() {
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		DriverManager.getWrapperClass().clickWithJS(Kmot_FulfillmentApp);
		ExtentCucumberAdapter.addTestStepLog("K-Motion Advantage Fulfillment Application");
	}

	public void navigateToViewLoadPage() {
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		DriverManager.getWrapperClass().click(loadplanning);
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		DriverManager.getWrapperClass().click(viewload);
	}

	public void navigateToLocationAndQuery() {
		DriverManager.getWrapperClass().click(warehouseSetup);
		DriverManager.getWrapperClass().click(loct1);
	}

	public void navigateToInventoryAdjustmentPage() {
		DriverManager.getWrapperClass().waitForPageLoaderToDisappear();
		DriverManager.getWrapperClass().waitForTimeOutInSec(5);
		DriverManager.getWrapperClass().clickWithJS(menuButton);
		DriverManager.getWrapperClass().waitForPageLoaderToDisappear();
		DriverManager.getWrapperClass().clickWithJS(supplyChainAdvantageTab);
		ExtentCucumberAdapter.addTestStepLog("Clicked on Supply Chain Dashboard");
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		DriverManager.getWrapperClass().clickWithJS(advantageDashboardTab);
		ExtentCucumberAdapter.addTestStepLog("Clicked on K motion Advantage Dashboard");
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		DriverManager.getWrapperClass().clickWithJS(inventoryTab);
		DriverManager.getWrapperClass().clickWithJS(inventoryAdjustmentTab);
	}

//	public static void clickOnQuery() {
//		DriverManager.getWrapperClass().click(query);
//		ExtentCucumberAdapter.addTestStepLog("Clicked on query");
//	}

	public void clickOnWarehouseAdvantage() {
		DriverManager.getWrapperClass().clickWithJS(kMotionWarehouseAdvTab);
		ExtentCucumberAdapter.addTestStepLog("Clicked on K-motion Warehouse Advantage");
	}

	public void clickOnAdvDashboard() {
		DriverManager.getWrapperClass().waitForTimeOutInSec(2);
		DriverManager.getWrapperClass().clickWithJS(advantageDashboardTab);
		ExtentCucumberAdapter.addTestStepLog("Clicked on K motion Advantage Dashboard");
	}

	public void clickOnUserManagement() {
		DriverManager.getWrapperClass().clickWithJS(kMotionUserMangementTab);
		ExtentCucumberAdapter.addTestStepLog("Clicked on K-motion User Management");
	}

	public void clickOnEmployees() {
		DriverManager.getWrapperClass().clickWithJS(employees);
		ExtentCucumberAdapter.addTestStepLog("Clicked on Employees");
	}
}
