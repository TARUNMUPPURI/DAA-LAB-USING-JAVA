
//method overloading with example of linear search with variable index..........
class Search
{
	int linear(int arr[] , int elem)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == elem)
			{
				return i;
			}
		}return -1;
	}
	
	int linear(int arr[] , int elem , int pos )
	{
		for(int i=pos;i<arr.length;i++)
		{
			if(arr[i] == elem)
			{
				return i;
			}
		}return -1;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world");
		Search s1;
		s1 = new Search();
		int arr[] = {10,25,36,30,10,36,96,58,25,};
		int a = s1.linear(arr,25);
		int b = s1.linear(arr,25,2);
		
		System.out.println("first case starting............"+a);
		System.out.println("Second case from index 2.... "+b);
	}

}
