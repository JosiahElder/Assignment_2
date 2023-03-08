class Student
{
    private String name; // store student name
    private String address; // store student address
    private int year; // store student year

    public Student()
    {
        this.name = "";
        this.address = "";
        this.year = 0;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public int getYear()
    {
        return year;
    }
}