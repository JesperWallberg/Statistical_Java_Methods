# Statistical_Java_Methods

Methods used to calculate mathematical statistical values.

# Code snippets 

## Factorial

```java
public static double factorial(double a){
  double answer = 1;
  for(double i = a; i > 0; i--){
    answer *= i;
  }
  return answer;
}
```

## Combinations (nCr)

```java
public static double nCr(double a, double b){
  return factorial(a) / (factorial(b) * factorial(a - b));
}
```

## Permutations (nPr)

```java
public static double nPr(double a, double b){
  return factorial(a) / factorial(a - b);
}
```
