package javaintroduction;

public class Cricketer {
	int jersyno;
	String cricketerName;
	int cricketerAge;
	
	static int countryId;
	static String countryname;

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------");
		countryId = 22;
		countryname = "india";
		System.out.println("CRICKETER INFORMATION");
		System.out.println("Countryid:"+countryId);
		System.out.println("CountryName:"+countryname);
		Cricketer klr = new Cricketer();
		klr.jersyno = 1;
		klr.cricketerName = "kl rahul";
		klr.cricketerAge = 34;
		System.out.println("JersyNo:"+klr.jersyno);
		System.out.println("CricleterName:"+klr.cricketerName);
		System.out.println("Age:"+klr.cricketerAge);
		System.out.println("----------------------------------------------------------");
		
		countryId = 23;
		countryname = "india";
		System.out.println("CRICKETERS INFORMATION");
		System.out.println("Countryid:"+countryId);
		System.out.println("CountryName:"+countryname);
		
		Cricketer vk = new Cricketer();
		vk.jersyno = 18;
		vk.cricketerName = "virat kohli";
		vk.cricketerAge = 39;
		System.out.println("JersyNo:"+vk.jersyno);
		System.out.println("CricleterName:"+vk.cricketerName);
		System.out.println("Age:"+vk.cricketerAge);
		System.out.println("----------------------------------------------------------");
		
		countryId = 24;
		countryname = "india";
		System.out.println("CRICKETERS INFORMATION");
		System.out.println("Countryid:"+countryId);
		System.out.println("CountryName:"+countryname);
		
		Cricketer peddi = new Cricketer();
		peddi.jersyno = 100;
		peddi.cricketerName = "Peddi";
		peddi.cricketerAge = 39;
		System.out.println("JersyNo:"+peddi.jersyno);
		System.out.println("CricleterName:"+peddi.cricketerName);
		System.out.println("Age:"+peddi.cricketerAge);
		System.out.println("----------------------------------------------------------");
		
		Cricketer msd = new Cricketer();
		msd.jersyno = 7;
		msd.cricketerName = "dhoni";
		
		System.out.println("CRICKETERS INFORMATION");
		System.out.println("Countryid:"+countryId);
		System.out.println("CountryName:"+countryname);msd.cricketerAge = 70;
		System.out.println("JersyNo:"+msd.jersyno);
		System.out.println("CricleterName:"+msd.cricketerName);
		System.out.println("Age:"+msd.cricketerAge);
		System.out.println("----------------------------------------------------------");
		
		
		
	}

}
