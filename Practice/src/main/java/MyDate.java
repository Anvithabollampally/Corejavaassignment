import java.util.Date;

public class MyDate {
    int day;
    int month;
    int year;


    public void initDate() {
        System.out.print(this.day + "/" + this.month + "/" + this.year);
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;


    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    MyDate() {
        this.day = 11;
        this.month = 02;
        this.year = 2020;

    }

   // MyDate(int day, int month, int year) {

     //   this.day = 16;
    //    this.month = 06;
      //  this.year = 1998;
    //}

    MyDate(int day, int month)
    {
        this.day=day;
        this.month=month;
    }
    MyDate(int day, String month, int  year)
    {
        this(day, Integer.parseInt(month));
        this. year= year;
    }
    void display()
    {

        System.out.println(day+" "+month+" "+year);
    }


        public Date dateOfJoining(){
            Date d=new Date();
            return d;

    }
}

