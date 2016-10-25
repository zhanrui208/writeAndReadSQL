package writeAndReadSQL;

import java.sql.SQLException;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.util.Map;

public class DynamicDataSource   extends AbstractRoutingDataSource{

	@Override
	protected Object determineCurrentLookupKey() {

		 // 使用DynamicDataSourceHolder保证线程安全，并且得到当前线程中的数据源key  
		  return DynamicDataSourceHolder.getDataSourceKey();  
	}
	
    @Override
    public java.sql.Connection getConnection() throws SQLException {
        return determineTargetDataSource().getConnection();
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return determineTargetDataSource().getConnection(username, password);
    }

    @Override
    public void setDefaultTargetDataSource(Object defaultTargetDataSource) {
        super.setDefaultTargetDataSource(defaultTargetDataSource);
    }

    @Override
    public void setTargetDataSources(Map<Object, Object> targetDataSources) {
        super.setTargetDataSources(targetDataSources);
    }
}
