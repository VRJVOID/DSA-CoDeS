import java.util.*;
class Cards
{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter  value of a : ");
       int a = in.nextInt();
       
       System.out.println("Enter  value of b : ");
       int b = in.nextInt();

       System.out.println("Enter  value of c : ");
       int c = in.nextInt();

       System.out.println("Enter  value of d : ");
       int d = in.nextInt();
    
        int count=0;
        int sum=0;

        if(a==1 || b==1 || c==1 || d==1)
        {
            count += 1;
        }
        if(a==9 || b==9 || c==9 || d==9)
        {
            count += 2;
        }
        if(a==10 || b==10 || c==10 || d==10)
        {
            count += 1;
        }
        if(a==11 || b==11 || c==11 || d==11)
        {
            count += 3;
        }

        sum = a+b+c+d;

        
        System.out.println("Count = " +count);
    }
}