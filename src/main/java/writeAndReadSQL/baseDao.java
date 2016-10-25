package writeAndReadSQL;

import org.springframework.beans.factory.annotation.Autowired;

public  class baseDao {
//	DynamicDataSource ds ;
//	public DynamicDataSource getSourceAspect(DynamicDataSource ds){
//		return ds;
//	}
//	public void setSourceAspect(DynamicDataSource ds){
//		this.ds =ds;
//	}
	public DynamicDataSource ds;

	public DynamicDataSource getDs() {
		return ds;
	}

	public void setDs(DynamicDataSource ds) {
		this.ds = ds;
	}
}
