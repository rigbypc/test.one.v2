package test.one.bank;

import java.util.HashMap;

public class HashStorager implements IStorage {

	HashMap<String, Double> hashMap = new HashMap<String, Double>();
	
	@Override
	public void put(String transId, Double amount) {
		hashMap.put(transId, amount);
	}
		
		@Override
		public Double getTransaction(String transId) {
		return hashMap.get(transId);
	}

}