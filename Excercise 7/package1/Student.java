package package1;


    public class Student
    {
        int age;
        String name,addr,fna,mna;
        public Student(int e, char m, String a, String b, String c, String d)
        {
            age=e;
            name=a;
            addr=d;
            fna=b;
            mna=c;
        }
        public void test()
        {
            System.out.println("STUDENT INFORMATION");
            System.out.println("Name of the student is: "+name);
            System.out.println("Age="+age);
            System.out.println("Address of the student is: "+addr);
            System.out.println("Father's name: "+fna);
            System.out.println("Mother'sname is: "+mna);
        }
    }