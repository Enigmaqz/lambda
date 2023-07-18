public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    //BinaryOperator<Integer> devide = (x, y) -> x / y;
    //нет проверки деления на ноль, и поэтому может вываливаться с ошибкой
    //добавим тернарный оператор и если знаменатель 0, то просто будем считать результат равным 0

    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
