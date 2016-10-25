package writeAndReadSQL;

import javax.sql.DataSource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:context/applicationContext.xml");
		DynamicDataSource ds = (DynamicDataSource) ctx.getBean("dataSource");
		System.out.println(ds.getClass().getName());
//		shopDao ss = new shopDao();
//		ss.setSourceAspect(ds);
		shopDao ss = (shopDao) ctx.getBean("shopDao");
		ss.selShops();
		ss.upShops();
	}

}
