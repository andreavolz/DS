
import java.util.*;
import java.util.Calendar;

public class Address {
	
	
	private int id;
	
	private String country;
	private String state;
	private String city;
	private String neighboorhood;   //Opcional
	private String zip;				
	private String street;			
	private int number;				
	private String complement;		//Opcional
	
	private Calendar date;
	private Calendar updateData;
	
	private boolean sync;
	
	
	//Construtores
	public Address(String Country, String State, String City, String Zip, String Street, int Number){
		country = Country;
		state = State;
		city = City;
		zip = Zip;
		street = Street;
		number = Number;
		
		if(!setID(zip,number)){
			return ;
		}
		
		date = Calendar.getInstance();
		
	}
	
		public Address(String Country, String State, String City, String Neighboorhood, String Zip, String Street, int Number, String Complement){
		country = Country;
		state = State;
		city = City;
		neighboorhood = Neighboorhood;
		complement = Complement;
		zip = Zip;
		street = Street;
		number = Number;
		
		if(!setID(zip,number)){
			return ;
		}
		
		date = Calendar.getInstance();
		
	}
	
	//ID Get/Set
	private boolean setID(String Zip, int Number){return true;};
	
	public int getID(int Number,String Zip){return 1;};
	public int getID(String Street, int Number){return 1;};

	//Country get/set
	public boolean setCountry(String newCountry){return true;};
	
	public String getCountry(){return "";};
	
	//State Get/Set
	public boolean setState(String newState){return true;};
	
	public String getState(){return  "";};
	
	//City Get/Set
	public boolean setCity(String newCity){return true;};
	
	public String getCity(){return  "";};
	
	//Neighboorhood get/set
	public boolean setNeighboorhood(String newNeighboorhood){return true;};
	
	public String getNeighboorhood(){return  "";};
	
	//Zip Get/Set
	public boolean setZip(String newZip){return true;};
	
	public String getZip(){return  "";};
	
	//Street get/set
	public boolean setStreet(String newStreet){return true;};
	
	public String getStreet(){return  "";};
	
	//Number get/set
	public boolean setNumber(int newNumber){return true;};
	
	public int getNumber(){return 1;};
	
	//Complement get/set
	public boolean setComplement(String newComplement){return true;};
	
	public String getComplement(){return  "";};
	
	
	

}
