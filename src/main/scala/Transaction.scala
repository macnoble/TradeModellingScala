class Transaction(id:String,symbol:String , qty:Int, price:Double) extends EquityTrade (id,symbol , qty, price) with FeePayable with Taxable {
  override def fee = 10
  override def tax = 0.125

  def amount(): Double ={
    (super.value()*qty + fee)*tax
  }
}
