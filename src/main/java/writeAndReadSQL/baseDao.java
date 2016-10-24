package writeAndReadSQL;

public abstract class baseDao {
	DynamicDataSource ds ;
	public DynamicDataSource getSourceAspect(DynamicDataSource ds){
		return ds;
	}
	public void setSourceAspect(DynamicDataSource ds){
		this.ds =ds;
	}
}
