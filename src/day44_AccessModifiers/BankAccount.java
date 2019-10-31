package day44_AccessModifiers;

public class BankAccount {
	/*
	WarmUp: create a custom class for bankaccount
    The attributes/data that the class can have are: 
            AccountHolder, AccountName, AvailableBalance
    Actions the class can do are:
            deposit, withdraw, checking balance
    Requirements:
            1. apply encapsulation
            2. user should be able to deposit, withdraw and check the balance
                2.1 if the withdrawing amount is greater than available balance, 35$ penalty fee will be charger from the account
                2.2 if the available balance is less or equal to 0, account holder won't be able to withdraw money
	*/
	private String AccounHolder;
	private long AccounNumber;
	private double AvailableBalance;
	
	//getter(read only)instance return method
		public String getAccountHolder() {
			return AccounHolder;
		}
		public long getAccountNumber() {
			return AccounNumber;
		}
		public double getAvailableBalance() {
			return AvailableBalance;
		}
	
	//setter(modify):instance void method, passes a parameter
		public void setAccountHolder(String AccountHolder) {
			this.AccounHolder=AccounHolder;
		}
		public void setAccountNumber(long AccountNumber) {
			this.AccounNumber=AccountNumber;
		}

	//actions
		public void Deposit(double amount) {
			AvailableBalance+=amount;
		}
		public void WithDraw(double amount){
			/*
			if(AvailableBalance<=0) {
				System.out.println("your account balance is less or equal to zero");
				return;
			}
			if(amount>AvailableBalance){
				AvailableBalance-=35;
			}
			AvailableBalance-=amount;
			*/
			if(AvailableBalance<=0) {
				System.out.println("your account balance is less or equal to zero");
				return;
			}else if(amount>AvailableBalance){
				AvailableBalance-=amount;
				AvailableBalance-=35;
			}else{
				AvailableBalance-=amount;			 
			}
			 
		}
		public void ShowBalance() {
			System.out.println("Available Balance: "+AvailableBalance);
		}
		//get account info:
        public void getAccountInfo() {
            System.out.println("Name: " + getAccountHolder());
            System.out.println( "Account Number: "+getAccountNumber() );
            System.out.println("Available Balance: "+getAvailableBalance());
        }
}
