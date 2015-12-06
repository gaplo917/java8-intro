package lambda;

import java.util.function.*;

/**
 * Created by Gaplo917 on 6/12/2015.
 *
 * Lambda Expression syntax should like this
 *
 * (arg1, arg2, ... ) -> { body }
 *
 * OR
 *
 * (type1 arg1, type2 arg2) -> { body }
 *
 *
 */
public class LambdaSyntaxExample {

  // with parenthesis
  Consumer<Integer> c2 = (x) -> { /*consume sth*/ };

  // if only one argument, without paraenthesis is also okay
  Consumer<Integer> c1 = x -> { /*consume sth*/ };

  // Two argument
  BiConsumer<Integer,Integer> bc1 = (x,y) -> { /*consume sth*/ };

  // predicate (boolean-valued function) of one argument
  Predicate<Integer> p = a -> a == 0;

  // predicate (boolean-valued function) of two argument
  BiPredicate<Integer,Integer> bp = (a,b) -> a.equals(b);

  // supply sth without argument
  Supplier<Integer> s = () -> 0;

  // Integer (argument type), Double (Return type)
  Function<Integer,Double> f = x -> x.doubleValue();

  // Integer (arg1, x) ,Integer (arg2, y), Double(Return type)
  BiFunction<Integer,Integer,Double> g = (x,y) -> x / y.doubleValue();


  // Method Reference
  BiPredicate<Integer,Integer> bpMethodRef = Integer::equals;

  Function<Integer,Double> fMethodRef = Integer::doubleValue;

}
