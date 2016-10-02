import java.util.*;
import java.util.Calendar;

public class Audition {

	private int id;
	private int pacientId;
	private int doctorId;

	private String nutrition;
	private String hearing;
	private String vision;
	private String humorDepression;
	private String cognitionMemory;
	private String dailyActivies;
	private String tumble;

	private Calendar createDate;
	private Calendar updateDate;

	private boolean sync;


	public Audition(){};


	public int getId(){return id;};
	
	public int getPacientId(){return getPacientId;};
	private boolean setPacientId(){};

	public int getDoctorId(){return doctorId;};
	private boolean setDoctorId(){};

	public String getNutrition(){return nutrition;};
	public boolean setNutrition(){};
	
	public String getHearing(){return hearing;};
	public boolean setHearing(){};
	
	public String getVision(){return vision;};
	public boolean setVision(){};

	public String getHumorDepression(){return humorDepression;};
	public boolean setHumorDepression(){};
	
	public String getCognitionMemory(){return cognitionMemory;};
	public boolean setCognitionMemory(){};
	
	public String getDailyActivies(){return dailyActivies;};
	public boolean setDailyActivies(){};
	
	public String getTumble(){return tumble;};
	public boolean setTumble(){};

	public Calendar getCreateDate(){return createDate;};
	private boolean setCreateDate(){};

	public Calendar getUpdateDate(){return updateDate;};
	private boolean setUpdateDate(){};

	public boolean isSync(){return sync;};
	public boolean setSync(){};




}