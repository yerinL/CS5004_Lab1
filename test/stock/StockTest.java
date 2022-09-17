package stock;


import org.junit.After;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class StockTest {
  private Stock testStock;

  @Before
  public void setUp(){
    testStock = new Stock("TSLA", "Tesla", 280.00);
    testStock.setCurrentPrice(320.00);
  }

  @Test
  public void testGetSymbol() {
    assertEquals("TSLA", testStock.getSymbol());
  }

  @Test
  public void testGetName() {
    assertEquals("Tesla", testStock.getName());
  }

  @Test
  public void testGetCostBasis() {
    assertEquals(280.00, testStock.getCostBasis(), 0.01);
  }

  @Test
  public void testGetCurrentPrice() {
    assertEquals(320.00, testStock.getCurrentPrice(), 0.01);
  }

  @Test
  public void testSetCostBasis() {
    testStock.setCostBasis(300.00);
    assertEquals(300.00, testStock.getCostBasis(), 0.01);
  }

  @Test
  public void testSetCurrentPrice() {
    testStock.setCurrentPrice(320.00);
    assertEquals(320.00, testStock.getCurrentPrice(), 0.01);
  }

  @Test
  public void testGetChangePercent() {
    assertEquals((320.00 - 280.00) / 280.00, testStock.getChangePercent(), 0.01);
  }

  @Test
  public void testToString() {
    assertEquals("Tesla Current Price: $ 320.00\n" +
      " Gain/Loss: 14.29%", testStock.toString());
  }
}