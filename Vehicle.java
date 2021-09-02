public class Vehicle{
    private String name = "";
    private String color = "";
    private String model = "";
    private String company  = "";

    // empty constructor
    public Vehicle (){}

    // overloading constructor
    public Vehicle (String name, String color, String model, String company){
        this.name  = name;
        this.color = color;
        this.model = model;
        this.company = company;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public String getModel(){
        return this.model;
    }

    public String getCompany(){
        return this.company;
    }

    public void setName(String s){
        this.name = s;
    }

    public void setColor(String s){
        this.name = s;
    }

    public void setModel(String s){
        this.name = s;
    }

    public void setCompany(String s){
        this.name = s;
    }

}
