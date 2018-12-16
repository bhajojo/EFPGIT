package example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Example {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		    
			//System.out.println(Collections.sort(datestring, (s1, s2) -> LocalDateTime.parse((CharSequence) s1, formatter).
		      //      compareTo(LocalDateTime.parse((CharSequence) s2, formatter))));
		Example n = new Example();
		n.caller();
		    	
		    	
		 
	}
	
	  public boolean caller()
	   {
		 
		  SimpleDateFormat inSDF = new SimpleDateFormat("dd.MM.yyyy");
		SimpleDateFormat outSDF = new SimpleDateFormat("dd.mm.yyyy");
			String inDate="7.7.2016";
			  
			            try {
							Date date = inSDF.parse(inDate);
							System.out.println(date);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return true;
			           
			      
			  
			
	   }

}
