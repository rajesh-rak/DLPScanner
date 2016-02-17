public class TestAccount {
	public static void main(String [] args) {
		Account user1, user2; 
		user1 = new Account(); 
		user2 = new Account(); 

		// test credit
		user1.credit(200); 

		// test debit
		user1.debit(100);

		// test transfer
		user1.transfer(user2,50); 
	}
}
