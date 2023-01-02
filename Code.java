import Operation.Addition;
import Operation.Maximum;
import java.io.*;

 class Code {

   public static void main(String a[]) throws IOException
   {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in)) ;
        
        System.out.println("Enter no: ");
        int n1 =Integer .parseInt(br.readLine() );
        int n2 =Integer .parseInt(br.readLine() );

        Maximun p = new Maximum();

        System.out.println("Maximum of no given nos are : ");
        p.Max(n1,n2);

        Addition s = new Addition();
        System.out.println("given nos are: ");
        s.Add(n1,n2);
        s.Subtract(n1,n2);




    }

    
}