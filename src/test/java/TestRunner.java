package ecolab.koerber.singleTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ecolab.koerber.base.BrowserFactory;
import ecolab.koerber.base.WrapperClass;
import ecolab.koerber.utils.PropertyStorage;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions(features = ".\\src\\test\\resources\\features\\", monochrome = true,
    extraGlue = {"ecolab\\koerber\\stepdefinition",},
    plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/CucumberTestReport.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "rerun:target/rerun.txt"},
    tags = "@mhb")

public class TestRunner<CucumberFeatureWrapper> {
  private TestNGCucumberRunner testNGCucumberRunner;
  private BrowserFactory browserFactory;

  @BeforeClass
  public void beforeClass() {
    testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
  }

  @BeforeMethod
  public void openBrowser() {
    browserFactory = new BrowserFactory();
    browserFactory.openBrowser(PropertyStorage.getBrowser());
    browserFactory.navigateToUrl();
  }

  @AfterMethod
  public void closeBrowser() {
   // browserFactory.closeTest();
  }

  @Test(dataProvider = "scenarios", description = "Scenario Name: ")
  public void runScenario(PickleWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) {
    testNGCucumberRunner.runScenario(pickleEvent.getPickle());
  }

  @DataProvider(parallel = false)
  public Object[][] scenarios() {
    return testNGCucumberRunner.provideScenarios();
  }

  @AfterClass
  public void afterClass() {
    testNGCucumberRunner.finish();
    WrapperClass.copyFirstRunReport();
  }
}
