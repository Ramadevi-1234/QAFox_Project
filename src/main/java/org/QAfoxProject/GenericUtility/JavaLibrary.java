package org.QAfoxProject.GenericUtility;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

import io.opentelemetry.sdk.metrics.data.Data;

/**
 * This Class Contains reusable methods to perform java related operations
 * 
 * @author Ramadevi
 * 
 */

public class JavaLibrary {
	/**
	 * This method is Used to Pause the script execution for specific time
	 * 
	 * @param time
	 */
	public void pause(long time) {
		try {
			Thread.sleep(time);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	/**
	 * This method is Used to Pause the script execution for specific time
	 * 
	 *  @return
	 */
	public String getCurrentTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_YYYY_hh_mm_ss");
		return sdf.format(date);
	}
	
	/**
	 * This method is Used to Pause the script execution for specific time
	 * 
	 * @param
	 * @return
	 */
	public int generateRandomNum(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
	}
}
