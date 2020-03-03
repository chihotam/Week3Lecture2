package execution

class TradeAgreement (var one: Trader, var two: Trader) {
  var agree: Boolean = false
  def executeTrade(): Unit = {
    if (!agree) {
      val temp: Valuable = one.item
      one.item = two.item
      two.item = temp
      agree = true
    }
  }
}
