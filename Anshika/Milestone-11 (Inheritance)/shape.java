class shape
{
    void print1 ()
    {
        System.out.println ("This is shape");
    }
}

class rectangle extends shape
{
    void print2 ()
    {
        System.out.println ("This is rectangle");
    }
}

class circle extends shape
{
    void print3 ()
    {
        System.out.println ("This is circle");
    }
}

class square extends rectangle 
{
    void print4 ()
    {
        System.out.println ("This is square");
    }
}