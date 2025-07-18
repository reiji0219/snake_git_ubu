package snake_01.src.main.java.snake.snake_03.under_03.test06_19;

import snake_01.src.demo_06.Interface;

public class Test_06_19_home
{
  public static void main( String[] args )
  {
    Item19 item = new Item19( "掛け算", "税込み価格", 980, 1.1 );

      item.indi( "const :" + item.toString() );


      item.setId( "掛け算" );
      item.setName( "税込み価格" );
      item.setPrice( 980 );
      item.setTax( 1.1 );

      item.indi( "setter :" + item.toString() );


    Item19.save( chain -> {
      chain.id( "掛け算" )
          .name( "税込み価格" )
          .price( 980 )
          .tax( 1.1 );

      item.indi( "chain :" + item.toString() );

      System.out.println( "計算式 :" + item.getId() );

      item.display();
    });

    System.out.println( "Hello World_1" );
    System.out.println( "Hello World_2" );
  }
}
