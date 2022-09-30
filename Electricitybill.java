/*
write a program to show how to override the calculate
commercial class inside domestic class
*/


class Electricitybill
{
    public static void main(String arg[])
    {
        Commercial c=new Commercial();
        c.setName("Raj kumar");
        c.calculateBill(100);

        Domestics d=new Domestics();
        d.setName("Vijaya Laxmi");
        d.calculateBill(100);
    }
}


class Commercial
{
    private String name;
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
void calculateBill(int units)
{
    System.out.println("Customer:"+getName());
    System.out.println("Bill amount="+units*5.00);
}
}

class Domestics extends Commercial
{
    void calculate(int units)
    {
        System.out.println("customer:"+getName());
        System.out.println("Bill amount="+units*2.50);
    }
}
