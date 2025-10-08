package main.java.snake_07.under_07.test06_30;

public class Test_06_30_home
{
  public static void main( String[] args )
  {
    Item30.save( item -> {
      item.id( "掛け算" )
          .name( "税込み価格" )
          .price( 980 )
          .tax( 1.1 );

    });

    System.out.println( "Hello World_1" );
    System.out.println( "Hello World_2" );
    System.out.println( "Hello World_3" );
  }
}
