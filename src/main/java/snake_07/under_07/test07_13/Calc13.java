package main.java.snake_07.under_07.test07_13;

import demo_06.Interface;

public class Calc13 extends Item13
{
  private String name;

  public Calc13( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc13 calc = new Calc13( "Poly-morphism" );

      Item13.save( item -> {
        item.id( "掛け算" )
            .name( "税込み価格" )
            .price( 980 )
            .tax( 1.1 )
            .calc( calc );

        System.out.println( "計算式 :" + item.getId() );

        item.display();

        item.execute();
      });
    };
  }

  public void display(){
    indi( name );
  }

  public void process( Interface inter ){
    indi( "start" );

    inter.execute();

    indi( "end" );
  }
}
