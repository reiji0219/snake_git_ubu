class Item:

    def __init__( self ):
        self._id = None
        self._name = None
        self._price = None
        self._tax = None
    
    @property
    def id( self ):
        return self._id

    @id.setter
    def id( self, value ):
        self._id = value
        return self     # 自分自身を返す
    
    @property
    def name( self ):
        return self._name

    @name.setter
    def name( self, value ):
        self._name = value
        return self     # 自分自身を返す
    
    @property
    def price( self ):
        return  self._price

    @price.setter
    def price( self, value ):
        self._price = value
        return self     # 自分自身を返す
    
    @property
    def tax( self ):
        return self._tax

    @tax.setter
    def tax( self, value ):
        self._tax = value
        return self     # 自分自身を返す







