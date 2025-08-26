package main.java.snake_07.under_07.test06_12;

import demo_06.Interface;

public class Calc12 extends Item12
{
  private String name;

  public Calc12( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc12 calc = new Calc12( "Poly-morphism" );

      Item12.save( item -> {
        item.id( "掛け算" )
            .name( "税込み価格" )
            .price( 980 )
            .tax( 1.1 )
            .calc( calc );

        System.out.println( "計算式" + item.getId() );

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
