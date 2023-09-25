package ATM_MachineJavaProject;

import java.text.DecimalFormat;
import java.util.*;
import java.io.IOException;
public class OptionMenu extends Account{
    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
    public void getLogin() throws IOException{
        int x = 1;
        do{
            try{
                data.put(123456789, 9867);
                data.put(234555789, 7846);
                System.out.println("Welcome!");
                System.out.println("Enter your customer number:");
                setCustomerNumber(sc.nextInt());
                setPinNumber(sc.nextInt());
            }
            catch(Exception e){
                System.out.println("\n" + "Invalid character(s). Only numbers." + "\n");
                x = 2;
            }
            for(Map.Entry<Integer, Integer> entry : data.entrySet()){
                if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()){
                    getAccountType();
                }
            }
            System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
        }while(x == 1);
    }
    public void getAccountType(){
        System.out.println("Select the account you want to access:");
        System.out.println("Type 1 - To check account");
        System.out.println("Type 2 - Savings account");
        System.out.println("Type 3 - Exit");
        System.out.print("Choice:");
        selection = sc.nextInt();
        switch(selection){
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using ATM services");
                break;
            default:
                System.out.println("\n" + "Invalid Choice" + "\n");
                getAccountType();
        }
    }
    public void getChecking(){
        System.out.println("Checking Account:");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.print("Choice: ");
        selection = sc.nextInt();
        switch(selection){
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawalInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using ATM services");
                break;
            default:
                System.out.println("\n" + "Invalid Choice" + "\n");
                getChecking();
        }
    }
    public void getSaving(){
        System.out.println("Saving Account:");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposite Funds");
        System.out.println("Type 4 - Exit");
        System.out.print("Choice: ");
        selection = sc.nextInt();
        switch(selection){
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawalInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using ATM services");
                break;
            default:
                System.out.println("\n" + "Invalid Choice" + "\n");
                getSaving();
        }
    }
    int selection;
}