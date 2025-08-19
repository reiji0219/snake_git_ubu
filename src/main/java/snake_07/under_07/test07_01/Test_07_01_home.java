package main.java.snake_07.under_07.test07_01;

public class Test_07_01_home
{
  public static void main( String[] args )
  {
    Calc01 calc = new Calc01( "Poly-morohism" );

    Item01.save( item -> {
     item.id( "掛け算" )
         .name( "税込み価格" )
         .price( 980 )
         .tax( 1.1 )
         .calc( calc );

      System.out.println( "計算式 :" + item.getId() );

      item.display();
    });

    System.out.println( "Hello World_1" );
    System.out.println( "Hello World_2" );
  }
}
