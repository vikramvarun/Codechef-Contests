import java.io.*;
import java.math.*;
class Main 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
	    BufferedReader br = new BufferedReader(in);	  
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++)
        {
            int num = Integer.parseInt(br.readLine());
            int N = num;
            while (N > 0)
            {
                num = num * (N%10);
                N /= 10;
            }
            System.out.println(num);
        }        
        br.close();
	}
} 
