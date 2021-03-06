package org.java.interview.order;

import java.util.List;

/**
 * This service calculates different statistics for customer orders
 */
public interface StatisticsService {

    /**
     * The method returns list of the customers whos monthly total order sum is the largest
     * only the given year should be considered
     * the list should include only the given number of customers
     *
     * @param orders - the list of orders to process
     * @param year - year for which to display the top
     * @param topSize - number of records to be in the top
     * @return
     */
    public List<StatsRecord> topMonthlyCustomersInYear(List<Order> orders, int year, int topSize);
}
