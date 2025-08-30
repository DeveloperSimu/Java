class Test1
{void swap(int a ,int b)
{int t=a;
a=b;
b=t;
}
public static void main(String args[])
{Test1 ob = new Test1();
int x=5,y=6;
System.out.println("Before swap="+x+" "+y);
ob.swap(x,y);
System.out.println("After swap="+x+" "+y);
}
}