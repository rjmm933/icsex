import java.util.*;

public class PT1_16
{
    public static void main(String args[])
    {
        for(int i = 1; i<= 4; i++) 
        // Master loop or to control row
        {
            for(int j = 1; j<= 4; j++ )
            // Slave loop or to control column
            {
                if((i==j)||(i==(5-j)))
                {
                    System.out.print(i); 
                    // to print required character in columns
                }
                else
                {   System.out.print("#"); // or ()
                    // to print required character in columns
                }
            }    
            System.out.println();
            // To change the row
        }
    }
}