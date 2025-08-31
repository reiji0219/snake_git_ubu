package main.java.snake_07.under_07.test07_03;

import demo_06.Interface;
public class Calc03 extends Item03
{
  private String name;

  public Calc03( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc03 calc = new Calc03( "Poly-morphism" );

      Item03.save( item -> {
        item.id( "掛け算" )
            .name( "税込み価格" )
            .price( 980 )
            .tax( 1.1 )
            .calc( calc );

        System.out.println( "表示内容 :" + item.getId() );

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
