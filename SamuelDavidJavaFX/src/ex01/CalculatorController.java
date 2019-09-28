package ex01;

public class CalculatorController {
	final private CalculatorModel model;
	final private CalculatorView view;
	
	protected CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;

		view.b1.setOnAction((event) -> {
			model.setnum1(1);
			model.setnewString(Integer.toString(1));
			view.lblResult.setText(model.getnewString());
			
		});
		
		view.b2.setOnAction((event) -> {
			model.setnum1(2);
			model.setnewString(Integer.toString(2));
			view.lblResult.setText(model.getnewString());
			
		});
		
		view.b3.setOnAction((event) -> {
			model.setnum1(3);
			model.setnewString(Integer.toString(3));
			view.lblResult.setText(model.getnewString());
			
		});
		
		view.b4.setOnAction((event) -> {
			model.setnum1(4);
			model.setnewString(Integer.toString(4));
			view.lblResult.setText(model.getnewString());
			
		});
		
		view.b5.setOnAction((event) -> {
			model.setnum1(5);
			model.setnewString(Integer.toString(5));
			view.lblResult.setText(model.getnewString());
			
		});
		
		view.b6.setOnAction((event) -> {
			model.setnum1(6);
			model.setnewString(Integer.toString(6));
			view.lblResult.setText(model.getnewString());
			
		});
		
		view.b7.setOnAction((event) -> {
			model.setnum1(7);
			model.setnewString(Integer.toString(7));
			view.lblResult.setText(model.getnewString());
			
		});
		
		view.b8.setOnAction((event) -> {
			model.setnum1(8);
			String newText = Integer.toString(8);
			view.lblResult.setText(newText);
			
		});
		
		view.b9.setOnAction((event) -> {
			model.setnum2(9);
			model.setnewString(model.getnewString()+model.getplusString()+Integer.toString(9));
			view.lblResult.setText(model.getnewString());
		});
		
		view.bPlus.setOnAction((event) -> {
			model.setplusString(" + ");
			view.lblResult.setText(model.getnewString()+model.getplusString());
			
		});
		
		view.bClear.setOnAction((event) -> {
			view.lblResult.setText(" ");
			model.setnum1(0);
			model.setnum2(0);
			model.setResult(0);
			model.setnewString(" ");
			model.setplusString(" ");
			model.setresultString(" ");
		});
		
		view.bResult.setOnAction((event) -> {
			
			model.setresultString(Integer.toString(model.getResult()));
			view.lblResult.setText(model.getnewString()+" = "+model.getresultString());
			
		});
		
	}

}
