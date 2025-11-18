#!/urs/bin/awk -f

# このファイルは Awk スクリプトであり、Awk インタプリタを使って実行してください」という宣言

{ sum += $7 }
END { print "合計", sum }
