abstract class PatternPrinter {
    abstract void printPattern(int n);
  
    void displayTitle(String title) {
        System.out.println("" + title);
        System.out.println("");
    }
  }
  
  class StarPattern extends PatternPrinter {
    void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
  }
  
  class NumberPattern extends PatternPrinter {
    void printPattern(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
  }
  
  class week7q3 {
    public static void main(String[] args) {
      System.out.println("NAME:P SAI LIKHITH , ROLL NO:24306,SEC:CSE-A ");
        int rows = 5;
  
        StarPattern star = new StarPattern();
        star.displayTitle("Star Pattern");
        star.printPattern(rows);
  
        NumberPattern number = new NumberPattern();
        number.displayTitle("Number Pattern");
        number.printPattern(rows);
    }
  }
  