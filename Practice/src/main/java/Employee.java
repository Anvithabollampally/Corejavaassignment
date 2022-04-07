import java.util.Date;

class Employee {
    static int empId;
    static int eId;
    String eName;
    double basicSal, medical, pt, netSal, grossSal, hra, pf, empSal;



    public void Employee() {

        this.empId = this.empId + 1;

    }

    public static void totalEmployees() {
        System.out.println("Total number of employees = " + Employee.empId);
    }


    Employee() {

    }

    Employee(int empId, String eName, double basicSal, double medical, double pt) {
        this.empId = empId;
        this.eName = eName;
        this.basicSal = basicSal;
        this.medical = medical;
        this.pt = pt;
        this.hra = (50 * basicSal) / 100;
        this.pf = (20 * basicSal) / 100;
        this.grossSal = this.basicSal + this.hra + this.medical;
        this.netSal = this.grossSal - (this.pt + this.pf);
        // System.out.println(this.grossSal);
        //System.out.println(this.netSal);

    }

    public void calculate() {
        this.grossSal = this.basicSal + this.hra + this.medical;
        this.netSal = this.grossSal - (this.pt + this.pf);
        System.out.println("The Grosssalary is : " + this.grossSal);
        System.out.println("The Netsalary is : " + this.netSal);
    }

    public MyDate dateOfJoining() {
        MyDate date = new MyDate();
        return date;
    }


    Employee(int empId, String empName, int empSal) {
        Employee.eId = this.eId + 1;
        MyDate d = new MyDate();
        System.out.println(d);

        Employee.empId = empId;
        this.eName = empName;
        this.empSal = empSal;
    }

    public void calculateee() {
        System.out.println("Employee id = " + eId);
        System.out.println("Employee name = " + eName);
        System.out.println("Employee salary = " + empSal);
    }


    public static void main(String[] args) {
        Employee emp = new Employee(11, "anvitha", 35000d, 12d, 200d);
        emp.calculate();

        Employee e = new Employee();
        e.Employee();
        e.totalEmployees();
        Employee e1 = new Employee();
        e1.Employee();
        e1.totalEmployees();
        Employee e3 = new Employee();
        e3.Employee();
        e3.totalEmployees();


        Employee emp3 = new Employee(11, "hny", 11000);
        emp3.calculateee();
    }


}









