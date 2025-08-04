public class Test_07_28_home
{
  public static void main( String[] args )
  {
    Calc28 calc = new Calc28( "Poly-morphism" );

    Item28.save( item -> {
     item.id( "掛け算" )
         .name( "税込み価格" )
         .price( 980 )
         .tax( 1.1 )
         .calc( calc );

      System.out.println( "計算式 :" + item.getId() );

      item.display();
    });

    System.out.println( "Hello World_1" );
    System.out.println( "Hello World_2" );
  }
}
