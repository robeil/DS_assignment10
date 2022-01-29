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
        return " Course " + cName ;
    }


    //todo method that concatenating course object with id
    public Map<String, Course> idCourse(List<Course> courseList){

        Map<String, Course> mapCourse = new HashMap<>();

        for(int i = 0; i < courseList.size(); i++){
            mapCourse.put(courseList.get(i).cID, courseList.get(i));

        }
    return mapCourse;
    }

//    public static void main(String[] args) {
//
//        Course c1 = new Course("CS221","Ds",4);
//        Course c2 = new Course("CS105","Ds",4);
//        Course c3 = new Course("CS203","Ds",4);
//        Course c4 = new Course("CS201","Ds",4);
//
//        List<Course> courseList = new ArrayList<>();
//
//        courseList.add(c1);
//        courseList.add(c2);
//        courseList.add(c3);
//        courseList.add(c4);
//
//        System.out.println( idCourse(courseList));
//    }
}
