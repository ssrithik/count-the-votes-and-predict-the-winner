import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        
        int[] arr1 = {1,2,3,1,2,4};
        int[] arr2 = {16,18,25,27,22,35};
        System.out.println(winner(arr1,arr2));
    }
    public static int winner(int arr1[],int arr2[])
    {   int a=0,b=0,c=0,d=0;
        int i;
        for(i=0;i<arr1.length;i++)
        {
           if(arr1[i] == 1 && arr2[i] >= 18)
           {
           a++;
           }
           else if(arr1[i] == 2 && arr2[i] >= 18)
           {
               b++;
           }
            else if(arr1[i] == 3 && arr2[i] >= 18)
           { 
               c++;
           }
            else if(arr1[i] == 4 && arr2[i] >=18)
           {
               d++;
           }
           else
           {
               continue;
           }
        }
        ArrayList<Integer> s = new ArrayList<>();
        s.add(a);
        s.add(b);
        s.add(c);
        s.add(d);
        return Collections.max(s);
    }
}