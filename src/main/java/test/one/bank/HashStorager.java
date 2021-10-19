package test.one.bank;

import java.util.HashMap;

public class HashStorager {

	HashMap<String, Double> hashMap = new HashMap<String, Double>();
	
	public void put(String transId, Double amount) {
		hashMap.put(transId, amount);
	}
		
		public Double getTransaction(String transId) {
		return hashMap.get(transId);
	}

}