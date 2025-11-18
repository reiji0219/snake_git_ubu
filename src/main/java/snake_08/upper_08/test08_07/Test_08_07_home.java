package main.java.snake_08.upper_08.test08_07;

public class Test_08_07_home
{
  public static void main( String[] args )
  {
    Item07.save( item -> {
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
