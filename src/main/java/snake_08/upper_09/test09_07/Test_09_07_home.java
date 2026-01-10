package main.java.snake_08.upper_09.test09_07;

public class Test_09_07_home
{
  public static void main( String[] args )
  {
    Calc07 calc = new Calc07( "Poly-morphism" );

    Item07.save( item -> {
      item.id( "掛け算" )
          .name( "税込み価格" )
          .price( 980 )
          .tax( 1.1 )
          .calc( calc );

      System.out.println( "計算式   :" + item.getId() );

      item.display();

      item.execute();
    });

    System.out.println( "Hello World_1" );
    System.out.println( "Hello World_2" );
  }
}
