class Trade private (val id:String, val symbol: String,val qty:Int, var price:Double){

  override def toString = s"Trade{ $id, $symbol, $qty, $price}"

  def price_(value: Double) = { if (value >= 0) price = value }

  def value():Double = { qty*price }

}


object Trade {
  def apply (id:String, symbol: String, qty:Int, price:Double):Trade = {
    try {
      require(price>0 && qty > 0)
      new Trade(id:String, symbol: String, qty:Int, price:Double)}
    catch {
      case e: IllegalArgumentException => println("Invalid Price or Quantity value provided"); null;
    }
  }

}