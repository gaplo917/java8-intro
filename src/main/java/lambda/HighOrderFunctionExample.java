package lambda;

import java.util.function.Function;

/**
 * Created by Gaplo917 on 6/12/2015.
 */
public class HighOrderFunctionExample {

  public static Function<Integer,Integer> f = (x) -> x + 1;
  public static Function<Integer,Integer> g = (x) -> x * x;
  public static Function<Integer,Integer> h = (x) -> x * 2;
  public static Function<Integer,Double> toDouble = Integer::doubleValue;

  public static Function<Integer,Integer> func = h.compose(g).compose(f);
  public static Function<Integer,Double> funcThenToDouble = func.andThen(toDouble);

}
