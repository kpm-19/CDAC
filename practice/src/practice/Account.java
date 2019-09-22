package practice;


class InsufficientBalanceException extends Exception
{

	public InsufficientBalanceException(String message) {
		super(message);
		//System.out.println(message);
		// TODO Auto-generated constructor stub
	}
	
	
}


 class Account 
{
	 	int balance;

		public Account(int balance) 
		{
			super();
			this.balance = balance;
		}
	 	
		void Withdraw(int withdrawamt) throws InsufficientBalanceException
		{
			if(withdrawamt>balance-1000)
				System.out.println("Insufficient balance" + balance);
			else
			{
				balance=balance-withdrawamt;
				if(balance<=1000)
				{
					
						throw new InsufficientBalanceException("minimum balance 1000 should be maintained");
					
				}
				else
				{
					System.out.println("Remaining balance :" +balance);
				}
				
				
			}
		
		
		}
		
		
		
		
}
