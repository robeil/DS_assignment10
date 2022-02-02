package DS_assignment10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {

    private String cID;
    private String cName;
    private int creditHours;

    public Course(){

    }
    public Course(String cID, String cName, int creditHours){
        this.cID = cID;
        this.cName =cName;
        this.creditHours = creditHours;
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
        return "[ "+cID + '\''+" , " + cName + '\''+" ]";
    }


    //todo method that concatenating course object with id
    public Map<String, String> idCourse(List<Course> courseList){

        Map<String, String> mapCourse = new HashMap<>();
       for(int i = 0; i < courseList.size(); i++){
           mapCourse.put(courseList.get(i).cID, courseList.get(i).cName);
       }

    return mapCourse;
    }

}
