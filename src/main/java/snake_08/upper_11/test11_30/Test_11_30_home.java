package main.java.snake_08.upper_11.test11_30;

public class Test_11_30_home
{
  public static void main( String[] args )
  {
    Calc30 calc = new Calc30( "Poly-morphism" );

    Item30.save( item -> {
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
