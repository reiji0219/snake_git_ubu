# 辞書とは？   訳: dictionary

# key とvalue を１つのペアとしてそのペアを複数持つことができる物
scores = {"数学": 82,   # scores は、辞書型の変数。 波括弧で記述
          "国語": 74,   # key が"国語"  value が 74
          "英語": 60,   #
          "理科": 92,   # sience サイエンス
          "社会": 70}   #


# keyを指定してvalueの値を取得
# x = 辞書[key]           # 角括弧
# x = 辞書.get(key)       # 丸括弧
sience = scores["理科"]   # key が"理科"  value が 92 を取得
sience = scores.get("理科")


# 辞書に新しい要素を追加
# 辞書[key] = value     # "体育"が追加される
scores["体育"] = 88
print( scores )


# 要素の値(value)を変更
# 辞書[key] = 新しい値  # 88 が 77 に変更
scores["体育"] = 77
print( scores )


# 同じkeyの要素を複数持つことは出来ない
prices = {"いちご": 540, "バナナ": 350, "いちご": 490}   #
print( prices )         # 最後の"いちご"のvalue = 490 が表示


# 辞書の要素数を取得
# len( 辞書 )           # リストと同じ
x = len( prices )       # 要素数は２
x = len( scores )       # 要素数は６


# 辞書のkeyの値だけを取り出す
# 辞書.keys()
fruits = prices.keys( )
print(fruits)              # (x) は dict_keys型

fruits = list( prices.keys() )
print(fruits)              # list( )で囲むと辞書のkeyの値だけを抽出して                          更に、それをリスト型に型変換ができる


# 辞書のvalueの値だけを取り出す
# 辞書.values()
x = prices.values( )
print(x)              # (x) は dict_keys型

x = list( prices.values() )
print(x)              # list( )で囲むと辞書のkeyの値だけを抽出して                          更に、それをリスト型に型変換ができる


# 空の辞書
x = {}
x = dict()          # dictionary の省略が dict


# 練習問題 1   理科と社会の点数差を表示するプログラム
scores = {"数学": 82,   # scores は、辞書型の変数。 波括弧で記述
          "国語": 74,   # key が"国語"  value が 74
          "英語": 60,   #
          "理科": 92,   # sience サイエンス
          "社会": 70}   #

diff = scores["理科"] - scores["社会"]
print( f"{diff}点")


# 元のファイル（左）にのみ存在する内容の抜き出し操作などに便利
diff -y befor.txt after.txt | grep '<' | cut -f 1


# 練習問題 2   全教科の平均点を表示するプログラム
socres_values = list( scores.values() )  # dict -> list に変換
avg_score = sum( socres_values )  / len( socres_values )
print( f"{avg_score}点")











