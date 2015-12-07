package stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gary Lo on 7/12/2015.
 */
public class StreamExample {

  public List<Integer> filterEvenNumber(List<Integer> list){

    List<Integer> tmp = new ArrayList<>();

    for(Integer x : list){
      if(x % 2 == 0){
        tmp.add(x);
      }
    }

    return tmp;
  }

  public List<Integer> multipleTwo(List<Integer> list){

    List<Integer> tmp = new ArrayList<>();

    for(Integer x : list){
      tmp.add(x *x);
    }

    return tmp;
  }


}
