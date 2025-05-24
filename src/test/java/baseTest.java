import ecolab.koerber.entities.RandomValue;

public class BaseTest extends BrowserFactory {

  protected WrapperClass wrapperClass;
  protected RandomValue randomValue = new RandomValue();

 
  
  public BaseTest() {
    wrapperClass = new WrapperClass(driverManager);
    DriverManager.setWrapperClass(wrapperClass);
  }
}

