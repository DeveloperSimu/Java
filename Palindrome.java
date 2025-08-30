public class Palindrome{
public static void main(String[] args)
{int num=121,Original=num,reverse=0,remainder;
while(num>0)
{remainder=num%10;
reverse=reverse*10+remainder;
num/=10;
}
if(Original==reverse)
{System.out.println(Original+" is a Palindrome");
}else
{System.out.println(Original+" is not a Palindrome");
}
}
}