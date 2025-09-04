class A
{
void area()
System.out.println("mo")
}
void area(int r)
{
System.out.println("area of circle"+(3.14*r*r));
}
void area(int l,int b)
{
System.out.println("area of rectangle :" +l*b);
}
void area(float s)
{
System.out.println("area of square"+s*S);
}
public static void main(string args[])
{
overloading obj=new overloading();
obj.area();
obj.area(7,2);
obj.area(2.4,5.2);
obj.area(7);
}