package writeAndReadSQL;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:context/applicationContext.xml");
		DataSourceAspect ds = (DataSourceAspect) ctx.getBean("dataSourceAspect");
		
		shopDao ss = new shopDao();
		
		ss.selShops();
	
	}

}
