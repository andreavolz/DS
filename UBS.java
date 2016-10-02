import java.util.*;
import java.util.Calendar;

public class UBS {
	private int id;
	private int addressid;

	private String name;

	private Calendar createDate;
	private Calendar updateDate;

	private boolean sync;

	public UBS(String nome, int enderecoId){

		createDate = Calendar.getInstance();

	};

	
	//ID Get/Set
	private boolean setID(String nome){return true;};
	
	public int getID(String nome){return 1;};

	//Name get/set
	public boolean setName(String nome){if(nome!="")name=nome;return true;};

	public String getName(){return name;};

	//Address Id get/set
	public boolean setAdressId(int endereco){if(endereco!=null)addressid=endereco;return true;};

	public int getAddressId(){return addressid;};

	//CreateDate get/set
	private boolean setCreateDate(Calendar data){createDate=data;return true;};

	public Calendar getCreateDate(){return createDate;};

	//UpdateData get/set
	private boolean setUpdateDate(Calendar data){updateDate=data;return true;};

	public Calendar getUpdateDate(){return updateDate;};

	//Sync
	public boolean isSync(){/*verificar sincronia com o servidor*/};

	private boolean setSync(){};

	public boolean getSync(){};

	//pull/push
	private boolean pull(){};

	private boolean push(){};
}
