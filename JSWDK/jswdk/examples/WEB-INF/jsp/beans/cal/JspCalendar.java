/*
 * Copyright (c) 1999 Sun Microsystems, Inc. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Sun
 * Microsystems, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sun.
 *
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
 * SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR ANY DAMAGES
 * SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
 * THIS SOFTWARE OR ITS DERIVATIVES.
 *
 */

package cal;

import java.text.DateFormat;
import java.util.*;

public class JspCalendar {
    Calendar  calendar = null;
    Date currentDate;

    public JspCalendar() {
	calendar = Calendar.getInstance();
	Date trialTime = new Date();
	calendar.setTime(trialTime);
    }


    public int getYear() {
	return calendar.get(Calendar.YEAR);
    }
    
    public String getMonth() {
	int m = getMonthInt();
	String[] months = new String [] { "January", "February", "March",
					"April", "May", "June",
					"July", "August", "September",
					"October", "November", "December" };
	if (m > 12)
	    return "Unknown to Man";
	
	return months[m - 1];

    }

    public String getDay() {
	int x = getDayOfWeek();
	String[] days = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", 
				      "Thursday", "Friday", "Saturday"};

	if (x > 7)
	    return "Unknown to Man";

	return days[x - 1];

    }
    
    public int getMonthInt() {
	return 1 + calendar.get(Calendar.MONTH);
    }

    public String getDate() {
	return getMonthInt() + "/" + getDayOfMonth() + "/" +  getYear();	
    }

    public String getCurrentDate() {
        Date dt = new Date ();
	calendar.setTime (dt);
	return getMonthInt() + "/" + getDayOfMonth() + "/" +  getYear();

    }

    public String getNextDate() {
        calendar.set (Calendar.DAY_OF_MONTH, getDayOfMonth() + 1);
	return getDate ();
    }

    public String getPrevDate() {
        calendar.set (Calendar.DAY_OF_MONTH, getDayOfMonth() - 1);
	return getDate ();
    }

    public String getTime() {
	return getHour() + ":" + getMinute() + ":" + getSecond();
    }

    public int getDayOfMonth() {
	return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public int getDayOfYear() {
	return calendar.get(Calendar.DAY_OF_YEAR);
    }

    public int getWeekOfYear() {
	return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    public int getWeekOfMonth() {
	return calendar.get(Calendar.WEEK_OF_MONTH);
    }

    public int getDayOfWeek() {
	return calendar.get(Calendar.DAY_OF_WEEK);
    }
     
    public int getHour() {
	return calendar.get(Calendar.HOUR_OF_DAY);
    }
    
    public int getMinute() {
	return calendar.get(Calendar.MINUTE);
    }


    public int getSecond() {
	return calendar.get(Calendar.SECOND);
    }

  
    public int getEra() {
	return calendar.get(Calendar.ERA);
    }

    public String getUSTimeZone() {
	String[] zones = new String[] {"Hawaii", "Alaskan", "Pacific",
				       "Mountain", "Central", "Eastern"};

	int index = 10 + getZoneOffset();

	if (index <= 5) {	
	    return zones[10 + getZoneOffset()];
	} 
	else return "Only US Time Zones are supported";
    }

    public int getZoneOffset() {
	return calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000);
    }


    public int getDSTOffset() {
	return calendar.get(Calendar.DST_OFFSET)/(60*60*1000);
    }

    
    public int getAMPM() {
	return calendar.get(Calendar.AM_PM);
    }
}




