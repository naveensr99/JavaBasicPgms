
import org.testng.Reporter;

public class PropertyStorage {

	private PropertyStorage() {
	}

	private static final String TEST_PROPERTY_FILE = "config.properties";
	private static final String BROWSER_KEY = "webdriver.driver";
	private static final String K1_USER1_NAME_KEY = "k1.user1.login";
	private static final String K1_USER1_PASS_KEY = "k1.user1.password";
	private static final String K1_USER2_NAME_KEY = "k1.user2.login";
	private static final String K1_USER2_PASS_KEY = "k1.user2.password";
	private static final String K1_USER3_NAME_KEY = "k1.user3.login";
	private static final String K1_USER3_PASS_KEY = "k1.user3.password";
	private static final String K1_USER4_NAME_KEY = "k1.user4.login";
	private static final String K1_USER4_PASS_KEY = "k1.user4.password";
	private static final String K1_M11_USER1_NAME_KEY = "k1.m11.user1.login";
	private static final String K1_M11_USER1_PASS_KEY = "k1.m11.user1.password";
	private static final String K1_USER5_NAME_KEY = "k1.user5.login";
	private static final String K1_USER9_NAME_KEY = "k1.user9.login";
	private static final String K1_USER6_NAME_KEY = "k1.user6.login";
	private static final String K1_USER7_NAME_KEY = "k1.user7.login";
	private static final String K1_USER8_NAME_KEY = "k1.user8.login";

	private static final String BASE_URL_KEY = "webdriver.base.url";
	private static final String PATH_TO_CHROME_DRIVER_EXECUTABLE_KEY = "webdriver.chrome.driver";
	private static final String PATH_TO_EDGE_DRIVER_EXECUTABLE_KEY = "webdriver.edge.driver";
	private static final String DOWNLOAD_PATH = "download.dir";
	private static final String EXPLICIT_WAIT = "webdriver.timeouts.explicitWait";
	private static final String IMPLICIT_WAIT = "webdriver.timeouts.implicitlywait";

	private static final String ENVIRONMENT_KEY = "environment";
	private static final String INPUT_DATA_TYPE = "input.data.type";
	private static final String WAREHOUSE_KEY = "warehouse";
	private static final String PRIMARY_WAREHOUSE_KEY = "primary.warehouse";
	private static final String K1_USER_KEY = "k1.user.login";

	private static final String EXTENT_HTML_REPORT = "extent.html.report";
	private static final String EXTENT_HTML_FIRSTRUN_REPORT = "extent.html.firstrun.report";
	private static final String EXTENT_HTML_RERUN_REPORT = "extent.html.rerun.report";

	private static final String SQL_SERVER_IP_SIT = "10.73.0.250";
	private static final String SQL_SERVER_IP_UAT = "10.73.0.250";
	private static final String KCLOUD_USERNAME = "Shruthi.NS";
	private static final String KCLOUD_PWD = "Kcloud!1!New145";
	private static final String DATABASE_NAME = "AAD";
	private static final String ENCRYPTION_STATE = "false";
	private static final String TRUST_SERVER_CERT = "false";
	private static final String INTEGRATED_SERCURITY = "true";
	private static final String LOGIN_TIMEOUT = "30";

	private static String readEnvironmentProperty(String key) {
		return PropertyReader.getInstance().getProperty(key,
				readCommonProperty(ENVIRONMENT_KEY).trim() + ".properties");
	}

	public static String getEnvironmentKey() {
		if (System.getProperty(ENVIRONMENT_KEY) != null) {
			return System.setProperty(ENVIRONMENT_KEY, System.getProperty(ENVIRONMENT_KEY).trim());
		}
		return readCommonProperty(ENVIRONMENT_KEY).trim();
	}

	private static String readCommonProperty(String key) {
		return PropertyReader.getInstance().getProperty(key, TEST_PROPERTY_FILE);
	}

	public static String getBrowser() {
		if (Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser") == null) {
			return readCommonProperty(BROWSER_KEY);
		}
		return Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
	}

	public static String getPathToChromeDriverExecutable() {
		return readCommonProperty(PATH_TO_CHROME_DRIVER_EXECUTABLE_KEY);
	}

