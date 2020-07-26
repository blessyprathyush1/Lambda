import java.util.*; 
import java.util.stream.IntStream; 
  
class Average
{ 
  
    public static void main(String[] args) 
    {   
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the list:");
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; ++i)
            a[i] = input.nextInt();
            
        IntStream list = IntStream.of(a);  
        OptionalDouble avg = list.average(); 
        if (avg.isPresent()) 
        { 
            System.out.println(avg.getAsDouble()); 
        } 
        else
        { 
            System.out.println("-1"); 
        } 
    }
}