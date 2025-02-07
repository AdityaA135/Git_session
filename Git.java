public class Git {
    int n;
    public Git(int n)
    {
        this.n=n;
    }
    public static void main(String[] args)
    {
        Git obj=new Git(5);
        for(int i=0;i<obj.n;i++)
        {
            System.out.println("The numbers are: "+i+1);
        }
    }
}
