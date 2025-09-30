package main.java.snake_07.under_07.test07_13;

import demo_06.Interface;

public class Test_07_13_home
{
  public static void main( String[] args )
  {
    Calc13 calc = new Calc13( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc13.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}
