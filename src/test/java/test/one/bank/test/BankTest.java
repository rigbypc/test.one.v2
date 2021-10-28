package test.one.bank.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;

import test.one.bank.*;

class BankTest {

	@Test
	void testFake() {
		IStorage storage = new HashStorager();
		FakeDisplay display = new FakeDisplay();
		
		TransactionProcessor transactionProcessor = new TransactionProcessor(display, storage);
		
		transactionProcessor.transaction("AX1", 4000.12);
		
		assertEquals(4000.12*1.277, display.getLastAmount());
		
	}
	
	@Test
	void testWithMocks() {
		IStorage storage = mock(IStorage.class);
		IDisplay display = mock(IDisplay.class);
		
		TransactionProcessor transactionProcessor = new TransactionProcessor(display, storage);
		
		ArgumentCaptor<Double> finalAmountCaptor =
				ArgumentCaptor.forClass(Double.class);
		
		transactionProcessor.transaction("AX1", 4000.12);
		
		InOrder inOrder = inOrder(display, storage);
		
		inOrder.verify(display).show("AX1");
		inOrder.verify(display).show(finalAmountCaptor.capture());
		
		inOrder.verify(storage).put("AX1", finalAmountCaptor.getValue());
		
	}

}