	public static String getPathToEdgeDriverExecutable() {
		return readCommonProperty(PATH_TO_EDGE_DRIVER_EXECUTABLE_KEY);
	}

	public static String getDownloadPath() {
		return readCommonProperty(DOWNLOAD_PATH);
	}

	public static String getExplicitWait() {
		return readCommonProperty(EXPLICIT_WAIT);
	}

	public static String getImplicitWait() {
		return readCommonProperty(IMPLICIT_WAIT);
	}

	public static String getBaseUrl() {
		if (System.getProperty(BASE_URL_KEY) != null) {
			return System.setProperty(BASE_URL_KEY, System.getProperty(BASE_URL_KEY).trim());
		}
		return readEnvironmentProperty(BASE_URL_KEY);
	}

	public static String getWarehouseId() {
		if (System.getProperty(WAREHOUSE_KEY) != null) {
			return System.setProperty(WAREHOUSE_KEY, System.getProperty(WAREHOUSE_KEY).trim());
		}
		return readCommonProperty(WAREHOUSE_KEY);

	}

	public static String getPrimaryWarehouseId() {
		if (System.getProperty(PRIMARY_WAREHOUSE_KEY) != null) {
			return System.setProperty(PRIMARY_WAREHOUSE_KEY, System.getProperty(PRIMARY_WAREHOUSE_KEY).trim());
		}
		return readCommonProperty(PRIMARY_WAREHOUSE_KEY);

	}

	public static String getK1Usernames() {
		if (System.getProperty(K1_USER_KEY) != null) {
			return System.setProperty(K1_USER_KEY, System.getProperty(K1_USER_KEY).trim());
		}
		return readEnvironmentProperty(K1_USER_KEY);

	}

	public static String getK1UsernameOne() {
		if (System.getProperty(K1_USER1_NAME_KEY) != null) {
			return System.setProperty(K1_USER1_NAME_KEY, System.getProperty(K1_USER1_NAME_KEY));
		}
		return readEnvironmentProperty(K1_USER1_NAME_KEY);
	}

	public static String getK1PasswordOne() {
		if (System.getProperty(K1_USER1_PASS_KEY) != null) {
			return System.setProperty(K1_USER1_PASS_KEY, System.getProperty(K1_USER1_PASS_KEY));
		}
		return readEnvironmentProperty(K1_USER1_PASS_KEY);
	}

	public static String getK1UsernameTwo() {
		if (System.getProperty(K1_USER2_NAME_KEY) != null) {
			return System.setProperty(K1_USER2_NAME_KEY, System.getProperty(K1_USER2_NAME_KEY));
		}
		return readEnvironmentProperty(K1_USER2_NAME_KEY);
	}

	public static String getK1PasswordTwo() {
		if (System.getProperty(K1_USER2_PASS_KEY) != null) {
			return System.setProperty(K1_USER2_PASS_KEY, System.getProperty(K1_USER2_PASS_KEY));
		}
		return readEnvironmentProperty(K1_USER2_PASS_KEY);
	}

	public static String getK1UsernameThree() {
		if (System.getProperty(K1_USER3_NAME_KEY) != null) {
			return System.setProperty(K1_USER3_NAME_KEY, System.getProperty(K1_USER3_NAME_KEY));
		}
		return readEnvironmentProperty(K1_USER3_NAME_KEY);
	}

	public static String getK1PasswordThree() {
		if (System.getProperty(K1_USER3_PASS_KEY) != null) {
			return System.setProperty(K1_USER3_PASS_KEY, System.getProperty(K1_USER3_PASS_KEY));
		}
		return readEnvironmentProperty(K1_USER3_PASS_KEY);
	}

	public static String getK1UsernameFour() {
		if (System.getProperty(K1_USER4_NAME_KEY) != null) {
			return System.setProperty(K1_USER4_NAME_KEY, System.getProperty(K1_USER4_NAME_KEY));
		}
		return readEnvironmentProperty(K1_USER4_NAME_KEY);
	}

	public static String getK1UsernameFive() {
		if (System.getProperty(K1_USER5_NAME_KEY) != null) {
			return System.setProperty(K1_USER5_NAME_KEY, System.getProperty(K1_USER5_NAME_KEY));
		}
		return readEnvironmentProperty(K1_USER5_NAME_KEY);
	}

