package stock;

import java.text.DecimalFormat;

/**
 * Yerin Lim
 * CS 5004 Lab 01
 * Class Stock represents a stock to be traded.
 */
public class Stock {
  private String symbol;
  private String name;
  private double costBasis;
  private double currentPrice;

  /**
   * Constructor for the Stock class.
   *
   * @param symbol    the symbol for the stock.
   * @param name      the name of the stock.
   * @param costBasis the cost basis for the stock.
   */
  public Stock(String symbol, String name, double costBasis) {
    this.symbol = symbol;
    this.name = name;
    this.costBasis = costBasis;
  }

  /**
   * Get the symbol of the stock.
   *
   * @return the symbol of the stock.
   */
  public String getSymbol() {
    return this.symbol;
  }

  /**
   * Get the name of the stock.
   *
   * @return the name of the stock.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Get the cost basis of the stock.
   *
   * @return the cost basis of the stock.
   */
  public double getCostBasis() {
    return this.costBasis;
  }

  /**
   * Get the current price of the stock.
   *
   * @return the current price of the stock.
   */
  public double getCurrentPrice() {
    return this.currentPrice;
  }

  /**
   * Set the cost basis of the stock.
   *
   * @param costBasis the cost basis of the stock
   */
  public void setCostBasis(double costBasis) {
    this.costBasis = costBasis;
  }

  /**
   * Set the current price of the stock.
   *
   * @param newCurrentPrice the new current price of the stock
   */
  public void setCurrentPrice(double newCurrentPrice) {
    this.currentPrice = newCurrentPrice;
  }

  /**
   * Get the current price percent change by computing the difference
   * between the current price and the cost basis of the stock.
   *
   * @return the change percent of the stock.
   */
  public double getChangePercent() {
    return (this.currentPrice - this.costBasis) / this.costBasis;
  }

  /**
   * Returns the string representation of the stock instance that shows the name of the company,
   * current price, and gain/loss percentage.
   *
   * @return string representation of the stock instance's name of the company, current price,
   *     and gain/loss percentage
   */
  public String toString() {
    DecimalFormat price = new DecimalFormat("$ 0.00");
    DecimalFormat percentage = new DecimalFormat("0.00%");
    return this.name + " Current Price: " + price.format(this.currentPrice)
      + "\n Gain/Loss: " + percentage.format(this.getChangePercent());
  }

}
