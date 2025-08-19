package main.java.snake_07.under_07.test06_09;

import demo_06.Interface;

public class Calc09 extends Item09
{
  private String name;

  public Calc09( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc09 calc = new Calc09( "Poly-morphism" );

      Item09.save( item -> {
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
    indi( "Lambda" );

    inter.execute();

    indi( "end" );
  }
}
