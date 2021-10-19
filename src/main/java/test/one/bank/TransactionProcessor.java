package test.one.bank;

public class TransactionProcessor {

	private CrtDisplay crt;
	private HashStorager hash;
	Double fee = 1.5;
	
	public TransactionProcessor() {
		crt = new CrtDisplay();
		hash = new HashStorager();
		fee = 1.277;
	}
	
	public void transaction(String transId, Double amount) {
		crt.show(transId);
		crt.show(amount);
		
		amount *= fee;
		
		crt.show(amount);
		hash.put(transId, amount);
	}

}
