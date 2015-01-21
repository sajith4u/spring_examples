package com.sajith.db;

import com.mkyong.core.Customer;

/**
 * Created by sajith on 1/21/15.
 */
public interface Dbqueries {
    public void insert(Customer customer);
    public Customer findId(int id);
}
