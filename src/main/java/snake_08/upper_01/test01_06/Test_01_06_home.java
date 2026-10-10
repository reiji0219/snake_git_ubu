package main.java.snake_08.upper_01.test01_06;

public class Test_01_06_home
{
  public static void main( String[] args )
  {
    Calc06 calc = new Calc06( "Poly-morphism" );

    Item06.save( item -> {
      item.id( "掛け算" )
          .name( "税込み価格" )
          .price( 980 )
          .tax( 1.1 )
          .calc( calc );

      System.out.println( "計算式   :" + item.getId() );

      item.display();
    });

    System.out.println( "Hello World_1" );
    System.out.println( "Hello World_2" );
  }
}
