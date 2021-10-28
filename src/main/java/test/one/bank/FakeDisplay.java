package test.one.bank;

public class FakeDisplay implements IDisplay {

	Double lastAmount;
	public FakeDisplay() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show(Double amount) {
		lastAmount = amount;

	}

	@Override
	public void show(String transId) {
		// TODO Auto-generated method stub

	}
	
	public Double getLastAmount() {
		return lastAmount;
	}

}
