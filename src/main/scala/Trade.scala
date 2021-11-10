abstract class Trade  (val id:String, var price:Double){

  override def toString = this.getClass.getName

//  override def toString = {
//    if (this.isExecutable() == true )"EquityTrade"
//    else "FXTrade"
//  }

  def price_(value: Double) = { if (value >= 0) price = value }

  def value() = {
    price
  }

   def isExecutable():Boolean {}

}


class EquityTrade( id:String,  val symbol: String, val qty:Int,  price:Double) extends Trade(id, price) {
  override def isExecutable() = true
}

class FXTrade( id:String,  price:Double) extends Trade(id, price) {
  override def isExecutable() = false
}


//object Trade {
//  def apply (id:String, symbol: String, qty:Int, price:Double):Trade = {
//    try {
//      require(price>0 && qty > 0)
//       Trade(id:String, symbol: String, qty:Int, price:Double)}
//    catch {
//      case e: IllegalArgumentException => println("Invalid Price or Quantity value provided"); null;
//    }
//  }
//}
