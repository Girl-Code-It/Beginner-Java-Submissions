class parent2
{
    private void print ()
    {
        System.out.println ("this is parent class");
    }
}

class child2 extends parent2
{
    void printt ()
    {
        System.out.println ("this is child class");
    }

    public static void main (String args[]) 
    {
        parent2 a=new parent2 ();
        child2 b=new child2 ();
        a.print ();
        b.printt ();
        b.print ();
    }
}

