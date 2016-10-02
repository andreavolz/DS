import java.util.*;
import java.util.Calendar;
import java.*;

public class Doctor extends Person {

	private boolean boss;


	public boolean createPacient(){};
	public boolean deletePacient(){};
	public boolean alterPacient(){};
	public Pacient getAllPacient(){};
	public boolean enablePacient(){};
	public Pacient searchPacient(){};
	
	public boolean createAudition(){};
	public boolean alterAudition(){};
	public Audition getAudition(){};
	public Audition getAuditions(){};
	
	public boolean createConsultation(){};
	public Consultation getConsultation(){};
	public Consultation getConsultations(){};
	
	public boolean createDoctor(){};
	public Doctor getAllDoctor(){};
	public boolean deleteDoctor(){};
	public boolean enableDoctor(){};
	public Doctor searchDoctor(){};

	public boolean isBoss(){return boss;};

}