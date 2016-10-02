package class;

public class Person {

		int id;
		String name;
		int	CPF;
		Date birthday;
		int RG;
		String phone;
		String email;
		String CivilStatus; //Marital Status also?
		Adress adressID;
		Boolean sync;

		private Boolean setID(int CPF, int SUS){};
		private Boolean setID(int CPF){};
		private Boolean setID(int SUS){};
		public int getID(int CPF){};
		public int getID(int SUS){};
		public int getID(int CPF, int SUS){};
		public String getName(int CPF, int RG){};
		public String getName(int CPF){};
		public String getName(int RG){};
		public Boolean setName(String name){}
		public Date getBirthday(String name, int CPF, int RG){};
		public Date getBirthday(String name){};
		public Date getBirthday(int CPF){};
		public Date getBirthday(int RG){};
		public Boolean setBirthday(Date bday){};
		public int getCPF(String name, int RG){};
		public int getCPF(int RG){};
		public Boolean setCPF(int CPF){};
		public int getRG(){};
		public Boolean setRG(){};
		public String getPhone(){};	
		public Boolean setPhone(){};
		public String getEmail(){};
		public Boolean setEmail(){};
		public String getCivilStatus(){};
		public Boolean setCivilStatus(){};
}	