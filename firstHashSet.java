package DS_assignment10;

import java.util.*;

public class firstHashSet<E> {

    //todo removeDuplicates method that remove the duplicates
    public List<E> removeDuplicate(List<E> list){

        List<E> myArrayList = new ArrayList<>();
        Set<E> nameList = new HashSet<>();

        //todo for loop that traverse through the given list
        for(int i = 0; i < list.size(); i++){
            nameList.add(list.get(i));
        }
        //todo iterator that traverse
        Iterator<E> iter = nameList.iterator();
        while(iter.hasNext()){
            myArrayList.add(iter.next());
        }
        return myArrayList;
    }

    //todo count the distinct value
    public int countNotRepeatedValue(List<String> list){
        ///todo hashSet to store the unique value
        Set<String> seList = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            seList.add(list.get(i));
        }
        //iterator to traverse through whole list
        Iterator<String> setString = seList.iterator();
        int count = 0;
        while (setString.hasNext()){
             setString.next();
             count++;
        }
        return count;
    }

    //todo concatenating two array list in one
    public Map<String,Integer> concatenating(List<String> nameList, List<Integer> numList){

        Map<String,Integer> concat = new HashMap<>();

        for(int i = 0; i < nameList.size(); i++){
            concat.put(nameList.get(i),numList.get(i));
        }

        return concat;
    }

    public static void main(String[] args) {

        firstHashSet myHashTag = new firstHashSet();
        List<String> list = Arrays.asList("Dean","Zaineh","Yasmeen","Dave");
        List<String> nameList = Arrays.asList("Dean","Dave","Zaineh");
        List<Integer> numList = Arrays.asList(90,80,94);


        System.out.println(myHashTag.removeDuplicate(list));
        System.out.println(myHashTag.countNotRepeatedValue(list));
        System.out.println(myHashTag.concatenating(nameList, numList));

        //todo 4th Question
        Course first = new Course();
        Course c1 = new Course("CS221","Data Structure ",4);
        Course c2 = new Course("CS105","Problem Solving ",4);
        Course c3 = new Course("CS203","Object Oriented",4);
        Course c4 = new Course("CS201","Procedural Programming",4);


        List<Course> courseList = new ArrayList<>();

        courseList.add(c1);
        courseList.add(c2);
        courseList.add(c3);
        courseList.add(c4);

        System.out.println( first.idCourse(courseList));
    }
}
