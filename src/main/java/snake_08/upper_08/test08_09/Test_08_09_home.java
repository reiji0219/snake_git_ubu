package main.java.snake_08.upper_08.test08_09;

import demo_06.Interface;

public class Test_08_09_home
{
  public static void main( String[] args )
  {
    Calc09 calc = new Calc09( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc09.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}
