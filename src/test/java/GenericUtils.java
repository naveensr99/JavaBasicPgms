package ecolab.koerber.base;

import io.cucumber.datatable.DataTable;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import com.jayway.jsonpath.JsonPath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenericUtils {

	private static Logger log = LoggerFactory.getLogger(GenericUtils.class);

	public String getFileData(String path) {
		return readFileAsString(path);
	}

	public String readFileAsString(String file) {
		String fileContents = "";
		try {
			fileContents = new String(Files.readAllBytes(Paths.get(file)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileContents;
	}

	/**
	 * Return Map data from cucumber DataTable
	 * 
	 * @param dataTable
	 * @return
	 */
	public Map<String, String> toMap(DataTable dataTable) {
		List<Map<String, String>> mapList = dataTable.asMaps(String.class, String.class);
		return mapList.get(0);
	}

	public Map<String, String> inventoryJsonReader(String testCase) {
		Map<String, String> inventoryDetails = null;
		try {
			FileInputStream fis = new FileInputStream(ConstantUtils.DATA_JSON_PATH);

			String data = IOUtils.toString(fis, "UTF-8");
			System.out.println("data" + data);

			inventoryDetails = JsonPath.read(data, "$.Inventory." + testCase);
			System.out.println("Json values are: " + inventoryDetails);
		} catch (Exception e) {
			log.info(e.getMessage());
		}
		return inventoryDetails;
	}
}

