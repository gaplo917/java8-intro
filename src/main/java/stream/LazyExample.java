package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Gary Lo on 7/12/2015.
 * Imperative style of coding in Java 8 with Stream
 * Refactor the imperative style to functional style
 */
public class LazyExample {

  public void run(){
    List<Integer> list = Arrays.asList(1,2,3,4);

    Stream<Integer> rawStream = list
                                  .stream()
                                  .peek(x -> System.out.println("iterating " + x));

    Stream<Integer> stream = multipleTwo(filterEvenNumber(rawStream));

    stream.forEach(System.out::println);
  }

  Predicate<Integer> evenFilter = x -> x % 2 == 0;
  Function<Integer,Integer> mult2 = x -> x * x ;

  public void functionalStyleRun(){
    List<Integer> list = Arrays.asList(1,2,3,4);
    list
      .stream()
      .filter(evenFilter)
      .map(mult2)
      .forEach(System.out::println);
  }

  public Stream<Integer> filterEvenNumber(Stream<Integer> list){
    return list.filter(x -> x % 2 == 0);
  }

  public Stream<Integer> multipleTwo(Stream<Integer> list){
    return list.map(x -> x * x);
  }

}
