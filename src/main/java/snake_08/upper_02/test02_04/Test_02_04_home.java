package main.java.snake_08.upper_02.test02_04;

public class Test_02_04_home
{
  public static void main( String[] args )
  {
    Item04.save( item -> {
      item.id( "掛け算" )
          .name( "税込み価格" )
          .price( 980 )
          .tax( 1.1 );

      System.out.println( "掛け算   :" + item.getId() );

      item.getId();
    });

    System.out.println( "Hello World_1" );
    System.out.println( "Hello World_2" );
  }
}