	public static String getK1UsernameSix() {
		if (System.getProperty(K1_USER6_NAME_KEY) != null) {
			return System.setProperty(K1_USER6_NAME_KEY, System.getProperty(K1_USER6_NAME_KEY));
		}
		return readEnvironmentProperty(K1_USER6_NAME_KEY);
	}

	public static String getK1UsernameSeven() {
		if (System.getProperty(K1_USER7_NAME_KEY) != null) {
			return System.setProperty(K1_USER7_NAME_KEY, System.getProperty(K1_USER7_NAME_KEY));
		}
		return readEnvironmentProperty(K1_USER7_NAME_KEY);
	}

	public static String getK1UsernameEight() {
		if (System.getProperty(K1_USER8_NAME_KEY) != null) {
			return System.setProperty(K1_USER8_NAME_KEY, System.getProperty(K1_USER8_NAME_KEY));
		}
		return readEnvironmentProperty(K1_USER8_NAME_KEY);
	}

	public static String getK1UsernameNine() {
		if (System.getProperty(K1_USER9_NAME_KEY) != null) {
			return System.setProperty(K1_USER9_NAME_KEY, System.getProperty(K1_USER9_NAME_KEY));
		}
		return readEnvironmentProperty(K1_USER9_NAME_KEY);
	}

	public static String getK1PasswordFour() {
		if (System.getProperty(K1_USER4_PASS_KEY) != null) {
			return System.setProperty(K1_USER4_PASS_KEY, System.getProperty(K1_USER4_PASS_KEY));
		}
		return readEnvironmentProperty(K1_USER4_PASS_KEY);
	}

	public static String getK1M11UsernameOne() {
		if (System.getProperty(K1_M11_USER1_NAME_KEY) != null) {
			return System.setProperty(K1_M11_USER1_NAME_KEY, System.getProperty(K1_M11_USER1_NAME_KEY));
		}
		return readEnvironmentProperty(K1_M11_USER1_NAME_KEY);
	}

	public static String getK1M11PasswordOne() {
		if (System.getProperty(K1_M11_USER1_PASS_KEY) != null) {
			return System.setProperty(K1_M11_USER1_PASS_KEY, System.getProperty(K1_M11_USER1_PASS_KEY));
		}
		return readEnvironmentProperty(K1_M11_USER1_PASS_KEY);
	}

	public static String getGeneratedReportDir() {
		return readCommonProperty(EXTENT_HTML_REPORT);
	}

	public static String getFirstRunReportDir() {
		return readCommonProperty(EXTENT_HTML_FIRSTRUN_REPORT);
	}

	public static String getReRunReportDir() {
		return readCommonProperty(EXTENT_HTML_RERUN_REPORT);
	}

	public static String getSQLConnectionUrl() {
		String connectionUrl = null;
		if (readCommonProperty(ENVIRONMENT_KEY).trim().equals("uat")) {
			connectionUrl = "jdbc:sqlserver://" + SQL_SERVER_IP_UAT + ";" + "userName=KCLOUD\\" + KCLOUD_USERNAME + ";"
					+ "password=" + KCLOUD_PWD + ";" + "databaseName=" + DATABASE_NAME + ";" + "encrypt="
					+ ENCRYPTION_STATE + ";" + "trustServerCertificate=" + TRUST_SERVER_CERT + ";"
					+ "integratedSecurity=" + INTEGRATED_SERCURITY + ";" + "loginTimeout=" + LOGIN_TIMEOUT + ";";
		}
		if (readCommonProperty(ENVIRONMENT_KEY).trim().equals("sit")) {
			connectionUrl = "jdbc:sqlserver://" + SQL_SERVER_IP_SIT + ";" + "userName=KCLOUD\\" + KCLOUD_USERNAME + ";"
					+ "password=" + KCLOUD_PWD + ";" + "databaseName=" + DATABASE_NAME + ";" + "encrypt="
					+ ENCRYPTION_STATE + ";" + "trustServerCertificate=" + TRUST_SERVER_CERT + ";"
					+ "integratedSecurity=" + INTEGRATED_SERCURITY + ";" + "loginTimeout=" + LOGIN_TIMEOUT + ";";
		}
		return connectionUrl;
	}
}
