package ex01;

public class CalculatorModel {
	protected String calculate(String in) {
		boolean error = false;
		String result;
		
		String[] strValues = in.split("\\+");
		
		int[] intValues = new int[strValues.length];
		try { // parseInt may produce an exception
    		for (int i = 0; i < strValues.length; i++) {
    		    intValues[i] = Integer.parseInt(strValues[i]);
    		}
		} catch (NumberFormatException e) {
		    error = true;
		}
		
		if (error) {
		    result = "Error";
		} else {
		    int sum = 0;
		    for (int intValue : intValues) sum += intValue;
		    result = Integer.toString(sum);
		}
		
		return result;
	}
	
}
