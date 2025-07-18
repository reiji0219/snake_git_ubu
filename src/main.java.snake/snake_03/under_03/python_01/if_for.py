# for文の書き方

# for 変数 in 繰り返しオブジェクト:
#     繰り返したい処理
scores = [90, 30, 49]

for x in scores:
    print(x)


# for文の繰り返しオブジェクトに辞書を指定する方法
#   key value の値を割り当てる変数をそれぞれ1つずつ用意
#   .item() を付けた辞書を in の後ろに指定

# for 変数1, 変数2 in 辞書.items():   keyが変数1にvalueが変数2
#    繰り返したい処理

fruits = {"apple": 130,"banana": 350, "lemon": 100}

for name, price in fruits.items():
    print( name )


# range とfor文

# range とは連続した整数を取り出す事が出来るもの
#   0 から順番に１ずつ大きくなり指定した整数で終了する値

# for 変数 in range( 整数 ):
#    繰り返したい処理
for x in range(5):    # 0～4 が表示される
    print(x)

for num in range( 1, 6 ):
    print( num )      # 1～5 が表示される 



# if文の書き方
# else if が elif に省略  ブロックなので : セミコロン
# 最後に else を使う

# if 条件式:
#    条件式がTrueの時の処理

age = 20

if age >= 20:
    print( "成人です" )
elif age >= 18:
    print( "成人ですが飲酒は出来ません" )
elif age >= 6:
    print( "子供です" )
else:
    print( "乳児・幼児です" )













