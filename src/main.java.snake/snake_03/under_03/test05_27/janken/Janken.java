/*
2025/07/02 引数無しのコンストラクタを記述したがコンパイル出来ず 

サブクラスである
Playerクラスのコンストラクタで
引数なしのスーパークラスのコンストラクタが呼び出されますが
スーパークラスであるPersonクラスでは
引数ありのコンストラクタしかありませんので
引数なしのコンストラクタをオーバーロードしておく必要があります。

または
Playerクラスのコンストラクタから
super("AAA");
のように文字列を渡すことで回避できると思います。
*/

import java.util.Scanner;

abstract class Person
{
  private String name;


// 引数無しのコンストラクタを記述 2025/07/02
  Person(){

   }

  Person(String name){
    this.name = name;
  }

  String getName(){
    return this.name;
  }
}


interface HasJanken{
  int STONE= 1; // グー
  int SCISSORS = 2; // チョキ
  int PAPER = 3; // パー
}


class Player extends Person implements HasJanken{
  private int wincount; // 勝ち数

  Player(int wincount){
    this.wincount = 0;
  }

  public int inputNumber(Scanner sc) {
    int number;
    System.out.println("1(グー),2(チョキ),3(パー)のいずれかの整数値を半角入力>");
    number = sc.nextInt();
    System.out.println("入力値=" + number);
    if(number == 1 || number == 2 || number == 3){
      return number;
    }
// Missing return statement と言うエラーが出て下記を追記でコンパイル成功したが正常に作動（じゃんけん）出来ず 1,2,3, 以外の可能性有
    return 0;   // これを追加で記述
  }

  void addWincount(){
    this.wincount++;
  }

  int getWincount(){
    return this.wincount;
  }
}

public class Janken
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Player p1 = new Player( sc.nextInt() );
      System.out.println("プレイヤー1は" + p1.getName() );

      p1.inputNumber(sc);
      sc.close();
  }
}
