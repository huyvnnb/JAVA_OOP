public class Staff extends Officer {
    private String task;

    public Staff(String name, int age, String gender, String address, String work){
        super(name, age, gender, address);
        this.task = work;
    }

    public String getTask(){
        return task;
    }

    @Override
    public String toString(){
        String res = "Name: " + name +
                    "\tAge: " + age +
                    "\tGender: " + gender +
                    "\tAddress: " + address +
                    "\tTask: " + task;
        return res;
    }
}
