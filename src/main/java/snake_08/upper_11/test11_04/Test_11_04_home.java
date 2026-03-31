package main.java.snake_08.upper_11.test11_04;

public class Test_11_04_home
{
  public static void main( String[] args )
  {
    Item04.save( item -> {
      item.id( "掛け算" )
          .name( "税込み価格" )
          .price( 980 )
          .tax( 1.1 );

    });

      System.out.println("Hello World_1");
      System.out.println("Hello World_2");
      System.out.println("Hello World_3");
   }
}
