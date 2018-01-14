import java.io.*;
class Main 
{
    static long digSum (long N)
    {
        long sum = 0;
        while (N > 0)
        {
            sum = sum + (N%10);
            N/= 10;
        }
        return sum;
    }
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
	BufferedReader br = new BufferedReader(in);
	int T = Integer.parseInt(br.readLine());
	for (int i=0; i<T; i++) 
        { 
            String[] arr = br.readLine().split(" ");
	    long A = Long.parseLong(arr[0]);
            long N = Long.parseLong(arr[1]);
            while (A > 9)
                A = digSum(A);
            if (N > 1)
                N = 6 + N%6;
            A = (long) Math.pow(A, N);
            while (A > 9)
                A = digSum(A);
            System.out.println(A);
        }
	br.close();
    }
} 
