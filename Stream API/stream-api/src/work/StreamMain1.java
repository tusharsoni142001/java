package work;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String args[])
    {
        List<Integer> list1=List.of(1,2,3,4,5);

        List<Integer> list2=new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);

        List<Integer> list3=Arrays.asList(100,200,300,400,500);

        //Without stream
        List<Integer> listEven=new ArrayList<>();
        for(Integer i:list1)
        {
            if(i%2==0)
            {
                listEven.add(i);
            }
        }

        System.out.println("List 1:"+list1);
        System.out.println("List even:"+listEven);

        //Using stream API
        Stream<Integer> stream=list1.stream();
        // List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());
        // System.out.println(newList);

        List<Integer> newList=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList2=list2.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
