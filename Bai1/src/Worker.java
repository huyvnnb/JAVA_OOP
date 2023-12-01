public class Worker extends Officer{
    protected int level;

    public Worker(String name, int age, String gender, String address, int level){
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel(){
        return level;
    }
}
