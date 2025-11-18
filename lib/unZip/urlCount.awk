#!/urs/bin/awk -f

# ある特定の列（第7フィールド）に現れる値の出現回数を集計するためのものです。ログ解析やデータ集計の場面でよく使われる、非常に力強く簡潔な一行です

BEGIN { print "==最初の行を読み込む前の処理==" } 
{ count[$7]++ } 
END { for ( url in count) print url, count[url] }
