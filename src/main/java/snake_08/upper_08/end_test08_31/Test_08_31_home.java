package main.java.snake_08.upper_08.test08_31;

import demo_06.Interface;

public class Test_08_31_home
{
  public static void main( String[] args )
  {
    Calc31 calc = new Calc31( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc31.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}
