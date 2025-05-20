package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder {
@Autowired
private LocalDate date;
public WeekDayFinder()
{
	System.out.println("WeekDayFinder::0-param constructor");
}
public String showMessage(String user)
{
	int number = date.getDayOfWeek().getValue();
	if(number>=1&&number<=5)
		return "Work hard to build Strong career in it:"+user;
	else
		return "take a break and enjoy"+user;
}

	
}
