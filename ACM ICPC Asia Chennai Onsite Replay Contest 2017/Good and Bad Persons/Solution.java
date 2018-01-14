import java.io.*;
class Main 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
	BufferedReader br = new BufferedReader(in);		
        int T = Integer.parseInt(br.readLine());               
        for (int i=0; i<T; i++ )
        {
            String[] nk = br.readLine().split(" ");
            int N = Integer.parseInt(nk[0]);
            int K = Integer.parseInt(nk[1]);
            String str = br.readLine();
            int small = 0, large = 0;
            for (int j=0; j<N; j++)
            {
                if (str.charAt(j) > 'Z')
                    small++;
                else
                    large++;
            }
            String result = "both";
            if (small > K && large > K)
                result = "none";
            else if (small > K)
                result = "chef";
            else if (large > K)
                result = "brother";
            System.out.println(result);
        }
        br.close();
	}
} 
