class TradeTest extends org.scalatest.FunSuite {

  var trade: Trade =  Trade("911","NFLX",100,6.0)

  test("Trade.value") {

    assert(trade.value() == 600.0 )

  }

}
