package test.one.bank;

public interface IStorage {

	void put(String transId, Double amount);

	Double getTransaction(String transId);

}