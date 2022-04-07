
public class Main {

    public static void main(String... args) {
        MyDate date1 = new MyDate(10, 10, 1996);
        date1.initDate();


        MyDate d = new MyDate(10, 1, 1956);
         d.initDate();
        MyDate d2 = new MyDate();
        d2.initDate();



        System.out.println("Day is: " + d.day);
        System.out.println("Month is: " + d.month);
        System.out.println("Year is: " + d.year);
        System.out.println("Day is: " + d2.day);
        System.out.println("Month is: " + d2.month);
    System.out.println("Year is: " + d2.year);

        MyDate d7 = new MyDate(11, 7, 2021);
        d7.display();
        MyDate d8 = new MyDate(25, 3, 2022);
        d8.display();

        MyDate da=new MyDate();
       da.dateOfJoining();


        Rectangle r1=new Rectangle(3, 4);
        r1.method1();
        System.out.println("Area of rectangle is "+r1.area());


        Circle c1=new Circle(3);
        c1.method1();
        System.out.println("Area of circle is "+c1.area());

        Account a = new Account(100);
        System.out.println("Depositing the money is");
        a.deposit(1000);

        try{
            System.out.println("Withdrawing the money is");
            a.withdraw(100);
            a.withdraw(9000);
        }catch(LessBalanceException e) {

            System.out.println("Lessbalance: Remaining account balance is : "+e.getBalance());

        }


    }

}