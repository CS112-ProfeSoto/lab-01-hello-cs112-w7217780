public class Dog
{
    public Dog()
    {
        this.name_ = "";
    }

    public Dog(String name)
    {
        this.name_ = name;
    }

    public Dog(Dog otherDog)
    {
        this.name_ = otherDog.name_;
    }

    public String getName()
    {
        return name_;
    }

    public void setName(String name)
    {
        this.name_ = name;
    }

    @Override
    public String toString()
    {
        return "Name : " + name_;
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

    private String name_;
}
