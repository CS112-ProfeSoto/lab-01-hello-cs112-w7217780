public class Dog
{
    public Dog()
    {
        this.name = "";
    }

    public Dog(String name)
    {
        this.name = name;
    }

    public Dog(Dog otherDog)
    {
        this.name = otherDog.name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Name : " + name;
    }

    public boolean equals(Dog otherDog)
    {
        if(this == otherDog)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private String name;
}
