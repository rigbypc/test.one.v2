package test.one.bank;

public class CrtDisplay implements IDisplay {

	Crt crt = new DisplayFactory.getInstance().getDisplay();
	
	@Override
	public void show(Double amount) {
		crt.show(amount);
		
	}

	@Override
	public void show(String transId) {
		crt.show(transId);
		
	}
	
	
}
