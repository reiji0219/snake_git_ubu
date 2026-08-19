package main.java.snake_08.upper_12.test12_11;

public class Test_12_11_home
{
  public static void main( String[] args )
  {
    Calc11 calc = new Calc11( "Poly-morphism" );

    Item11.save( item -> {
      item.id( "掛け算" )
          .name( "税込み価格" )
          .price( 980 )
          .tax( 1.1 )
          .calc( calc );

      System.out.println( "掛け算   :" + item.getId() );

      item.display();
    });

    System.out.println( "Hello World_1" );
    System.out.println( "Hello World_2" );
  }
}
