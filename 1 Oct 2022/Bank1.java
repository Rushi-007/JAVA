import java.util.Scanner;
class Bank1
{
	int acno;
	String name,mno;
	double balance ;

	//createAccount
	void createAccount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name ");
		name=sc.nextLine();
		System.out.println("Enter the mno");
		mno=sc.nextLine();
		while(true)
		{
			if(mno.length()==10)
			{
				System.out.println("valid mno");
				break;
				
			}
			else{
				System.out.println("invalid mno pls eneter mno again ");
				mno=sc.nextLine();
			}
		}
		System.out.println("Enter the acno");
		acno=sc.nextInt();
		System.out.println("Enter the balance");
		balance=sc.nextDouble();
		
		
		
	}
	void display()
	{
		System.out.println("Name "+name+"\nAcno "+acno+"\nMno "+mno+"\nBalance "+balance);

	}
	void deposit(int damt)
	{
		balance=balance+damt;
		System.out.println("After deposit Main balance is "+balance);
	}
	void withdrawal(int wamt)
	{
		balance=balance-wamt;
		System.out.println("After withdrawal main balance is "+balance);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Bank1 bobj=new Bank1();
		while(true)
		{
			System.out.println("1.create acccount\n2.display\n3.deposit\n4.withdrawal\n5.exit");
			System.out.println("enter your choice ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:bobj.createAccount();
				break;
			case 2:bobj.display();
				break;
			case 3:System.out.println("enter the deposit amount ");
				int x=sc.nextInt();
				bobj.deposit(x);
				break;
			case 4:System.out.println("enter the withdrawal amount ");
				x=sc.nextInt();
				bobj.withdrawal(x);
				break;
			case 5:System.exit(0);
				break;
			default:System.out.println("wrong choice ");
				break;
			}
		}
	}
}