import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class OfficerManagement {

    ArrayList<Officer> officers = new ArrayList<>();
    public void addOfficer(Officer officer){
        officers.add(officer);
    }

    public Officer findName(String names){
        boolean canFind = false;
        Officer officer = null;
        for (Officer value : officers) {
            if (value.name.contains(names)) {
                canFind = true;
                officer = value;
                break;
            }
        }
        if(!canFind){
            System.out.println("Cannot find!");
            //return null;
        }
        return officer;
    }

    public void printInfo(Officer value){
        System.out.println("Name: " + value.getName() +
                "\tAge: " + value.getAge() +
                "\tGender: " + value.getGender() +
                "\tAddress: " + value.getAddress());
    }

    public void printAllInfo(){
        for(Officer value : officers){
            printInfo(value);
        }
    }
}
