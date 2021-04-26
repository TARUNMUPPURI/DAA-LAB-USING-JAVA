import java.util.Scanner;

class Student
{
	String usn,name,branch,phno;
	String getUsn()
	{
		return usn;
	}
	String getName()
	{
		return name;
	}
	String getBranch()
	{
		return branch;
	}
	String getPhno()
	{
		return phno;
	}
	Student(String Usn,String Name,String Branch,String Phno)
	{
		usn = Usn;
		name = Name;
		branch = Branch;
		phno = Phno;
		
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hwlloe");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Students ");
		int n = sc.nextInt();
		Student[] st = new Student[n];
		
		for(int i=0;i<n;i++)
		{
			String us,na,br,ph;
			System.out.println("Enter the usn: ");
			us = sc.next();
			System.out.println("Enter the Name : ");
			na = sc.next();
			System.out.println("Enter the Branch : ");
			br = sc.next();
			System.out.println("Enter the Phone number : ");
			ph = sc.next();
			
			st[i] = new Student(us,na,br,ph);
		}
		System.out.println("STudent details");
		System.out.println("USN\t\tNAME\t\tBRANCH\t\tPHONE NUMBER\t");
		for(int j=0;j<n;j++)
		{
			System.out.println(st[j].getUsn()+"\t"+st[j].getName()+"\t"+st[j].getBranch()+"\t"+st[j].getPhno());
		}
		
		
		
		
	}

}
