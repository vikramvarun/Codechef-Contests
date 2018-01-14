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
            int len = N*N;
            int[] arr = new int[len];
            for (int j=0; j<N; j++)
            {
                String[] A = br.readLine().split(" ");
                for (int k=0; k<N; k++)
                    arr[j*N+k] = Integer.parseInt(A[k]);
            }
            long total = 0;
            int max = 0;
            for (int j=len-N; j<len; j++)
            {
                if (arr[j] > max)
                    max = arr[j];
            }
            total += (long) max;
            int maxI = 0;
            for (int j=N-2; j>=0; j--)
            {
                maxI = 0;
                int start = j*N;
                int end = (j+1)*N;
                for (int k=start; k<end; k++)
                {
                    if (arr[k] > maxI && arr[k] < max)
                        maxI = arr[k];
                }
                if (maxI == 0)
                {
                    total = -1;
                    break;
                }
                else 
                {
                    total += (long) maxI;
                    max = maxI;
                }
            }
            System.out.println(total);
        }        
        br.close();
	}
}
