package main.java.snake_08.upper_12.test12_09;

public class Test_12_09_home
{
  public static void main( String[] args )
  {
    Calc09 calc = new Calc09( "Poly-morphismjr" );

    Item09.save( item -> {
      item.id( "掛け算" )
          .name( "税込み価格" )
          .price( 980 )
          .tax( 1.1 )
          .calc( calc );

      System.out.println( "計算式   :" + item.getId() );

      item.display();
    });

    System.out.println( "Hello World_1" );
  }
}
