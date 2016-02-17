public class Account {

	int balance = 500;

	public void transfer(Account acc, int amount) {
		//synchronized(this) {
        {
			synchronized(acc) { // To ensure atomicity
				if(acc != null && acc.debit(amount)) {
					credit(amount);
				}
			}
		}
	}

	public synchronized boolean debit(int amount) {
		if(balance < amount) return false;

		balance -= amount;
		return true; 
	}

	public synchronized void credit(int amount) {
		balance += amount;
	} 

}


