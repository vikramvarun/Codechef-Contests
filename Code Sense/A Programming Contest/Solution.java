import java.io.*;
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
            for (int j=0; j<N; j++)
            {
                int num1 = Integer.parseInt(arr[j]);
                int count = 0;
                for (int k=0; k<N; k++)
                {
                    int num2 = Integer.parseInt(arr[k]);
                    if (num1 == num2)
                        count++;
                }
                if (count == 1)
                    System.out.print(num1+" ");
            }
            System.out.println("");
        }        
        br.close();
	}
} 
