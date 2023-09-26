public class Challenge {
  public static void main(String[] args) {
  
    int a =1, b = 2, c = 3;
    
    // AND operator: result is 0
    if (a < b && b < c) {
        System.out.println(0);
    }
    
    // FOR and OR operator: result is 1, 2, 4, 5
    for (int i = 1; i <= 5; i++) {
      if (i <= 2 || i >= 4) {
        System.out.println(i);
      }
    }

    // ELSE part: result is 6
    if (a + b + c == 5) {  
      System.out.println(5);
    } else {
      System.out.println(6);
    }
 
    // floating-point arithmetic: result is 70.52
    double celsius = 21.4;
    double fahrenheit = celsius * 9.0 / 5.0 + 32;
    System.out.println(fahrenheit);
  }
}
