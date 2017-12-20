package com.wml.system;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
  
/* 
 * 配置多数据源 
 */

public class DynamicDataSource extends AbstractRoutingDataSource{

    public static final String LOCAL_DATASOURCE = "localDataSource";

    public static final String DS_CASHLOAN = "ds_cashloan";

    public static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setCustomerType(String customerType) {

        contextHolder.set(customerType);

    }

    public static String getCustomerType() {

        return contextHolder.get();

    }

    public static void clearCustomerType() {

        contextHolder.remove();

    }

    @Override
    protected Object determineCurrentLookupKey() {

        return getCustomerType();

    }
}