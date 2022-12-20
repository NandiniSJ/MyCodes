package ListExamples;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {

   private Integer id ;
    private String name;

    public ListToMap(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args){
        List<ListToMap> list = new ArrayList<ListToMap>();
        ListToMap student1 = new ListToMap(1,"nandini");
        ListToMap student2 = new ListToMap(2,"shilu");
        ListToMap student3 = new ListToMap(3,"rubby");

        list.add(student1);
        list.add(student2);
        list.add(student3);

        Map<Integer,String> newMap = new HashMap<>();


        for(int i=0; i< list.size(); i++){
            final ListToMap student = list.get(i);
            newMap.put(student.getId(),student.getName());
        }
//       for(ListToMap stu : list){
//            newMap.put(stu.getId(),stu.getName());
//        }

        System.out.println(newMap);

    }

}
