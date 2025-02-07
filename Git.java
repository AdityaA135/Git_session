public class Git {
    int n;
    public Git(int n)
    {
        this.n=n;
    }
    public static void main(String[] args)
    {
        System.out.println("Making changes for third cut");
        Git obj=new Git(6);
        //changing 5 to 6(n)
        for(int i=0;i<obj.n;i++)
        {
            System.out.println("The numbers are in series are: "+i+1);
        }
    }
}
