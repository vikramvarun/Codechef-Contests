import java.io.*;
import java.util.*;
class Main 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
	    BufferedReader br = new BufferedReader(in);	  
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++)
        {
            int N = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");
            int[] digCount = new int[10];
            for (int j=0; j<N; j++)
            {
                String numJ = arr[j];
                for (int k=0; k<numJ.length(); k++)
                {
                    int dig = Integer.parseInt(String.valueOf(numJ.charAt(k)));
                    digCount[dig] += 1;
                }
            }
            for (int j=9; j>=0; j--)
            {
                int count = digCount[j];
                for (int k=0; k<count; k++)
                    System.out.print(j);
            }
        }        
        br.close();
	}
}
