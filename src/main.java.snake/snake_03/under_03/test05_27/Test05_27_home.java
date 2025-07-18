//package snake_01.src.main.java.snake.snake_03.under_03.test05_27;
public class Test05_27_home
{
  public static void main( String[] args )
  {
    Calc27 calc = new Calc27( "Poly-morphism" );

// コンストラクタで生成
    Item27 item = new Item27( "掛け算", "税込み価格", 980, 1.1, calc );
      // コンストラクタの内容を表示
      item.indi( "const :" + item.toString() );
      item.display();


// setter にて生成
      item.setId( "足し算" );
      item.setName( "合計" );
      item.setPrice( 12.980 );
      // 小数点以下が何桁かと○乗は同じ( 5桁なので10 の5乗 )
      item.setTax( 481.13384 );// 4.8113384(E7)<-10^7 整数分2桁増える
      item.calc( calc );

      // setter の内容を表示
      item.indi( "setter :" + item.toString() );
      item.sam();


/*
重複するコンストラクタを使用しチェーンメソッドで記述する場合には、インスタンスを( )で囲んで引数無しのコンストラクタを記述するとコンパイル出来る様になる 括弧は無くてもOKでした
*/
    Item27 tochu = new Item27()
          .id( "引き算" )
          .name( "引き算の結果" )
          .price( 980.23 )
          .tax( 781.13 )
          .calc( calc );
 //       .save();

      // tochu の内容を表示  コンストラクタ無しの変数を呼ぶ
      item.indi( "tochu :" + tochu.toString() );
      tochu.clacMinus();


    Item27.save( itemChain -> {
      itemChain.id( "掛け算" )
               .name( "税込み価格" )
               .price( 980 )
               .tax( 1.1 )
               .calc( calc );

     });



    System.out.println( "Hello World_1" );
    System.out.println( "Hello World_2" );
  }
}
