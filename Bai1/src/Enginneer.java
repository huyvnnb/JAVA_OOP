public class Enginneer extends Officer {
    protected String major;

    public Enginneer(String name, int age, String gender, String address, String major){
        super(name, age, gender, address);
        this.major = major;
    }

    public String getMajor(){
        return major;
    }
}
