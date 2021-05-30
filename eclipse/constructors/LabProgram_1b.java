import java.util.Scanner;

class StackDemo
{
	int capacity = 3;
	int arr[] = new int[capacity];
	int top = -1;
	
	public void push(int pushedElement)
	{
		if(top < capacity-1)
		{
			top++;
			arr[top]=pushedElement;
			System.out.println("The element"+pushedElement+"is pushed in to stack");
			
		}
		else
		{
			System.out.println("The stack ovetflown");
		}
	}
	void pop()
	{
		if(top>=0)
		{
			top--;
			System.out.println("pop operation is sucessful");
			System.out.println("THe popped element is "+arr[top+1]);
		}
		else
		{
			System.out.println("Stack underflow");
		}
	}
	void display()
	{
		if(top>=0)
		{
			for(int i=top;i>=0;i--)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println(" ");
		}
		else
		{
			System.out.println("NO elements in the array");
		}
	}
}
public class LabProgram_1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackDemo sd = new StackDemo();
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter your choice ");
			System.out.println(" ");
			System.out.println("1.push\n2.pop\n3.display \n4.Exit");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 : System.out.println("Enter the number1 to push");
					int Number = sc.nextInt();
					sd.push(Number);
					break;
			case 2:sd.pop();
			break;
			case 3:sd.display();
			break;
			case 4 : System.exit(0);
			break;
			}
		}
		
	}

}
