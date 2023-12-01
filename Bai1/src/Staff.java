public class Staff extends Officer {
    protected String work;

    public Staff(String name, int age, String gender, String address, String work){
        super(name, age, gender, address);
        this.work = work;
    }

    public String getWork(){
        return work;
    }
}
