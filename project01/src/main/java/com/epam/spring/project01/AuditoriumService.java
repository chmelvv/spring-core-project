package com.epam.spring.project01;

import java.util.ArrayList;
import java.util.List;

/* #AuditoriumService - Returns info about auditoriums and places

Since auditorium information is usually static, store it in some property file. 
The information that needs to be stored is:
   name
   number of seats
   vip seats (comma-separated list of expensive seats)
   
//TODO
*******Several auditoriums can be stored in separate property files, information from them could be injected 
into the AuditoriumService

 - getAuditoriums(), getSeatsNumber(), getVipSeats()
 */

public class AuditoriumService {

	public List<Auditorium> getAuditoriums(){
		//TODO
		return new ArrayList<Auditorium>();
	}
	
	public int getSeatsNumber(Auditorium auditorium){
		//TODO
		return 30;
	}
	
	
	public String getVipSeats(Auditorium auditorium){
		//TODO
		return "1,2,3,4,5,6,7,8,9,10";
	}
}
