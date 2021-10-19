package test.one.bank;

public class CrtDisplay {

	Crt crt = new DisplayFactory.getInstance().getDisplay();
	
	public void show(Double amount) {
		crt.show(amount);
		
	}

	public void show(String transId) {
		crt(transId);
		
	}
	
	
}
