package writeAndReadSQL;
 import org.apache.commons.lang3.StringUtils;  
import org.aspectj.lang.JoinPoint;

import com.alibaba.druid.sql.visitor.functions.Instr;
public class DataSourceAspect {
	/**
	 * �ڽ���Service����֮ǰִ��
	 * 
	 * @param point
	 *            �������
	 */
	public void before(JoinPoint point) {
		// ��ȡ����ǰִ�еķ�����
		String methodName = point.getSignature().getName();
		if (isSlave(methodName)) {
			// ���Ϊ����
			DynamicDataSourceHolder.markSlave();
		} else {
			// ���Ϊд��
			DynamicDataSourceHolder.markMaster();
		}
	}

	/**
	 * �ж��Ƿ�Ϊ����
	 * 
	 * @param methodName
	 * @return
	 */
	private Boolean isSlave(String methodName) {
		// ��������query��find��get��ͷ�ķ������ߴӿ�
		try{
//			boolean b =  StringUtils.startsWithAny(methodName, "query", "find", "get");
			return methodName.indexOf("sel")>-1 ? true : false;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			System.out.println("111");
		}
	}
}
