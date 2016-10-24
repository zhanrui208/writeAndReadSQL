package writeAndReadSQL;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource   extends AbstractRoutingDataSource{

	@Override
	protected Object determineCurrentLookupKey() {

		 // ʹ��DynamicDataSourceHolder��֤�̰߳�ȫ�����ҵõ���ǰ�߳��е�����Դkey  
		  return DynamicDataSourceHolder.getDataSourceKey();  
	}

}
