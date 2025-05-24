package ecolab.koerber.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ecolab.koerber.utils.PropertyStorage;
import ecolab.koerber.utils.RandomUtils;

public class DBUtils {

	private static Logger log = LoggerFactory.getLogger(DBUtils.class);

	public List<String> getHU_Id_QC_TC(String locType, String itemClass) {
		ResultSet resultSet = null;
		List<String> finvalues = new ArrayList<String>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getQueryForHUid(locType, itemClass);
		System.out.println("Query from method --> " + query);
		try (Connection connection = DriverManager.getConnection(connectionUrl);) {

			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {
				String huID = resultSet.getString("hu_id");
				finvalues.add(huID);
				System.out.print("hu_ID" + " " + resultSet.getString("hu_id"));

				String location_id = resultSet.getString("location_id");
				finvalues.add(location_id);
				System.out.print("location_id" + " " + resultSet.getString("location_id"));
			}

			connection.close();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return finvalues;
	}

	public List<String> getItemNLocDetails_Empty_TC() {
		ResultSet resultSet = null;
		List<String> finvalues = new ArrayList<String>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getQueryForItemNumNLoc();
		System.out.println("Query from method --> " + query);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {
				String location_id = resultSet.getString("location_id");
				finvalues.add(location_id);
				System.out.print("location_id" + " " + resultSet.getString("location_id"));
				String item_number = resultSet.getString("item_number");
				finvalues.add(item_number);
				System.out.print("item_number" + " " + resultSet.getString("item_number"));
				String lot_number = resultSet.getString("lot_number");
				finvalues.add(lot_number);
			}
			connection.close();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return finvalues;
	}

	public String getEmptyLocDetailsForEmptyTC() {
		ResultSet resultSet = null;
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getQueryForEmptyLocation();
		System.out.println("Query from method --> " + query);
		String location_id = "";

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {
				location_id = resultSet.getString("location_id");
				System.out.print("location_id" + " " + resultSet.getString("location_id"));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return location_id;
	}

	public List<String> getLotNExpirationDetailsForEmptyTC(String itemNumber) {
		ResultSet resultSet = null;

		List<String> finvalues = new ArrayList<>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getQueryForLotNExpirationDetails(itemNumber);
		System.out.println("Query from method --> " + query);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {
				String lot_num = resultSet.getString("lot_number");
				finvalues.add(lot_num);
				String exp_date = resultSet.getString("expiration_date");
				finvalues.add(exp_date);
				System.out.print("lot_number" + " " + resultSet.getString("lot_number"));
				System.out.print("expiration_date" + " " + resultSet.getString("expiration_date"));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return finvalues;
	}

	public List<String> getViewLPDetailsTC() {
		ResultSet resultSet = null;

		List<String> finvalues = new ArrayList<>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getQueryForviewInventoryLPDetails();
		System.out.println("Query from method --> " + query);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {

				String item_number = resultSet.getString("item_number");
				finvalues.add(item_number);

				String location_id = resultSet.getString("location_id");
				finvalues.add(location_id);

				String expiration_date = resultSet.getString("expiration_date");
				finvalues.add(expiration_date);

				String lot_number = resultSet.getString("lot_number");
				finvalues.add(lot_number);

				String hu_id = resultSet.getString("hu_id");
				finvalues.add(hu_id);

				String actual_qty = resultSet.getString("actual_qty");
				finvalues.add(actual_qty);

				String status = resultSet.getString("status");
				finvalues.add(status);

				System.out.print("item_number" + " " + resultSet.getString("item_number"));
				System.out.print("location_id" + " " + resultSet.getString("location_id"));
				System.out.print("expiration_date" + " " + resultSet.getString("expiration_date"));
				System.out.print("lot_number" + " " + resultSet.getString("lot_number"));
				System.out.print("hu_id" + " " + resultSet.getString("hu_id"));
				System.out.print("actual_qty" + " " + resultSet.getString("actual_qty"));
				System.out.print("status" + " " + resultSet.getString("status"));

			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return finvalues;
	}

	public List<String> getViewItemDetailsTC(String itemNumber, String loc, String lot) {
		ResultSet resultSet = null;

		List<String> finvalues = new ArrayList<>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getQueryForviewInventoryItemDetails(itemNumber, loc, lot);
		System.out.println("Query from method --> " + query);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {

				String description = resultSet.getString("description");
				finvalues.add(description);

				String item_number = resultSet.getString("item_number");
				finvalues.add(item_number);

				String location_id = resultSet.getString("location_id");
				finvalues.add(location_id);

				String expiration_date = resultSet.getString("expiration_date");
				finvalues.add(expiration_date);

				String lot_number = resultSet.getString("lot_number");
				finvalues.add(lot_number);

				String hu_id = resultSet.getString("hu_id");
				finvalues.add(hu_id);

				String actual_qty = resultSet.getString("actual_qty");
				finvalues.add(actual_qty);

				String status = resultSet.getString("status");
				finvalues.add(status);

				System.out.print("description" + " " + resultSet.getString("description"));
				System.out.print("item_number" + " " + resultSet.getString("item_number"));
				System.out.print("location_id" + " " + resultSet.getString("location_id"));
				System.out.print("expiration_date" + " " + resultSet.getString("expiration_date"));
				System.out.print("lot_number" + " " + resultSet.getString("lot_number"));
				System.out.print("hu_id" + " " + resultSet.getString("hu_id"));
				System.out.print("actual_qty" + " " + resultSet.getString("actual_qty"));
				System.out.print("status" + " " + resultSet.getString("status"));

			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return finvalues;
	}

	public List<String> getViewSerialDetailsTC() {
		ResultSet resultSet = null;
		ResultSet resultSet2 = null;

		List<String> finvalues = new ArrayList<>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query1 = getQueryForviewInventorySerialNumberOnly();
		System.out.println("Query from method --> " + query1);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query1);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {

				String serial_number1 = resultSet.getString("serial_number");
				finvalues.add(serial_number1);
			}

			String query2 = getQueryForviewInventorySerialDetails(finvalues.get(0));
			System.out.println("Query from method --> " + query2);

			resultSet2 = stmt.executeQuery(query2);
			ResultSetMetaData rsmd21 = resultSet2.getMetaData();
			int columnsNumber21 = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd21.toString());
			System.out.println("Column count: " + columnsNumber21);

			while (resultSet2.next()) {

				String item_number = resultSet2.getString("item_number");
				finvalues.add(item_number);

				String location_id = resultSet2.getString("location_id");
				finvalues.add(location_id);

				String description = resultSet2.getString("description");
				finvalues.add(description);

				String hu_id = resultSet2.getString("hu_id");
				finvalues.add(hu_id);

				String serial_number = resultSet2.getString("serial_number");
				finvalues.add(serial_number);

				String status = resultSet2.getString("status");
				finvalues.add(status);

				System.out.print("item_number" + " " + resultSet2.getString("item_number"));
				System.out.print("location_id" + " " + resultSet2.getString("location_id"));
				System.out.print("description" + " " + resultSet2.getString("description"));
				System.out.print("hu_id" + " " + resultSet2.getString("hu_id"));
				System.out.print("serial_number" + " " + resultSet2.getString("serial_number"));
				System.out.print("status" + " " + resultSet2.getString("status"));

			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return finvalues;
	}

	public List<String> getViewOrderDetailsTC() {
		ResultSet resultSet = null;

		List<String> finvalues = new ArrayList<>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getQueryForviewInventoryOrderDetails();
		System.out.println("Query from method --> " + query);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {

				String item_number = resultSet.getString("item_number");
				finvalues.add(item_number);

				String location_id = resultSet.getString("location_id");
				finvalues.add(location_id);

				String description = resultSet.getString("description");
				finvalues.add(description);

				String order_number = resultSet.getString("order_number");
				finvalues.add(order_number);

				String hu_id = resultSet.getString("hu_id");
				finvalues.add(hu_id);

				String actual_qty = resultSet.getString("actual_qty");
				finvalues.add(actual_qty);

				String customer_name = resultSet.getString("customer_name");
				finvalues.add(customer_name);

				System.out.print("item_number" + " " + resultSet.getString("item_number"));
				System.out.print("location_id" + " " + resultSet.getString("location_id"));
				System.out.print("description" + " " + resultSet.getString("description"));
				System.out.print("order_number" + " " + resultSet.getString("order_number"));
				System.out.print("hu_id" + " " + resultSet.getString("hu_id"));
				System.out.print("actual_qty" + " " + resultSet.getString("actual_qty"));
				System.out.print("customer_name" + " " + resultSet.getString("customer_name"));

			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return finvalues;
	}

	public List<String> getViewLotDetailsTC(String itemNumber, String loc, String lot) {
		ResultSet resultSet = null;

		List<String> finvalues = new ArrayList<>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getQueryForviewInventoryItemDetails(itemNumber, loc, lot);
		System.out.println("Query from method --> " + query);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {

				String description = resultSet.getString("description");
				finvalues.add(description);

				String item_number = resultSet.getString("item_number");
				finvalues.add(item_number);

				String location_id = resultSet.getString("location_id");
				finvalues.add(location_id);

				String expiration_date = resultSet.getString("expiration_date");
				finvalues.add(expiration_date);

				String lot_number = resultSet.getString("lot_number");
				finvalues.add(lot_number);

				String hu_id = resultSet.getString("hu_id");
				finvalues.add(hu_id);

				String actual_qty = resultSet.getString("actual_qty");
				finvalues.add(actual_qty);

				String status = resultSet.getString("status");
				finvalues.add(status);

				System.out.print("description" + " " + resultSet.getString("description"));
				System.out.print("item_number" + " " + resultSet.getString("item_number"));
				System.out.print("location_id" + " " + resultSet.getString("location_id"));
				System.out.print("expiration_date" + " " + resultSet.getString("expiration_date"));
				System.out.print("lot_number" + " " + resultSet.getString("lot_number"));
				System.out.print("hu_id" + " " + resultSet.getString("hu_id"));
				System.out.print("actual_qty" + " " + resultSet.getString("actual_qty"));
				System.out.print("status" + " " + resultSet.getString("status"));

			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return finvalues;
	}

	public List<String> getViewLocDetailsTC(String lpNum) {
		ResultSet resultSet = null;
		ResultSet resultSet2 = null;

		List<String> finvalues = new ArrayList<>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query1 = getQueryForviewInventoryLocNum();
		System.out.println("Query from method --> " + query1);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query1);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {

				String location_id = resultSet.getString("location_id");
				finvalues.add(location_id);
			}

			String query2 = getQueryForviewInventoryLocDetails(finvalues.get(0), lpNum);
			System.out.println("Query from method --> " + query2);

			while (resultSet.next()) {

				String description = resultSet.getString("description");
				finvalues.add(description);

				String item_number = resultSet.getString("item_number");
				finvalues.add(item_number);

				String expiration_date = resultSet.getString("expiration_date");
				finvalues.add(expiration_date);

				String lot_number = resultSet.getString("lot_number");
				finvalues.add(lot_number);

				String hu_id = resultSet.getString("hu_id");
				finvalues.add(hu_id);

				String actual_qty = resultSet.getString("actual_qty");
				finvalues.add(actual_qty);

				String status = resultSet.getString("status");
				finvalues.add(status);

				System.out.print("description" + " " + resultSet.getString("description"));
				System.out.print("item_number" + " " + resultSet.getString("item_number"));
				System.out.print("expiration_date" + " " + resultSet.getString("expiration_date"));
				System.out.print("lot_number" + " " + resultSet.getString("lot_number"));
				System.out.print("hu_id" + " " + resultSet.getString("hu_id"));
				System.out.print("actual_qty" + " " + resultSet.getString("actual_qty"));
				System.out.print("status" + " " + resultSet.getString("status"));

			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return finvalues;
	}

	public String get_LPN_ASN_TC(String poNum) {
		ResultSet resultSet = null;
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getQueryForLPNforTransferOrder(poNum);
		System.out.println("Query from method --> " + query);
		String lpn = "";
		try (Connection connection = DriverManager.getConnection(connectionUrl);) {

			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {
				lpn = resultSet.getString("handling_unit_number");
				System.out.print("hu_ID" + " " + resultSet.getString("handling_unit_number"));
			}

			connection.close();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return lpn;
	}

	public List<String> getLocDetailsForCycleCountTC() {
		ResultSet resultSet = null;

		List<String> finvalues = new ArrayList<>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getQueryDetailsforCycleCount();
		System.out.println("Query from method --> " + query);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {

				String location_id = resultSet.getString("location_id");
				finvalues.add(location_id);

				String item_number = resultSet.getString("item_number");
				finvalues.add(item_number);

				String lot_number = resultSet.getString("lot_number");
				finvalues.add(lot_number);

				String actual_qty = resultSet.getString("actual_qty");
				finvalues.add(actual_qty);

				String hu_id = resultSet.getString("hu_id");
				finvalues.add(hu_id);

				System.out.print("item_number" + " " + resultSet.getString("item_number"));
				System.out.print("lot_number" + " " + resultSet.getString("lot_number"));
				System.out.print("actual_qty" + " " + resultSet.getString("actual_qty"));
				System.out.print("location_id" + " " + resultSet.getString("location_id"));
				System.out.print("hu_id" + " " + resultSet.getString("hu_id"));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return finvalues;
	}

	public List<String> get_Details_PO_TC(String poNum) {
		ResultSet resultSet = null;
		List<String> finvalues = new ArrayList<>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getQueryDetailsforPurchaseOrder(poNum);
		System.out.println("Query from method --> " + query);
		try (Connection connection = DriverManager.getConnection(connectionUrl);) {

			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {
				String item_number = resultSet.getString("item_number");
				finvalues.add(item_number);

				String lot_number = resultSet.getString("lot_number");
				finvalues.add(lot_number);

				String qty = resultSet.getString("qty");
				finvalues.add(qty);

				System.out.print("item_number" + " " + resultSet.getString("item_number"));
				System.out.print("lot_number" + " " + resultSet.getString("lot_number"));
				System.out.print("qty" + " " + resultSet.getString("qty"));
			}

			connection.close();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return finvalues;
	}

	public String getViewLocDetailsTCForLocNumber() {
		ResultSet resultSet = null;
		String location_id = "";
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query1 = getQueryForviewInventoryLocNum();
		System.out.println("Query from method --> " + query1);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query1);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {

				location_id = resultSet.getString("location_id");
			}
			connection.close();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return location_id;
	}

	public List<String> getViewLocDetailsTC(String loc, String lpNum) {
		ResultSet resultSet = null;

		List<String> finvalues = new ArrayList<>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getQueryForviewInventoryLocDetails(loc, lpNum);
		System.out.println("Query from method --> " + query);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {

				String description = resultSet.getString("description");
				finvalues.add(description);

				String item_number = resultSet.getString("item_number");
				finvalues.add(item_number);

				String expiration_date = resultSet.getString("expiration_date");
				finvalues.add(expiration_date);

				String lot_number = resultSet.getString("lot_number");
				finvalues.add(lot_number);

				String hu_id = resultSet.getString("hu_id");
				finvalues.add(hu_id);

				String actual_qty = resultSet.getString("actual_qty");
				finvalues.add(actual_qty);

				String status = resultSet.getString("status");
				finvalues.add(status);

				System.out.print("description" + " " + resultSet.getString("description"));
				System.out.print("item_number" + " " + resultSet.getString("item_number"));
				System.out.print("expiration_date" + " " + resultSet.getString("expiration_date"));
				System.out.print("lot_number" + " " + resultSet.getString("lot_number"));
				System.out.print("hu_id" + " " + resultSet.getString("hu_id"));
				System.out.print("actual_qty" + " " + resultSet.getString("actual_qty"));
				System.out.print("status" + " " + resultSet.getString("status"));

			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return finvalues;
	}

	public String get_LPN_Tansaction_Table_Staged_Receipt_TC(String poNum) {
		ResultSet resultSet = null;
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getLPNFromTransactionTableforPurchaseOrder(poNum);
		System.out.println("Query from method --> " + query);
		String lpn = "";
		try (Connection connection = DriverManager.getConnection(connectionUrl);) {

			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {
				lpn = resultSet.getString("source_hu_id");
				System.out.print("source_hu_id" + " " + resultSet.getString("source_hu_id"));
			}

			connection.close();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return lpn;
	}

	public String getLocDetails() {
		ResultSet resultSet = null;
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getDetails();
		System.out.println("Query from method --> " + query);
		String lpn = "";
		try (Connection connection = DriverManager.getConnection(connectionUrl);) {

			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {
				lpn = resultSet.getString("location_id");
				System.out.print("location_id" + " " + resultSet.getString("location_id"));
			}

			connection.close();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return lpn;
	}

//	getLotDetails
	public List<String> getDetailsPOBatchSplitTC(String loc, String lpNum) {
		ResultSet resultSet = null;

		List<String> finvalues = new ArrayList<>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getLotDetails(loc, lpNum);
		System.out.println("Query from method --> " + query);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {
				String item_number = resultSet.getString("item_number");
				finvalues.add(item_number);

				String lot_number = resultSet.getString("lot_number");
				finvalues.add(lot_number);

				String hu_id = resultSet.getString("hu_id");
				finvalues.add(hu_id);

				String location_id = resultSet.getString("location_id");
				finvalues.add(location_id);

				String actual_qty = resultSet.getString("actual_qty");
				finvalues.add(actual_qty);

				System.out.print("item_number" + " " + resultSet.getString("item_number"));
				System.out.print("lot_number" + " " + resultSet.getString("lot_number"));
				System.out.print("hu_id" + " " + resultSet.getString("hu_id"));
				System.out.print("location_id" + " " + resultSet.getString("location_id"));
				System.out.print("actual_qty" + " " + resultSet.getString("actual_qty"));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return finvalues;
	}

	public List<String> getDetailsOverrideLocTC() {
		ResultSet resultSet = null;

		List<String> finvalues = new ArrayList<>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getQueryForHUid();
		System.out.println("Query from method --> " + query);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {
				String item_number = resultSet.getString("item_number");
				finvalues.add(item_number);

				String lot_number = resultSet.getString("lot_number");
				finvalues.add(lot_number);

				String hu_id = resultSet.getString("hu_id");
				finvalues.add(hu_id);

				String location_id = resultSet.getString("location_id");
				finvalues.add(location_id);

				String actual_qty = resultSet.getString("actual_qty");
				finvalues.add(actual_qty);

				System.out.print("item_number" + " " + resultSet.getString("item_number"));
				System.out.print("lot_number" + " " + resultSet.getString("lot_number"));
				System.out.print("hu_id" + " " + resultSet.getString("hu_id"));
				System.out.print("location_id" + " " + resultSet.getString("location_id"));
				System.out.print("actual_qty" + " " + resultSet.getString("actual_qty"));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return finvalues;
	}

	public List<String> getDetailsOverrideLocTC2(String loc, String lpNum) {
		ResultSet resultSet = null;

		List<String> finvalues = new ArrayList<>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getLocDetails(loc, lpNum);
		System.out.println("Query from method --> " + query);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {
				String item_number = resultSet.getString("item_number");
				finvalues.add(item_number);

				String lot_number = resultSet.getString("lot_number");
				finvalues.add(lot_number);

				String hu_id = resultSet.getString("hu_id");
				finvalues.add(hu_id);

				String location_id = resultSet.getString("location_id");
				finvalues.add(location_id);

				String actual_qty = resultSet.getString("actual_qty");
				finvalues.add(actual_qty);

				System.out.print("item_number" + " " + resultSet.getString("item_number"));
				System.out.print("lot_number" + " " + resultSet.getString("lot_number"));
				System.out.print("hu_id" + " " + resultSet.getString("hu_id"));
				System.out.print("location_id" + " " + resultSet.getString("location_id"));
				System.out.print("actual_qty" + " " + resultSet.getString("actual_qty"));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return finvalues;
	}

	public List<String> getLocDetailsForValidation(String loc) {
		ResultSet resultSet = null;

		List<String> finvalues = new ArrayList<>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getLocDetails(loc);
		System.out.println("Query from method --> " + query);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {

				String location_id = resultSet.getString("location_id");
				finvalues.add(location_id);

				String item_number = resultSet.getString("item_number");
				finvalues.add(item_number);

				String lot_number = resultSet.getString("lot_number");
				finvalues.add(lot_number);

				String actual_qty = resultSet.getString("actual_qty");
				finvalues.add(actual_qty);

				String hu_id = resultSet.getString("hu_id");
				finvalues.add(hu_id);

				System.out.print("item_number" + " " + resultSet.getString("item_number"));
				System.out.print("lot_number" + " " + resultSet.getString("lot_number"));
				System.out.print("actual_qty" + " " + resultSet.getString("actual_qty"));
				System.out.print("location_id" + " " + resultSet.getString("location_id"));
				System.out.print("hu_id" + " " + resultSet.getString("hu_id"));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return finvalues;
	}

	public List<String> getLocDetailsForCycleCountForItem2(String item) {
		ResultSet resultSet = null;

		List<String> finvalues = new ArrayList<>();
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = getDetailsForCycleCountSecondItem(item);
		System.out.println("Query from method --> " + query);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {

				String location_id = resultSet.getString("location_id");
				finvalues.add(location_id);

				String item_number = resultSet.getString("item_number");
				finvalues.add(item_number);

				String lot_number = resultSet.getString("lot_number");
				finvalues.add(lot_number);

				String actual_qty = resultSet.getString("actual_qty");
				finvalues.add(actual_qty);

				String hu_id = resultSet.getString("hu_id");
				finvalues.add(hu_id);

				System.out.print("item_number" + " " + resultSet.getString("item_number"));
				System.out.print("lot_number" + " " + resultSet.getString("lot_number"));
				System.out.print("actual_qty" + " " + resultSet.getString("actual_qty"));
				System.out.print("location_id" + " " + resultSet.getString("location_id"));
//				System.out.print("hu_id" + " " + resultSet.getString("hu_id"));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return finvalues;
	}

	public String getQueryForHUid() {
		String query = null;
		String locationType = "I";
		String itemClassId = "GENERAL";
		String stoStatus = "A";
		query = "select TOP(1) sto.hu_id, sto.lot_number, sto.item_number, sto.status,sto.location_id, sto.actual_qty from t_stored_item sto(nolock) \r\n"
				+ "JOIN t_location loc(nolock) ON loc.location_id=sto.location_id AND sto.wh_id=loc.wh_id\r\n"
				+ "JOIN t_item_master itm (nolock) ON itm.item_number=sto.item_number AND itm.wh_id =loc.wh_id\r\n"
				+ "where loc.type='" + locationType + "' and loc.wh_id='" + PropertyStorage.getWarehouseId()
				+ "' and itm.class_id='" + itemClassId + "' and sto.status='" + stoStatus
				+ "' and sto.hu_id IS NOT NULL;";
		return query;
	}

	public String getQueryForHUid(String locationType, String itemClassId) {
		String query = null;

		query = "select TOP(1) sto.hu_id, sto.lot_number, sto.item_number, sto.status,sto.location_id, sto.actual_qty from t_stored_item sto(nolock) \r\n"
				+ "JOIN t_location loc(nolock) ON loc.location_id=sto.location_id AND sto.wh_id=loc.wh_id\r\n"
				+ "JOIN t_item_master itm (nolock) ON itm.item_number=sto.item_number AND itm.wh_id =loc.wh_id\r\n"
				+ "where loc.type='" + locationType + "' and loc.wh_id='" + PropertyStorage.getWarehouseId()
				+ "' and itm.class_id='" + itemClassId + "' and sto.status='A'" + " and sto.hu_id IS NOT NULL;";
		return query;
	}

	public String getQueryForItemNumNLoc() {
		String query = null;

//		query = "declare @from_record int=30\r\n"
//				+ "select sto.hu_id, sto.status, sto.location_id, sto.item_number from t_stored_item sto(nolock) \r\n"
//				+ "JOIN t_location loc(nolock) ON loc.location_id=sto.location_id AND sto.wh_id=loc.wh_id \r\n"
//				+ "WHERE sto.wh_id='" + PropertyStorage.getWarehouseId().toString()
//				+ "' and sto.status = 'A' and loc.type='I' \r\n" + "ORDER by item_number \r\n"
//				+ "OFFSET @from_record-20 ROWS \r\n" + "FETCH NEXT 1 ROW ONLY";

		query = "select top 1 location_id,item_number,hu_id,lot_number,wh_id  from t_stored_item(NOLOCK)\r\n"
				+ "where wh_id='" + PropertyStorage.getWarehouseId().toString()
				+ "' AND  status = 'A' AND  item_number in  (select item_number from t_item_master(nolock) \r\n"
				+ "where expiration_date_control='Y' and wh_id = '" + PropertyStorage.getWarehouseId().toString()
				+ "')";

		return query;
	}

	public String getQueryForEmptyLocation() {
		String query = null;
		query = "select top 1 * from t_location(nolock) where status ='E' and wh_id='"
				+ PropertyStorage.getWarehouseId().toString() + "'" + " and type = 'I'";
		return query;
	}

	public String getQueryForLotNExpirationDetails(String itemNumber) {
		String query = null;
		query = "declare @from_record int=10\r\n"
				+ "select distinct sto.item_number, x.lot_number, x.expiration_date  from t_stored_item sto(nolock) \r\n"
				+ "JOIN (select * from t_lot_master(nolock) )x ON sto.item_number=x.item_number\r\n"
				+ "where  sto.wh_id='" + PropertyStorage.getWarehouseId().toString() + "'"
				+ " and sto.status='A' and sto.item_number='" + itemNumber + "'" + " \r\n" + "ORDER by item_number \r\n"
				+ "OFFSET @from_record-3 ROWS\r\n" + "FETCH NEXT 1 ROW ONLY";
		return query;
	}

	public String getQueryForviewInventoryLPDetails() {
		String query = null;

		query = "declare @from_record int=50\r\n"
				+ "select item_number, location_id, expiration_date, lot_number, hu_id, actual_qty, status from t_stored_item (nolock) \r\n"
				+ "WHERE wh_id='" + PropertyStorage.getWarehouseId().toString()
				+ "' and  hu_id IS NOT NULL and location_id NOT LIKE 'RESET%' and location_id NOT LIKE 'LOST%'\r\n"
				+ "ORDER by item_number\r\n" + "OFFSET @from_record-10 ROWS \r\n" + "FETCH NEXT 1 ROW ONLY";
		return query;
	}

	public String getQueryForviewInventoryItemDetails(String itemNumber, String loc, String lot) {
		String query = null;

		query = "declare @from_record int=10\r\n"
				+ "select itm.description, sto.item_number, sto.location_id, sto.expiration_date, sto.lot_number, sto.hu_id, sto.actual_qty, sto.status, itm.uom  from t_stored_item sto(nolock) \r\n"
				+ "JOIN t_location loc(nolock) ON loc.location_id=sto.location_id AND sto.wh_id=loc.wh_id\r\n"
				+ "Join t_item_master itm(nolock) ON itm.item_number=sto.item_number \r\n" + "WHERE sto.wh_id='"
				+ PropertyStorage.getWarehouseId().toString() + "' and sto.item_number= '" + itemNumber
				+ "' and sto.location_id = '" + loc + "' and sto.lot_number= '" + lot + "'\r\n"
				+ "ORDER by item_number\r\n" + "OFFSET @from_record-3 ROWS\r\n" + "FETCH NEXT 1 ROW ONLY";
		return query;
	}

	public String getQueryForviewInventoryOrderDetails() {
		String query = null;

		query = "select TOP 1 pick.order_number, sto.item_number, sto.location_id, sto.lot_number, sto.hu_id, sto.actual_qty,itm.description,ord.customer_name from t_pick_detail pick(nolock)\r\n"
				+ "JOIN t_stored_item sto(nolock)  on  pick.pick_id=sto.type join t_item_master itm(nolock) on  pick.item_number=itm.item_number and sto.item_number=itm.item_number\r\n"
				+ "join t_order ord(nolock) on ord.order_number=pick.order_number\r\n"
				+ "where pick.status  in('PICKED','STAGED','LOADED') and planned_quantity >0 and pick.wh_id = '"
				+ PropertyStorage.getWarehouseId().toString() + "'";
		return query;
	}

	public String getQueryForviewInventorySerialNumberOnly() {
		String serialNum = null;

		serialNum = "select TOP 1 x.serial_number from t_stored_item sto(nolock) \r\n"
				+ "JOIN (select serial_number,sto_id from t_serial_number(nolock) )x ON sto.sto_id=x.sto_id\r\n"
				+ "where sto.wh_id='" + PropertyStorage.getWarehouseId().toString() + "'";
		return serialNum;
	}

	public String getQueryForviewInventorySerialDetails(String serialNumber) {
		String serialNum = null;

		serialNum = "select  TOP 1 sto.item_number,sto.location_id,sto.status,x.serial_number, sto.hu_id, sto.status, itm.description from t_stored_item sto(nolock) \r\n"
				+ "Join t_item_master itm(nolock) ON itm.item_number=sto.item_number \r\n"
				+ "JOIN (select serial_number,sto_id from t_serial_number(nolock) )x ON sto.sto_id=x.sto_id\r\n"
				+ "where sto.status='A' and sto.wh_id='" + PropertyStorage.getWarehouseId().toString()
				+ "' and x.serial_number = '" + serialNumber + "'";
		return serialNum;
	}

	public String getQueryForviewInventoryLocNum() {
		String location = null;

		location = "declare @from_record int=100  \r\n"
				+ "select itm.description, sto.item_number, sto.location_id, sto.expiration_date, sto.lot_number, \r\n"
				+ "sto.hu_id, sto.actual_qty, sto.status, itm.uom  \r\n" + "from t_stored_item sto(nolock) \r\n"
				+ "JOIN t_location loc(nolock) ON loc.location_id=sto.location_id AND sto.wh_id=loc.wh_id \r\n"
				+ "Join t_item_master itm(nolock) ON itm.item_number=sto.item_number \r\n" + "WHERE sto.wh_id='"
				+ PropertyStorage.getWarehouseId().toString()
				+ "' and sto.hu_id is not NULL and sto.actual_qty >0  \r\n"
				+ "ORDER by item_number OFFSET @from_record-50 ROWS FETCH NEXT 1 ROW ONLY";
		return location;
	}

	public String getQueryForviewInventoryLocDetails(String location, String lp) {
		String details = null;

		details = "select itm.description, sto.item_number, sto.expiration_date, sto.lot_number, \r\n"
				+ "sto.hu_id, sto.actual_qty, sto.status, itm.uom  \r\n" + "from t_stored_item sto(nolock) \r\n"
				+ "JOIN t_location loc(nolock) ON loc.location_id=sto.location_id AND sto.wh_id=loc.wh_id \r\n"
				+ "Join t_item_master itm(nolock) ON itm.item_number=sto.item_number \r\n" + "WHERE sto.wh_id='"
				+ PropertyStorage.getWarehouseId().toString() + "' and sto.location_id ='" + location
				+ "' and sto.hu_id = '" + lp + "'";
		return details;
	}

	public String getQueryForLPNforTransferOrder(String poNum) {
		String lpn = null;

		lpn = "select TOP 1 handling_unit_number from t_po_detail (nolock) where po_number = '" + poNum + "'";
		return lpn;
	}

	public String getQueryDetailsforCycleCount() {
		String cycleCountDetails = null;

//		cycleCountdetails = "declare @from_record int=300 \r\n"
//				+ "select sto.hu_id, sto.location_id, sto.item_number, sto.lot_number, sto.actual_qty from t_stored_item sto(nolock) \r\n"
//				+ "JOIN t_location loc(nolock) ON loc.location_id=sto.location_id AND sto.wh_id=loc.wh_id \r\n"
//				+ "	JOIN t_item_master itm (nolock) ON itm.wh_id =loc.wh_id\r\n" + " WHERE sto.wh_id= '"
//				+ PropertyStorage.getWarehouseId().toString() + "' and itm.class_id='GENERAL' and itm.uom= 'PC' \r\n"
//				+ "	and sto.status = 'A' and loc.type='I' and sto.lot_number IS NOT NULL and sto.actual_qty >0 and sto.hu_id IS NOT NULL ORDER by NEWID() \r\n"
//				+ "	OFFSET @from_record-188 ROWS FETCH NEXT 1 ROW ONLY";

		cycleCountDetails = "DECLARE @from_record INT = 150 SELECT sto.hu_id, sto.location_id, sto.item_number, sto.lot_number, sto.actual_qty \r\n"
				+ "FROM t_stored_item sto (NOLOCK)\r\n"
				+ "JOIN t_location loc (NOLOCK) ON	sto.location_id = loc.location_id\r\n"
				+ "AND sto.wh_id = loc.wh_id AND loc.[type] = 'I'\r\n"
				+ "JOIN t_item_master itm (NOLOCK) ON	itm.wh_id = sto.wh_id\r\n"
				+ "AND	itm.item_number = sto.item_number AND itm.class_id = 'GENERAL' AND itm.uom = 'PC' \r\n"
				+ "WHERE sto.wh_id = '" + PropertyStorage.getWarehouseId().toString() + "' AND sto.[status] = 'A' \r\n"
				+ "AND sto.lot_number IS NOT NULL AND sto.actual_qty > 0\r\n" + "AND sto.hu_id IS NOT NULL\r\n"
				+ "GROUP BY sto.hu_id, sto.location_id, sto.item_number, sto.lot_number, sto.actual_qty\r\n"
				+ "HAVING COUNT(sto.hu_id) < 2 ORDER BY NEWID()\r\n"
//				+ "OFFSET @from_record - 14 ROWS FETCH NEXT 1 ROW ONLY";
				+ "OFFSET 0 ROWS FETCH NEXT 1 ROW ONLY";

		return cycleCountDetails;
	}

	public String getQueryDetailsforPurchaseOrder(String poNum) {
		String details = null;

		details = "select item_number, lot_number, qty from t_po_detail (nolock) where po_number = '" + poNum + "'";
		return details;
	}

	public String getLPNFromTransactionTableforPurchaseOrder(String poNum) {
		String details = null;

		details = "select source_hu_id from t_tran_log(nolock) where inbound_order_number ='" + poNum + "'";
		return details;
	}

	public String getLotDetails(String loc, String hu_id) {
		String details = null;

		details = "select lot_number, item_number, hu_id, location_id, actual_qty from t_stored_item(nolock) where wh_id ='"
				+ PropertyStorage.getWarehouseId().toString() + "' and location_id = '" + loc + "' and hu_id = '"
				+ hu_id + "'";
		return details;
	}

	public String getLocDetails(String loc, String hu_id) {
		String details = null;

		details = "select lot_number, item_number, hu_id, location_id, actual_qty from t_stored_item(nolock) where wh_id ='"
				+ PropertyStorage.getWarehouseId().toString() + "' and location_id = '" + loc + "' and hu_id = '"
				+ hu_id + "'";
		return details;
	}

	public String getDetails() {
		String details = null;

//		details = " select top(1) loc.location_id from t_location loc(nolock) \r\n"
//				+ " JOIN t_item_master itm (nolock) ON itm.wh_id =loc.wh_id\r\n" + " where loc.type='I' and loc.wh_id='"
//				+ PropertyStorage.getWarehouseId().toString() + "'\r\n"
//				+ "and itm.class_id='GENERAL' and loc.status = 'E'";

//		details = "select Top(1) loc.location_id from t_location loc(nolock) \r\n"
//				+ "JOIN t_item_master itm (nolock) ON itm.wh_id =loc.wh_id where loc.type='I' and loc.wh_id='"
//				+ PropertyStorage.getWarehouseId().toString() + "' and itm.class_id='GENERAL' and loc.status = 'E'\r\n"
//				+ "ORDER BY NewID(); ";

		details = "select top(1) location_id from t_location(nolock) where type='I' and status='E' and wh_id in (select wh_id from t_item_master where class_id='GENERAL' and wh_id='"
				+ PropertyStorage.getWarehouseId().toString() + "')and wh_id='"
				+ PropertyStorage.getWarehouseId().toString() + "'";
		return details;
	}

	public String insertingNewLotRecord(String itemNum, String lotNumber) {
		String details = null;

		details = "INSERT INTO t_lot_master (item_number, lot_number, expiration_date, mfg_date)\r\n" + "VALUES ('"
				+ itemNum + "', '" + lotNumber + "', '2027-03-18', '2025-03-18');";
		return details;
	}

	public String getDetailsForCycleCountSecondItem(String itemNumber) {
		String details = null;

		details = "declare @from_record int=200 \r\n"
				+ "	select sto.hu_id, sto.location_id, sto.item_number, sto.lot_number, sto.actual_qty from t_stored_item sto(nolock) \r\n"
				+ "	JOIN t_location loc(nolock) ON loc.location_id=sto.location_id AND sto.wh_id=loc.wh_id \r\n"
				+ "	JOIN t_item_master itm (nolock) ON itm.wh_id =loc.wh_id\r\n" + "	WHERE sto.wh_id= '"
				+ PropertyStorage.getWarehouseId().toString()
				+ "' and itm.class_id='GENERAL' and sto.item_number Not LIKE '" + itemNumber
				+ "' and itm.uom = 'PC'\r\n"
				+ "	and sto.status = 'A' and loc.type='I' and sto.lot_number IS NOT NULL and sto.actual_qty >0 and sto.hu_id IS NOT NULL ORDER by item_number\r\n"
				+ "	OFFSET @from_record-161 ROWS FETCH NEXT 1 ROW ONLY";
		return details;
	}

	public String getLocDetails(String loc) {
		String details = null;

		details = "select lot_number, item_number, hu_id, location_id, actual_qty from t_stored_item(nolock) where wh_id ='"
				+ PropertyStorage.getWarehouseId().toString() + "' and location_id = '" + loc + "'";
		return details;
	}

	private Connection getConnection() throws SQLException {
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		return DriverManager.getConnection(connectionUrl);
	}

	private List<String> executeQuery(String query, String... columns) {
		List<String> results = new ArrayList<>();
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet resultSet = stmt.executeQuery(query)) {

			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println("Output string: " + rsmd.toString());
			System.out.println("Column count: " + columnsNumber);

			while (resultSet.next()) {
				for (String column : columns) {
					results.add(resultSet.getString(column));
					System.out.print(column + " " + resultSet.getString(column));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return results;
	}

	public String addNewLotRecord(String itemNum) {
		String lot = RandomUtils.generateLot(1000);
		ResultSet resultSet = null;
		String connectionUrl = PropertyStorage.getSQLConnectionUrl();
		System.out.println("connectionUrl --> " + connectionUrl);

		String query = insertingNewLotRecord(itemNum, lot);
		System.out.println("Query from method --> " + query);

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {

			Statement stmt = connection.createStatement();
			ResultSet jjhg = stmt.executeQuery(query);
			connection.close();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return lot;
	}

}
