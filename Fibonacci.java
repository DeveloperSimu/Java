public class Fibonacci{
public static void main(String[] args)
{int n=6;
int first=0,second=1,next;
System.out.println("Fibonacci series:");
for(int i=0;i<n;i++)
{System.out.println(first+" ");
next=first+second;
first=second;
second=next;
}
}
}