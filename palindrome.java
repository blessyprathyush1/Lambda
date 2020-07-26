import java.util.*;
class Palindrome
{ 
  static boolean Palindrome(String str) 
    {   
        int i = 0, j = str.length() - 1; 
        while (i < j)
        { 
            if (str.charAt(i) != str.charAt(j)) 
                return false;
            i++; 
            j--; 
        } 
        return true; 
    } 
    public static void main(String[] args) 
    {   Scanner input = new Scanner(System.in);
        int i,n;
        System.out.println("Enter size of list:");
        n = input.nextInt();
        List<String> listofstrings=new ArrayList<String>();
        for(i = 0; i < n; ++i)
            listofstrings.add(input.next());  

        for(i=0;i<n;i++)
        { 
        String str=listofstrings.get(i);
        if (Palindrome(str)) 
            System.out.println(str); 
        } 
} }