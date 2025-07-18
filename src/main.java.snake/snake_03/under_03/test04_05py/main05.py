from Item05 import Item

...
item = Item()

# item.id = "掛け算"
# item.name = "税込み価格"
# item.price = 980
# item.tax = 1.1


item_set = ( Item()
            .id( "掛け算" )
            .name( "税込み価格" )
            .price( 980 )
            .tax( 1.1 ) )

print( "計算式 :",item.id, )




