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
            String[] nm = br.readLine().split(" ");
            int N = Integer.parseInt(nm[0]);
            int min = Integer.parseInt(nm[1]);
            int max = Integer.parseInt(nm[2]);           
            int[] weights = new int[N];
            int[] biases = new int[N];
            int ifEven = 0;
            int ifOdd = 1;
            for (int i=0; i<N; i++)
            {
                String[] wb = br.readLine().split(" ");
                weights[i] = (Integer.parseInt(wb[0])) % 2;
                biases[i] = (Integer.parseInt(wb[1])) % 2;
                ifEven = (ifEven * weights[i] + biases[i]) % 2;
                ifOdd = (ifOdd * weights[i] + biases[i]) % 2;
            }
            int countNonSpam = (max - min + 1)/2 + (1 - min%2);
            int countSpam = max - min - countNonSpam + 1;
            int countEven = countNonSpam, countOdd = countSpam;
            if (ifEven == 1)
            {
                countSpam += countEven;
                countNonSpam -= countEven;               
            }
            if (ifOdd == 0)
            {
                countNonSpam += countOdd;
                countSpam -= countOdd;
            }
            System.out.println(countNonSpam+" "+countSpam);
        }
        br.close();
	}
}
