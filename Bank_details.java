package Assessment;
class Bank_details {  
    private int acc_no;  
    private String name;  
    private String acc_type;  
    private long balance;   
    
    public Bank_details(String name,int acc_no,String acc_type, long balance) {
    	this.name = name;
    	this.acc_no = acc_no;
    	this.acc_type = acc_type;
    	this.balance = balance;
    }
 
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	} 
}   

