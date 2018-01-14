import java.io.*;
class Main 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
	    BufferedReader br = new BufferedReader(in);	        
        int T = Integer.parseInt(br.readLine()); 
        for (int t=0; t<T; t++)
        {
            int count = 0;
            String result = "uniform";
            String str = br.readLine();
            for (int i=0; i<8; i++)
            {
                int index = (i+1)%8;
                if (str.charAt(i) != str.charAt(index))
                    count++;               
            }
            if (count > 2)
                result = "non-uniform";
            System.out.println(result);
        }
        br.close();
	}
} 
