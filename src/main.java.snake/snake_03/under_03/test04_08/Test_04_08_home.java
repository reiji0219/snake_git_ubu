package snake_01.src.main.java.snake.snake_03.under_03.test04_08;

import snake_01.src.demo_06.Interface;

public class Test_04_08_home
{
  public static void main( String[] args )
  {
    Calc08 calc = new Calc08( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc08.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}
