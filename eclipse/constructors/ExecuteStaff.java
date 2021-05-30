import java.util.Scanner;
import java.util.Stack;

class staff
{
	String StaffId,Name;
	float Salary;
	int Phone;
	staff(String StaffId,String Name,float Salary,int Phone)
	{
		this.StaffId = StaffId;
		this.Salary = Salary;
		this.Name = Name;
		this.Phone =Phone;
		
	}
	
	void display()
	{
		
		System.out.print(StaffId+"\t"+Name+"\t"+Phone+"\t"+Salary);
	}
}

class Teaching extends staff
{
	String domain;
	int pub;
	Teaching(String StaffId,String Name,float Salary,int Phone,String domain,int pub)
	{
		super(StaffId,Name,Salary,Phone);
		this.domain = domain;
		this.pub = pub;
	}
	
	void display() 
	{
		super.display();
		System.out.println("\t" + domain + pub + "\t" + "--\t"+ "--\t");
	}
}

class Technical extends staff
{
	String skills;
	Technical(String StaffId,String Name,float Salary,int Phone, String skills)
	{
		super(StaffId,Name,Salary,Phone);
		this.skills =skills;
	}
	
	void display()
	{
		super.display();
		System.out.println("\t"+"--"+"\t"+"--"+"\t\t"+skills+"\t"+"--");
	}
}

class Contract extends staff
{
	int period;
	Contract(String StaffId,String Name,float Salary,int Phone,int period)
	{
		super(StaffId,Name,Salary,Phone);
		this.period = period;
	}
	
	void display() 
	{
		super.display();
		
		System.out.println("\t"+"--"+"\t"+"--"+"\t\t"+"--"+"\t"+period );
	}
}
public class ExecuteStaff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Id,name;
		float Sal;
		int Ph;
		String dom;
		int pubg;
		String skill;
		int per;
		
		staff St[] = new staff[10];
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter how many number of Teaching staff ");
		n = sc.nextInt();
		
		//Staf s1 = new Staf(Id, name, ph, Sal);
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter StaffID :: ");
			Id =sc.next();
			System.out.println("Enter Name :: ");
			name = sc.next();
			System.out.println("Enter phone number :: ");
			Ph = sc.nextInt();
			System.out.println("Enter Salary :: ");
			Sal = sc.nextFloat();
			System.out.println("Enter Domain :: ");
			dom = sc.next();
			System.out.println("no of Publications :: ");
			pubg = sc.nextInt();
			
			St[i] = new Teaching(Id,name,Sal,Ph,dom,pubg);
			
			
		}
		
		System.out.println("enter the number of Technical staff : : ");
		int m = sc.nextInt();
		
		for(int i=n+1;i<=m+n;i++)
		{
			System.out.println("Enter StaffID :: ");
			Id =sc.next();
			System.out.println("Enter Name :: ");
			name = sc.next();
			System.out.println("Enter phone number :: ");
			Ph = sc.nextInt();
			System.out.println("Enter Salary :: ");
			Sal = sc.nextFloat();
			System.out.println("Enter skills :: ");
			skill = sc.next();
			
			St[i] = new Technical(Id,name,Sal,Ph,skill);
		}
		
		System.out.println("enter the number of Contract staff : : ");
		int k= sc.nextInt();
		
		for(int i=n+1+m;i<=m+n+k;i++)
		{
			System.out.println("Enter StaffID :: ");
			Id =sc.next();
			System.out.println("Enter Name :: ");
			name = sc.next();
			System.out.println("Enter phone number :: ");
			Ph = sc.nextInt();
			System.out.println("Enter Salary :: ");
			Sal = sc.nextFloat();
			System.out.println("Enter period :: ");
			per = sc.nextInt();
			
			St[i] = new Contract(Id,name,Sal,Ph,per);
		}
		
		System.out.println("StaffID \tName \tPhone \tSalary \tDomain \tPublications \tSkills \tPeriod");
		
		for(int i=1;i<=m+n+k;i++)
		{
			St[i].display();
			System.out.println("");
		}
		
	}

}
