import java.io.*;
import java.util.*;
class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        int f1=-1,f2=-1;
        ArrayList<Long> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if((int)arr[i]==x && f1==-1){
                 f1=i;
            }else if((int)arr[i]==x && f1!=-1){  f2=i;}
        }
        if(f1!=-1 && f2==-1){ f2=f1;}
        a.add(Long.valueOf(f1));
        a.add(Long.valueOf(f2));
        return a;
    }
}
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}
