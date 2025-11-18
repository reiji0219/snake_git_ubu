#!/urs/bin/awk -f

# $9：Apacheログなどでステータスコード（200, 404, 500など）が9列目にある。
# count[$9]++：ステータスコードごとに出現回数をカウント。
# END { for (code in count) print code, count[code] }：集計結果を出力。

{ count[ $9 ]++ }
END { for ( code in count ) print code, count[ code ] }
