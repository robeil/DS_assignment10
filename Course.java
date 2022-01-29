package DS_assignment10;

import java.util.ArrayList;
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
        return " Course " + cName ;
    }


    //todo method that concatenating course object with id
    public Map<String, Course> idCourse(List<Course> courseList){

        Map<String, Course> mapCourse = new HashMap<>();
        List<String> courseId = new ArrayList<>();

        //todo adding the name of the course to list
        for(int i = 0; i < courseList.size(); i++) {
            courseId.add(courseList.get(i).cID);
        }
        //todo maping the course
        for(int i =  0; i < courseList.size(); i++){
            mapCourse.put(courseId.get(i), courseList.get(i));
        }

    return mapCourse;
    }

}
