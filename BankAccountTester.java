class BankAccountTester
{
  public static void main( String[] args)
  {
    BankAccount aliceAcc = new BankAccount(1398723);
    BankAccount bobAcc   = new BankAccount(1978394);

    aliceAcc.deposit(900); 
    aliceAcc.transfer(700,bobAcc);
    
    System.out.println("alice balance " + aliceAcc.getBalance());
    System.out.println("bob balance " + bobAcc.getBalance());
    
    System.out.println("Number of BankAccount objects: " + BankAccount.getNumberOfAccounts());
  }
}
