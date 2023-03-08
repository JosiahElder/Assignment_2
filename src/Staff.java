class Staff
{
    private String name;
    private String address;
    private int yearsOfService;

    public Staff()
    {
        this.name = "";
        this.address = "";
        this.yearsOfService = 0;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setYearsOfService(int yearsOfService)
    {
        this.yearsOfService = yearsOfService;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public int getYearsOfService()
    {
        return yearsOfService;
    }
}