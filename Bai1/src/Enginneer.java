public class Enginneer extends Officer {
    private String major;

    public Enginneer(String name, int age, String gender, String address, String major){
        super(name, age, gender, address);
        this.major = major;
    }

    public String getMajor(){
        return major;
    }

    @Override
    public String toString(){
        String res = "Name: " + name +
                "\tAge: " + age +
                "\tGender: " + gender +
                "\tAddress: " + address +
                "\tMajor: " + major;
        return res;
    }
}
