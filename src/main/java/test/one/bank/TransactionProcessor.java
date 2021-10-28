package test.one.bank;

public class TransactionProcessor {

	private IDisplay display;
	private IStorage storage;
	Double fee = 1.5;
	
	public TransactionProcessor() {
		display = new CrtDisplay();
		storage = new HashStorager();
		fee = 1.277;
	}
	
	public TransactionProcessor(IDisplay display, IStorage storage) {
		this.display = display;
		this.storage = storage;
		fee = 1.277;
	}
	
	public void transaction(String transId, Double amount) {
		display.show(transId);
		
		amount *= fee;
		
		display.show(amount);
		storage.put(transId, amount);
	}

}
