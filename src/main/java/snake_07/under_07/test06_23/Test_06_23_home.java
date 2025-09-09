package main.java.snake_07.under_07.test06_23;

import demo_06.Interface;

public class Test_06_23_home
{
  public static void main( String[] args )
  {
    Calc23 calc = new Calc23( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc23.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}
