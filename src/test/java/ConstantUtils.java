
package ecolab.koerber.base;

import ecolab.koerber.utils.PropertyStorage;

public class ConstantUtils {

	private ConstantUtils() {
	}

	public static final String ENVI_FOLDER_LOCATION = PropertyStorage.getEnvironmentKey();
	public static final String WH_FOLDER_LOCATION = PropertyStorage.getWarehouseId();
	public static final String ACKNOWLEDGE_MODAL_MANDATORY_ERROR_MSG = "Complete this field";
	public static final String LOCATION_DESCRIPTION = "LocationDescription";
	public static final String PICKING_COMMENT = "This Item has been Edited";
	public static final String TI_ERROR = "ENTER A VALID TI";
	public static final String HI_ERROR = "ENTER A VALID HI";
	public static final String FORWARD_PICK_ERR_MSG = "Cannot mix items";
	public static final String STAGING_ERR_MSG = "This license plate\n" + "can not be moved by\n" + "<Move>";
	public static final String PWD = "HIGHSCORE";
	public static final String EDITQTY = "5";
	public static final String DATE_FOR_LOT = "12/03/2024";
	public static final String INV_BEGIN_MSG = "BEGIN OF INVENTORY";
	public static final String INV_END_MSG = "END OF INVENTORY";

	private static final String JSON_FILE_DIR = System.getProperty("user.dir") + "\\resource-files\\json\\";
	public static final String DATA_JSON_PATH = JSON_FILE_DIR + ENVI_FOLDER_LOCATION + "\\" + WH_FOLDER_LOCATION
			+ ".json";
}
