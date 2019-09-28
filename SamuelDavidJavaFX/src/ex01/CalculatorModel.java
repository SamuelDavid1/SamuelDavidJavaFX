package ex01;

public class CalculatorModel {
	private int result;
	private int num1, num2;
	private String newString, plusString, resultString;
	
	public int getResult() {
		result = num1 + num2;
		return result;
	}
	
	public void setResult(int result) {
		this.result = result;
	}
	
	public void setnum1(int num1) {
		this.num1 = num1;
	}
	
	public void setnum2(int num2) {
		this.num2 = num2;
	}
	
	public void setnewString(String newString) {
		this.newString = newString;
	}
	
	public String getnewString() {
		return newString;
	}
	
	public void setplusString(String plusString) {
		this.plusString = plusString;
	}
	
	public String getplusString() {
		return plusString;
	}
	
	public void setresultString(String resultString) {
		this.resultString = resultString;
	}
	
	public String getresultString() {
		return resultString;
	}
}
