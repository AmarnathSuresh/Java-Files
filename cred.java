import java.util.Scanner;
class cred
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String subjectName=sc.nextLine();
        Subject subject;
        try
        {
            subject=Subject.valueOf(subjectName);
        }
		catch (IllegalArgumentException e)
        {
            System.out.println("This subject is not running in this semester.");
            return;
        }
        System.out.println(subject.getFacultyName()+" "+subject.getCredits());
    }
}
enum Subject
{
    Java(4,"Shruti"), 
    OS(3,"Puneet Kumar"), 
    AI(2,"James William"), 
    Android(3,"Md. Adil Khan");
    
    private int credits;
    private String facultyName;
    
    Subject(int credits, String facultyName)
    {
        this.credits=credits;
        this.facultyName=facultyName;
    }
    
    public int getCredits()
    {
        return credits;
    }
    
    public String getFacultyName()
    {
        return facultyName;
    }
}