public class Officer {
    protected String name;
    protected int age;
    protected String gender;
    protected String address;

    public Officer(String name, int age, String gender, String address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getAddress(){
        return address;
    }
}