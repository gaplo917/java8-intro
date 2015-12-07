package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Gary Lo on 7/12/2015.
 * Imperative style coding in  Java 7
 */
public class NonLazyExample {

  public void run(){
    List<Integer> list = Arrays.asList(1,2,3,4);
    multipleTwo(filterEvenNumber(list)).forEach(System.out::println);
  }

  public List<Integer> filterEvenNumber(List<Integer> list){

    List<Integer> tmp = new ArrayList<>();

    for(Integer x : list){
      System.out.println("iterating " + x);
      if(x % 2 == 0){
        tmp.add(x);
      }
    }
    return tmp;
  }

  public List<Integer> multipleTwo(List<Integer> list){
    List<Integer> tmp = new ArrayList<>();

    for(Integer x : list){
      System.out.println("iterating " + x);
      tmp.add(x *x);
    }

    return tmp;
  }
}
