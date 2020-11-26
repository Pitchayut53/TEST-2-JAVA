import java .util.*;
import java.lang.Math;
class Insuffivientbalance extends Exception { //userdefined exception
      public Insuffivientbalance(String message) {
        // call the constructor of Exception class
        super(message);
      }
    }
interface Bank{
    public void CreateAccount();
    public void Deposit(double Amount);
    public void Withdraw(double Amount);
    public void Getbalance();
    public void GetAnnualInterest();
}

class SBI implements Bank{
    int Bankid;
    int f = 0;
    String Branch,Location;
    String name,email;
    double balance = 0;
    double totalbalance = balance;
    double interest = 0.5;
    Scanner obj = new Scanner(System.in);
    public void CreateAccount()
    {
        Random rand = new Random(); 
        Bankid  = rand.nextInt(1000);
        System.out.print("\nEnter Your Name : ");
        this.name = obj.nextLine();
        System.out.print("\nEnter Your email : ");
        this.email = obj.nextLine();
        System.out.print("Your SBI Account is created");
        System.out.println("\nBank Id is : "+this.Bankid);
    }
    public void Deposit(double Amount)
    {
        this.balance = balance + Amount;
        System.out.print("You have Deposited money");
    }
    public void Withdraw(double Amount)
    {
        try{
        if(Amount>this.balance)
        {
            throw new Insuffivientbalance("Insufficient balance");
        }
    }
        catch (Insuffivientbalance e) 
        {
            System.out.println(e);
        }
        this.balance = balance - Amount;
        System.out.print("You have Withdrawn money");
    }
    public void Getbalance()
    {
        System.out.print("\nYour SBI Amount Balance : " + this.balance);
    }
    public void GetAnnualInterest()
    {
       this.totalbalance = totalbalance + (this.balance * this.interest);
       System.out.print("\nYour SBI Amount Balance with 5% Annual Interest Rate : " + this.totalbalance);
    }
}

class HDFC implements Bank{
    int Bankid;
    String Branch,Location;
    String name,email;
    double balance = 0;
    double totalbalance = balance;
    double interest = 0.6;
    Scanner obj = new Scanner(System.in);
    public void CreateAccount()
    {
        Random rand = new Random(); 
        Bankid  = rand.nextInt(1000);
        System.out.print("\nEnter Your Name : ");
        this.name = obj.nextLine();
        System.out.print("\nEnter Your email : ");
        this.email = obj.nextLine();
        System.out.print("Your SBI Account is created");
        System.out.println("\nBank Id is : "+this.Bankid);
    }
    public void Deposit(double Amount)
    {
        this.balance = balance + Amount;
        System.out.print("You have Deposited money");
    }
    public void Withdraw(double Amount)
    {
        try{
        if(Amount>this.balance)
        {
            throw new Insuffivientbalance("Insufficient balance");
        }
        }
        catch (Insuffivientbalance e) 
        {
            System.out.println(e);
        }
        this.balance = balance - Amount;
        System.out.print("You have Withdrawn money");
    }
    public void Getbalance()
    {
        System.out.print("\nYour HDFC Amount Balance : " + this.balance);
    }
    public void GetAnnualInterest()
    {
       this.totalbalance = totalbalance + (this.balance * this.interest);
       System.out.print("\nYour HDFC Amount Balance with 6% Annual Interest Rate : " + this.totalbalance);
    }
}

class ICICI implements Bank{
    int Bankid;
    String Branch,Location;
    String name,email;
    double balance = 0;
    double totalbalance = balance;
    double interest = 0.7;
    Scanner obj = new Scanner(System.in);
    public void CreateAccount()
    {
        Random rand = new Random(); 
        Bankid  = rand.nextInt(1000);
        System.out.print("\nEnter Your Name : ");
        this.name = obj.nextLine();
        System.out.print("\nEnter Your email : ");
        this.email = obj.nextLine();
        System.out.print("Your SBI Account is created");
        System.out.println("\nBank Id is : "+this.Bankid);
    }
    public void Deposit(double Amount)
    {
        this.balance = balance + Amount;
        System.out.print("You have Deposited money");
    }
    public void Withdraw(double Amount)
    {
        try{
        if(Amount>this.balance)
        {
            throw new Insuffivientbalance("Insufficient balance");
        }
        }
        catch (Insuffivientbalance e) 
        {
            System.out.println(e);
        }
        this.balance = balance - Amount;
        System.out.print("You have Withdrawn money");
    }
    public void Getbalance()
    {
        System.out.print("\nYour ICICI Amount Balance : " + this.balance);
    }
    public void GetAnnualInterest()
    {
       this.totalbalance = totalbalance + (this.balance * this.interest);
       System.out.print("\nYour ICICI Amount Balance with 7% Annual Interest Rate : " + this.totalbalance);
    }
}

