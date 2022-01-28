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
    public List<E> concatenating(List<String> list, List<Integer> num){

        return null;
    }


    //todo method that create course that object

    public static void main(String[] args) {

        firstHashSet myHashTag = new firstHashSet();
        List<String> list = Arrays.asList("Dean","Zaineh","Yasmeen","Dave");

        System.out.println(myHashTag.removeDuplicate(list));
        System.out.println(myHashTag.countNotRepeatedValue(list));
    }
}
