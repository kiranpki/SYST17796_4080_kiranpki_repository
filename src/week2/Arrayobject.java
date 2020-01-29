package week2;
public class Arrayobject {
	public static void main (String args[ ])
	{
		String myArray[ ] = new String [1];
		//loading the array
		myArray[0] = "Software design";
		
 		System.out.println("List of programs");
                for (String myArray1 : myArray) {
                System.out.println(myArray1);
            }
        }
}
