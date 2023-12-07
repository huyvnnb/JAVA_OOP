public class Worker extends Officer{
    private int level;

    public Worker(String name, int age, String gender, String address, int level){
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel(){
        return level;
    }

    @Override
    public String toString(){
        String res = "Name: " + name +
                "\tAge: " + age +
                "\tGender: " + gender +
                "\tAddress: " + address +
                "\tLevel: " + level;
        return res;
    }
}
