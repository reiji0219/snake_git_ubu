package main.java.snake_07.under_07.test06_20;

import demo_06.Interface;

public class Test_06_20_home
{
  public static void main( String[] args )
  {
    Calc20 calc = new Calc20( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc20.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}
