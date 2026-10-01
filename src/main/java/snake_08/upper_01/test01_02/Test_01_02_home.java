package main.java.snake_08.upper_01.test01_02;

public class Test_01_02_home
{
  public static void main( String[] args )
  {
    Calc02 calc = new Calc02( "Poly-morphism" );

    Item02.save( item -> {
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
