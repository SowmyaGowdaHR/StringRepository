
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Sony is going to introduce Internet TV soon";
        System.out.println("Original String: " + str);

        //reversed string using Stringbuffer
        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);


	}

}
