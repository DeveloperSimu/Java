class Test
{int a,b;
Test(int i,int j)
{a=i;
b=j;
}
boolean equals(Test ob)
{if(ob.a == a && ob.b == b)
return true;
else return false;
}
public static void main(String args[])
{Test ob1 = new Test(100,22);
Test ob2 = new Test(100,22);
Test ob3 = new Test(-1,-1);
System.out.print(ob1.equals(ob2));
System.out.print(ob1.equals(ob3));
}
}
