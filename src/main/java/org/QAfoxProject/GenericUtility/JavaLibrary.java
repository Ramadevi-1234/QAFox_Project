package org.QAfoxProject.GenericUtility;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;


/**
 * This Class Contains reusable methods to perform java related operations
 * 
 * @author Ramadevi
 * 
 */

public class JavaLibrary {
	/**
	 * this method is used to pause the script execution for specified time
	 * @param time
	 */
	public void pause(long time) {
		try {
			Thread.sleep(time);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	/**this method is used to fetch current date and time
	 * @return
	 */
	public String getCurrentTime() {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		return sdf.format(date);
		}
	/**this method is used to generates random number within the specified limit
	 * @param limit
	 * @return
	 */
	public int generateRandomNum(int limit) {
		Random random=new Random();
		return random.nextInt(limit);
	}
}
