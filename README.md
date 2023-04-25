# Statistical_Java_Methods

Methods used to calculate mathematical statistical values.

# Usage

1. Add Stat.java to your project.
2. Use the methods with ```Stat.methodName()```

## Example

### Factorial of 5 (5!)

```java
System.out.println(Stat.factorial(5));
```

```output
>> 120
```

# Supported methods 

### Factorial (n!)

 ```Stat.factorial(n)```

### Combinations (nCr)

 ```Stat.nCr(n, r)```
 
 ### Permutations (nPr)

 ```Stat.nPr(n, r)```
 
 ### Binomnial distribution 

 ```Stat.binominalDist(k, n, p)```
 
 ### Hypergeometric distribution

 ```Stat.hyperDist(k, N, n, p)```
 
 ### Poisson distribution

 ```Stat.PoissonDist(k, u)```


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
