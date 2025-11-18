#!/urs/bin/awk -f

# 平均値の計算 $2 の数字を変更すれば、
# その列（縦,カラム）を計算

{ sum += $5; n++ }
END { print "平均値:", sum/n }
