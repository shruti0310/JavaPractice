import java.text.SimpleDateFormat;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sds = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		System.out.println(sd.format(d));
		System.out.println(sds.format(d));
		System.out.println(d.toString());
		
		
		

	}

}
