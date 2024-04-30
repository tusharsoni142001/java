package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    

    public static void main(String[] args) {

        //Methos to create stream
        // 1 - using empty() method
        Stream <Object> streamObject=Stream.empty();
        streamObject.forEach(e->{
            System.out.println(e);
        });

        //2 Using arrays, objects, collection
        // using of() method

        String names[]={"Tushar","Abhishek","Puja","Vaishnavi"};

        Stream<String> stream1 = Stream.of(names);  //We can directly pass array values as well
        stream1.forEach(e->{
            System.out.println(e);
        });
    
        // 3 using builder() method
        //Using builder pattern
         Stream<Object> stream2=Stream.builder().build();

        //4 
        IntStream stream3=Arrays.stream(new int[]{1,32,41,5,63,342});
        List<Integer> l=new ArrayList<>();

        
        l=stream3.filter(i->i%2==1).boxed().collect(Collectors.toList());
        for(Integer i:l)
        {
            System.out.println(i);
        }


         
    }
}
