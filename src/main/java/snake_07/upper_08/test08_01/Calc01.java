package main.java.snake_07.upper_08.test08_01;

import demo_06.Interface;

public class Calc01 extends Item01
{
  private String name;

  public Calc01( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc01 calc = new Calc01( "Poly-morphism" );

      Item01.save( item -> {
        item.id( "掛け算" )
            .name( "税込み価格" )
            .price( 980 )
            .tax( 1.1 )
            .calc( calc );

        System.out.println( "計算式 :" + item.getId() );
        item.display();
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
