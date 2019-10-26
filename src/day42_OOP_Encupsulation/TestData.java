package day42_OOP_Encupsulation;

public class TestData {
	
	/*
	 Name
	 ID
	 */
	private String name="fatma";//it is not visible to any other classes
	private int ID= 890;
	
	//getter: Read the data
	public String getName() {
		return name;
	}
	
	public int getID() {
		return ID;
	}
	public void getID(int ID) {
		this.ID = ID;
	}
	
	//setter: Modify the value
	public void setName(String name) {
			// name = str;  if the parameter variable different from private instance variable
			this.name = name;
	}
	
	public void setID(int ID) {
		this.ID=ID;
	}

	
	
	
}
