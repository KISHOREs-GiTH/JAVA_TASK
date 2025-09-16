package mc;

abstract class Account{
	abstract int getBalance();
	public void bankName() {
		System.out.println("IOB");
	}
}
class SavingsAcc extends Account{
	
	@Override
	int getBalance() {
		return 0;
		
	}
	
}
//class CurrentAcc extends Account{
//
//	@Override
//	//	void getBalance() {
//		
//		
//	}
//	
//}
//public class Abt_Load {
//	public static void main(String[] args) {
//		
//	}
//
//}
