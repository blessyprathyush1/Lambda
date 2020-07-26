import java.util.stream.Stream; 
import java.util.Scanner;
class Strings
{ 
  
    public static void main(String[] args) 
    { 	
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter size of array:");
    	int n = input.nextInt();
    	String[] str = new String[n];
    	for(int i = 0; i < n; ++i)
    		str[i] = input.next();
        
        Stream<String> stream = Stream.of(str); 
        stream.filter(st -> st.startsWith("a") && st.length()==3)
        .forEach(System.out::println); 
    } 
} 