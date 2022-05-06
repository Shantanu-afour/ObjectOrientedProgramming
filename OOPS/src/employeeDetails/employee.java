
package employeeDetails;

public class employee {
    private int id = 1000;
    private String name;
    private String address;
    private String mail;
    private static int count = 0;
    public employee(String name, String address, String mail){
        count++;
    	this.id = id + count;
        this.name = name;
        this.address = address;
        this.mail = mail;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
    	
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getEmail() {
        return mail;
    }
 
    public void setEmail(String mail) {
        this.mail = mail;
    }
 
    public String toString(){
 
        return "ID: " + this.getId() +  " Name: " + this.getName() +  " Address: " + this.getAddress()
        + " EmailID: " + this.getEmail();
    }
 
	@Override
	public boolean equals(Object obj) {
		employee e = null;
	    if(obj instanceof employee){
	        e = (employee) obj;
	    }
	    if(this.getId() == e.getId()){
	        return true;
	    } else {
	        return false;
	    }  
	}

 
}