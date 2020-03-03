package tests

import org.scalatest._
import execution.{TradeAgreement, Trader, Valuable}

class TestTrading extends FunSuite{
  test("Test") {
    val valuable1: Valuable = new Valuable()
    val trader1: Trader = new Trader(valuable1)
    val valuable2: Valuable = new Valuable()
    val trader2: Trader = new Trader(valuable2)
    val valuable3: Valuable = new Valuable()
    val agreement: TradeAgreement = new TradeAgreement(trader1, trader2)
    agreement.executeTrade()
    assert(trader1.item == valuable2)
    assert(trader2.item == valuable1)
    assert(trader1.item != valuable1)
    assert(trader2.item != valuable2)
    assert(trader1.item != valuable3)
    agreement.executeTrade()
    assert(trader1.item == valuable2)
    assert(trader2.item == valuable1)
    assert(trader1.item != valuable1)
    assert(trader2.item != valuable2)
    assert(trader1.item != valuable3)
  }
}