public class Person {
    static int d =0;
    public static void main(String args[])
    {
        SBI obj1 = new SBI();
        HDFC obj2 = new HDFC();
        ICICI obj3 = new ICICI();
        double money = 0;
        Scanner mon= new Scanner(System.in);
        do{
        System.out.print("\n\n=================== Select Option ===================\n");
        System.out.print("1. Create Bank Account\n");
        System.out.print("2. Deposit Money\n");
        System.out.print("3. Withdraw Money\n");
        System.out.print("4. Display Maximum Amount Person\n");
        System.out.print("5. Exit\n");
        System.out.print("Enter the option : ");
        Scanner ch= new Scanner(System.in);
        int c = ch.nextInt();
        switch(c)
        {
            case 1 : 
            System.out.print("\nSelect Bank to create an Account\n");
            System.out.print("1. SBI\n");
            System.out.print("2. HDFC\n");
            System.out.print("3. ICICI\n");
            System.out.print("4. Exit\n");
            System.out.print("Enter the option : ");
            Scanner inch= new Scanner(System.in);
            int in = inch.nextInt();
            switch(in)
            {
                case 1 : obj1.CreateAccount();
                break;
                case 2 : obj2.CreateAccount();
                break;
                case 3 : obj3.CreateAccount();
                break;
                case 4 :
                System.out.print("\nThank you");
                break;
                default :
                System.out.println("\nWrong input!!");
            }
            break;
            case 2 :
            System.out.print("\nSelect Bank to Deposit Money\n");
            System.out.print("1. SBI\n");
            System.out.print("2. HDFC\n");
            System.out.print("3. ICICI\n");
            System.out.print("4. Exit\n");
            System.out.print("Enter the option : ");
            Scanner inch1= new Scanner(System.in);
            int in1 = inch1.nextInt();
            switch(in1)
            {
                case 1 : 
                System.out.print("\nEnter Your Amount to Deposit : ");
                money = mon.nextDouble();
                obj1.Deposit(money);
                obj1.Getbalance();
                obj1.GetAnnualInterest();
                break;
                case 2 :
                System.out.print("\nEnter Your Amount to Deposit : ");
                money = mon.nextDouble();
                obj2.Deposit(money);
                obj2.Getbalance();
                obj2.GetAnnualInterest();
                break;
                case 3 :
                System.out.print("\nEnter Your Amount to Deposit : ");
                money = mon.nextDouble();
                obj3.Deposit(money);
                obj3.Getbalance();
                obj3.GetAnnualInterest();
                break;
                case 4 :
                System.out.print("\nThank you");
                break;
                default :
                System.out.println("\nWrong input!!");
            }
            break;
            case 3 :
            System.out.print("\nSelect Bank to withdraw Money\n");
            System.out.print("1. SBI\n");
            System.out.print("2. HDFC\n");
            System.out.print("3. ICICI\n");
            System.out.print("4. Exit\n");
            System.out.print("Enter the option : ");
            Scanner inch2= new Scanner(System.in);
            int in2 = inch2.nextInt();
            switch(in2)
            {
                case 1 : 
                System.out.print("\nEnter Your Amount to Withdraw : ");
                money = mon.nextDouble();
                obj1.Withdraw(money);
                obj1.Getbalance();
                obj1.GetAnnualInterest();
                break;
                case 2 :
                System.out.print("\nEnter Your Amount to Withdraw : ");
                money = mon.nextDouble();
                obj2.Withdraw(money);
                obj2.Getbalance();
                obj2.GetAnnualInterest();
                break;
                case 3 :
                System.out.print("\nEnter Your Amount to Withdraw : ");
                money = mon.nextDouble();
                obj3.Withdraw(money);
                obj3.Getbalance();
                obj3.GetAnnualInterest();
                break;
                case 4 :
                System.out.print("\nThank you");
                break;
                default :
                System.out.println("\nWrong input!!");
            }
            break;
            case 4 :
            double totally = Math.max(obj1.totalbalance, Math.max(obj2.totalbalance,obj3.totalbalance));
            System.out.println("The Person who has Maximum number Amount is: " + totally); 
            break;
            case 5 :
            System.out.print("\nThank you for using");
            d = 1;
            break;
            default :
            System.out.println("\nWrong input!!");
        }
    }while(d==0);
    }
    
}
