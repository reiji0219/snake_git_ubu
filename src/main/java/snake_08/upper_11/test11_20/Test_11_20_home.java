package main.java.snake_08.upper_11.test11_20;

public class Test_11_20_home
{
  public static void main( String[] args )
  {
    Calc20 calc = new Calc20( "Poly-morphism" );

    Item20.save( item -> {
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
