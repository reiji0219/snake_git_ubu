 package main.java.snake_07.under_07.test06_04;

import demo_06.Interface;

public class Calc04 extends Item04
{
  private String name;

  public Calc04( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc04 calc = new Calc04( "Poly-morphism" );

      Item04.save( item -> {
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
