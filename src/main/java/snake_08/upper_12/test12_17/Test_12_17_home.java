package main.java.snake_08.upper_12.test12_17;

public class Test_12_17_home
{
  public static void main( String[] args )
  {
    Item17.save( item -> {
      item.id( "掛け算" )
          .name( "税込み価格" )
          .price( 980 )
          .tax( 1.1 );

      System.out.println( "計算式   :" + item.getId() );

      item.display();
    });

    System.out.println( "Hello World_1" );
    System.out.println( "Hello World_2" );
  }
}
