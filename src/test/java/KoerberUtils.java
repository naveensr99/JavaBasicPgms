package ecolab.koerber.base;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KoerberUtils {

	private static Logger log = LoggerFactory.getLogger(KoerberUtils.class);

	public String dateConversion(String inputFormat, String expectedFormat, String inputDate) {
		String outputDate = null;
		try {
			SimpleDateFormat inFormat = new SimpleDateFormat(inputFormat);// Feb 23 2026 //MMM dd yyyy
			SimpleDateFormat outFormat = new SimpleDateFormat(expectedFormat);// 2013-09-02, 2026-02-23 //yyyy-MM-dd

			String inDate = inputDate.strip();
			Date date = inFormat.parse(inDate);

			outputDate = outFormat.format(date);
			System.out.println("Converted date: " + outputDate);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return outputDate;
	}
}

