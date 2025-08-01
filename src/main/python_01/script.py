
print( "こんにちは" )   # ここはコメントです
print( "かきくけこ" )


apple_price = 150       # 整数型のデータ
apple_price = "150円"   # 整数型から文字列型のデータに代わる
print( apple_price )

apple_price = 200       # apple_priceの値段が150から200に変更
print( apple_price )


x = 10
y = 100
z = x + y               # 足し算　110

x = y                   # ｘにｙが代入されるので100になる
print( x )

x = '10'
y = '100'
z = x + y               # 文字列結合して '10010' と表示される


apple_price = 100       # 整数型のデータ
name = '斎藤'           # 文字列型
weight = 54.3           # 浮動小数点型
print( apple_price, name, weight )


# 変数の型を調べる方法
x = 100
x_type = type( x )      # type コマンドをしようする
print( x_type )         # 'int' (整数型) と表示される


# 型を変換する
#  int( 値・変数 )      # int 型に変換
#  str( 値・変数 )      # string 型に変換
#float( 値・変数 )      # float 型に変換

x = "10"                # x は文字列型に代入
y = int( x )            # y は整数型に変換される


# 3教科の平均を演算する
math = 82
japanese = 74
english = 60
avg_score = ( math + japanese + english ) / 3
print( avg_score )


# f-string( 変数の埋め込み)
price = 1000
text = f"この商品は{price}円です" # f"○○○{price} ○○○"
print( text )                    # + で繋げないで変数を埋め込める


