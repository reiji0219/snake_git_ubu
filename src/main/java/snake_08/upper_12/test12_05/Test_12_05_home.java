package main.java.snake_08.upper_12.test12_05;

public class Test_12_05_home
{
  public static void main( String[] args )
  {
    Calc05 calc = new Calc05( "Poly-morphism" );

    Item05.save( item -> {
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
