//File name Insufficient funds Exception
import java.io.*;
 class InsufficientfundsException extends Exception{
private double amount;
public InsufficientfundsException(double amount){
      this.amount = amount;
}
      public double getAmount(){
      return amount;
   }
}
 class CheckingAccount{
private double balance;
private int number;
   public CheckingAccount(int number){
   this.number= number;
}
   public void deposit(double amount){
    balance+=amount;   
}
public void withdraw(double amount) throws
InsufficientfundsException{
     if(amount <= balance){
     balance-= amount;
}
else{
    double needs= amount - balance;
    throw new InsufficientfundsException(needs);
}
}
public double getbalance(){
return balance;
}
public int getnumber(){
return number;
}
}
public class BankDemo{
   public static void main (String args[]){
   CheckingAccount c= new CheckingAccount(101);
   System.out.println("Depositing $500");
   c.deposit(500); 
try
{
   System.out.println("Withdrawing $100..");
   c.withdraw(100);
   System.out.println("Withdrawing $200..");
   c.withdraw(200);
}
catch(InsufficientfundsException e)
{
   System.out.println("Sorry, but you are short $" +e.getAmount());
   e.printStackTrace();
}
}
}