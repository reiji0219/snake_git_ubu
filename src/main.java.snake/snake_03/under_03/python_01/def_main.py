# クラスの書き方

class def_main:   #__init__ イニシャライズ 初期化( self, )
    def __init__(self, name, mail_address, point):
        self.name = name
        self.mail_address = mail_address
        self.point = point

# 自作メソッドでポイントを付与
    def add_point(self, point):
        self.point += point

user_1 = def_main( "佐藤葵", "sato@example.com", 500)
user_2 = def_main( "小林ゆい", "kobayashi@example.com", 1000)

x = user_1.name
y = user_2.name
print( x )      # user_1の名前 = 佐藤葵が表示される
print( y )      # user_2の名前 = 小林ゆいが表示される


user_1.add_point( 100 )   # ユーザー1のポイントを加算
# 不変的な設定( コンストラクタ)が簡単に変更できるのはヤバイ
user_2.point = 0          # コンストラクタの設定値が変更される

print( user_1.point )     # 自作メソッドにより100 加算される
print( user_2.point )     # ユーザー2のポイントを1000 -> 0 に変更



# 関数の書き方

# 関数定義
def print_hello():      # def で始まり : コロンで段落
    print("こんにちは")

# 関数呼び出し
print_hello()


# 引数と戻り値

# 引数  : 関数に渡す値が代入された変数
# 戻り値: 関数が返す値
# 
# def add_number( 引数1, 引数2 ): public static double -> def
#     c = a + b
#     return c (戻り値)

# added = add_number( 10, 100 )    double 省略
# print( added )


def add_sub_number( a, b ):     # 戻り値が２個あるのでadd_sub
    c = a + b
    d = a - b
    return c, d  # (戻り値)

an, sn = add_sub_number( 10, 100 ) # 変数が１個の場合タプルで表示
print( an )     # 110, -90 が表示
print( sn )     # 変数足りないと( 110, -90 )とタプルで表示








