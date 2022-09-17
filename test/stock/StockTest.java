package stock;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


/**
 * Testing the Stock Class.
 */
public class StockTest {
  private Stock testStock;

  /**
   * Set up a testStock.
   */
  @Before
  public void setUp() {
    testStock = new Stock("TSLA", "Tesla", 280.00);
    testStock.setCurrentPrice(320.00);
  }

  /**
   * Test getSymbol().
   */
  @Test
  public void testGetSymbol() {
    assertEquals("TSLA", testStock.getSymbol());
  }

  /**
   * Test getName().
   */
  @Test
  public void testGetName() {
    assertEquals("Tesla", testStock.getName());
  }

  /**
   * Test getCostBasis().
   */
  @Test
  public void testGetCostBasis() {
    assertEquals(280.00, testStock.getCostBasis(), 0.01);
  }

  /**
   * Test getCurrentPrice().
   */
  @Test
  public void testGetCurrentPrice() {
    assertEquals(320.00, testStock.getCurrentPrice(), 0.01);
  }

  /**
   * Test setCostBasis().
   */
  @Test
  public void testSetCostBasis() {
    testStock.setCostBasis(300.00);
    assertEquals(300.00, testStock.getCostBasis(), 0.01);
  }

  /**
   * Test setCurrentPrice().
   */
  @Test
  public void testSetCurrentPrice() {
    testStock.setCurrentPrice(320.00);
    assertEquals(320.00, testStock.getCurrentPrice(), 0.01);
  }

  /**
   * Test getChangePercent().
   */
  @Test
  public void testGetChangePercent() {
    assertEquals((320.00 - 280.00) / 280.00, testStock.getChangePercent(), 0.01);
  }

  /**
   * Test toString().
   */
  @Test
  public void testToString() {
    assertEquals("Tesla Current Price: $ 320.00\n"
        + " Gain/Loss: 14.29%", testStock.toString());
  }

}
