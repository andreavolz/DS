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
	
	
        public Address(){
            
        }
        
	//Construtores
	public Address(String Country, String State, String City, String Zip, String Street, int Number){
            this.country = Country;
            this.state = State;
            this.city = City;
            this.zip = Zip;
            this.street = Street;
            this.number = Number;		
            this.date = Calendar.getInstance();
		
	}
	
	public Address(String Country, String State, String City, String Neighboorhood, String Zip, String Street, int Number, String Complement){
            this.country = Country;
            this.state = State;
            this.city = City;
            this.neighboorhood = Neighboorhood;
            this.complement = Complement;
            this.zip = Zip;
            this.street = Street;
            this.number = Number;	
            this.date = Calendar.getInstance();
		
	}
	
	//ID Get/Set
	//private boolean setID(String Zip, int Number){};
	
	public int getID(){  
            return this.id;
        };

	//Country get/set
	public void setCountry(String newCountry){
            this.country = newCountry;
        };
	
	public String getCountry(){
            return this.country;
        };
	
	//State Get/Set
	public void setState(String newState){
            this.state = newState;
        };
	
	public String getState(){
            return this.state;
        };
	
	//City Get/Set
	public void setCity(String newCity){
            this.city = newCity;
        };
	
	public String getCity(){
            return  this.city;
        };
	
	//Neighboorhood get/set
	public void setNeighboorhood(String newNeighboorhood){
            this.neighboorhood = newNeighboorhood; 
        };
	
	public String getNeighboorhood(){
            return this.neighboorhood;
        };
	
	//Zip Get/Set
	public void setZip(String newZip){
            this.zip = newZip;
        };
	
	public String getZip(){
            return this.zip;
        };
	
	//Street get/set
	public void setStreet(String newStreet){
            this.street = newStreet;
        };
	
	public String getStreet(){
            return this.street;
        };
	
	//Number get/set
	public void setNumber(int newNumber){
            this.number = newNumber;
        };
	
	public int getNumber(){
            return this.number;
        };
	
	//Complement get/set
	public void setComplement(String newComplement){
            this.complement = newComplement;
        };
	
	public String getComplement(){
            return this.complement;
        };
	
	
	

}
