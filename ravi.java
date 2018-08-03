import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static void count(String str)
    {
        // Create an char array of given String
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) 
        {
 
            // Declare an String with empty initialization
            String s = "";
 
            // When the character is not space
            while (i < ch.length && ch[i] != ' ')
            {
 
                // concat with the declared String
                s = s + ch[i];
                i++;
            }
 
            if (s.length() > 0) 
                System.out.println(s + "->" + s.length());            
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
 
	String str = "laptop is good";
        count(str);
}
}
