# Калькулятор
## Описание
Программа реализует расчеты с использованием FunctionalInterface и Lambda
1. Создан класс Calculator со статической переменной типа Supplier.

```static Supplier<Calculator> instance = Calculator::new;```

В классе Calculator добавлены:
* переменные типа BinaryOperator для математических операций над двумя числами. Типизируем их как Integer:

```
BinaryOperator<Integer> plus = (x, y) -> x + y;
BinaryOperator<Integer> minus = (x, y) -> x - y;
BinaryOperator<Integer> multiply = (x, y) -> x * y;
BinaryOperator<Integer> devide = (x, y) -> x / y;
```
* переменные типа UnaryOperator для произведения математических операций над одним числом:

```
UnaryOperator<Integer> pow = x -> x * x;
UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
```

* переменная типа Predicate для определения положительное ли число:

```
Predicate<Integer> isPositive = x -> x > 0;
```
* переменная типа Consumer для вывода числа в консоль.:

```
Consumer<Integer> println = System.out::println;
```

2. main()
   Создаем экземпляр Calculator и производим вычисления
```
Calculator calc = Calculator.instance.get();
int a = calc.plus.apply(1, 2);
int b = calc.minus.apply(10,4);
int c = calc.divide.apply(a, b);
calc.println.accept(c);
int x = calc.pow.apply(a);
int y = calc.abs.apply(b);
boolean count = calc.isPositive.test(b);
```