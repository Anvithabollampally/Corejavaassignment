package Package2;

public class BatchStudent
{
    int tot,avg,bnum;
    public BatchStudent(int f,int g,int h)
    {
        tot=f;
        avg=g;
        bnum=h;
    }
    public void test1()
    {
        System.out.println("BATCH INFORMATION");
        System.out.println("Batch number "+bnum);
        System.out.println("Total number of students in a batch= "+tot);
        System.out.println("Average Attendance of each student  ="+avg+"%");

    }
}


