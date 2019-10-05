package ex02;

public class WebValidationModel {
	private String symbolicAdress;
	private String ipAdress;
	private String port;
	
	public String getsymbolicAdress() {
		return symbolicAdress;
	}
	
	public String getipAdress() {
		return ipAdress;
	}
	
	public String getport() {
		return port;
	}
	
	public void setsymbolicAdress(String symbolicAdress) {
		this.symbolicAdress = symbolicAdress;
	}
	
	public void setipAdress(String ipAdress) {
		this.ipAdress = ipAdress;
	}
	
	public void setport(String port) {
		this.port = port;
	}
	
}
