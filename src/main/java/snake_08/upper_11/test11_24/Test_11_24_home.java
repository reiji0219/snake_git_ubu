package main.java.snake_08.upper_11.test11_24;

public class Test_11_24_home
{
  public static void main( String[] args )
  {
    Calc24 calc = new Calc24( "poly-morphism" );

    Item24.save( item -> {
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
