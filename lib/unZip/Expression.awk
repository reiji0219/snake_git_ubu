#!/urs/bin/awk -f

# 評価式：   ○○番目の行（横）を出力する
# awk ' NR == 3048 { print $0 }' ファイルパス.csv

NR == 3048 { print $0 }
