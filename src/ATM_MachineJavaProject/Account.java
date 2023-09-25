package ATM_MachineJavaProject;
import java.util.*;
import java.text.DecimalFormat;
public class Account {
    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    //to set the customer number
    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }
    //to get the customer number
    public int getCustomerNumber(){
        return customerNumber;
    }
    //set the pin number
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }
    //get the pin number
    public int getPinNumber(){
        return pinNumber;
    }
    //get checking account balance
    public double getCheckingBalance(){
        return checkingBalance;
    }
    //get saving account balance
    public double getSavingBalance(){
        return savingBalance;
    }
    //calculate checking account withdrawal
    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    //calculate saving account withdrawal
    public double calcSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }
    public double calcCheckingDeposite(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
    //calculate saving account withdrawal
    public double calcSavingDeposite(double amount){
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }
    //customer checking account withdraw input
    public void getCheckingWithdrawalInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw from checking account");
        double amount = sc.nextDouble();
        if((checkingBalance - amount) >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        }
        else{
            System.out.println("Balance cannot be negative" + "\n");
        }
    }
    //customer saving account withdraw input
    public void getSavingWithdrawalInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to withdraw from saving account");
        double amount = sc.nextDouble();
        if((savingBalance - amount) >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("New Saving Account Balance: " + (savingBalance-amount) + "\n");
        }
        else{
            System.out.println("Balance cannot be negative" + "\n");
        }
    }
    //customer checking account deposite input
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to deposit to checking account");
        double amount = sc.nextDouble();
        if((checkingBalance + amount) >= 0){
            calcCheckingDeposite(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        }
        else{
            System.out.println("Balance cannot be negative" + "\n");
        }
    }
    //customer saving account deposit input
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to deposite to saving account");
        double amount = sc.nextDouble();
        if((savingBalance + amount) >= 0){
            calcSavingDeposite(amount);
            System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
        }
        else{
            System.out.println("Balance cannot be negative" + "\n");
        }
    }
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
}
