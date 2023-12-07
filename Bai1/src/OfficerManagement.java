import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class OfficerManagement {
    List<Officer> officers;

    public OfficerManagement(){
        this.officers = new ArrayList<>();
    }
    public void addOfficer(Officer officer){
        this.officers.add(officer);
    }

    public List<Officer> findOfficerByName(String name){
        return this.officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
//        boolean canFind = false;
//        Officer officer = null;
//        for (Officer value : officers) {
//            if (value.name.contains(names)) {
//                canFind = true;
//                officer = value;
//                break;
//            }
//        }
//        if(!canFind){
//            System.out.println("Cannot find!");
//            //return null;
//        }
//        return officer;
    }

    public void showOfficerInfo(){
        for(Officer officer : officers){
            System.out.println(officer.toString());
        }
    }
}
