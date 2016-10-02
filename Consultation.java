import java.util.*;
import java.util.Calendar;

public class Consultation {

	private int id;
	private int pacientId;
	private int doctorId;

	private float bloodPresure;
	private float weight;

	private String observations;
	private String physicalExam;
	private String footExam;

	private Calendar createDate;
	private Calendar updateDate;

	private bool sync;



	public Consultation(){};



	public int getId(){return id;};

	public int getPacientId(){return pacientId;};
	private boolean setPacientId(){};

	public int getDoctorId(){return doctorId;};
	private setDoctorId(){};

	public float getBloodPresure(){return bloodPresure;};
	public boolean setBloodPresure(){};

	public float getWeight(){return weight;};
	public boolean setWeight(){};

	public String getObservations(){return observations;};
	public boolean setObservations(){};

	public String getPhysicalExam(){return physicalExam;};
	public boolean setPhysicalExam(){};

	public String getFootExam(){return footExam;};
	public boolean setFootExam(){};

	public Calendar getCreateDate(){return createDate;};
	private boolean setCreateDate(){};

	public Calendar getUpdateDate(){return updateDate;};
	private boolean setUpdateDate(){};

	public boolean isSync(){return sync;};
	public boolean setSync(){};




}