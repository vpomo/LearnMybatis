package com.vpomo.shedule.util.db;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.Ordered;

import java.lang.reflect.Method;

public class ADBAop implements MethodInterceptor, Ordered {

	private String defalutDataSource = "one";

	public String getDefalutDataSource() {
		return defalutDataSource;
	}

	public void setDefalutDataSource(String defalutDataSource) {
		this.defalutDataSource = defalutDataSource;
	}

	//	  @Pointcut("execution( * com.leimingtech.service.module.goods.service.GoodsClassService.*(..))")
	public void readMethod() {

	}// 匹配所有的读取操作

	//	  @Around(value ="readMethod()")
	public void before(ProceedingJoinPoint point) {
//			System.out.println("before11111-------------");
		Object target = point.getTarget();
		String method = point.getSignature().getName();

		Class<?>[] classz = target.getClass().getInterfaces();
		Class<?>[] parameterTypes = ((MethodSignature) point.getSignature())
				.getMethod().getParameterTypes();
		try {
			Method m = target.getClass().getMethod(method, parameterTypes);
			if (m != null && m.isAnnotationPresent(DataSource.class)) {
				DataSource data = m
						.getAnnotation(DataSource.class);
				DynamicDataSourceHolder.setDataSourceType(data.value());
			} else {
				DynamicDataSourceHolder.setDataSourceType(defalutDataSource);
			}

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		try {
			point.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*@After(value ="execution(* com.thinkgem.jeesite.test.service.TestService.*(..))")
	public void after(){
		System.out.println("after-------------");
	}
	 @AfterThrowing("execution(* com.thinkgem.jeesite.test.service.TestService.*(..))")
	public void doAfterThrow(){
		System.out.println("throwing---------------");
	} */
	/* (non-Javadoc)
	 * @see org.springframework.core.Ordered#getOrder()
	 */
	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	/* (non-Javadoc)
	 * @see org.aopalliance.intercept.MethodInterceptor#invoke(org.aopalliance.intercept.MethodInvocation)
	 */
	@Override
	public Object invoke(MethodInvocation point) throws Throwable {
		// TODO Auto-generated method stub
//		System.out.println("before11111-------------");
//	        try {
		Method m = point.getMethod();
		if (m != null && m.isAnnotationPresent(DataSource.class)) {
			DataSource data = m
					.getAnnotation(DataSource.class);
			DynamicDataSourceHolder.setDataSourceType(data.value());
		} else {
			DynamicDataSourceHolder.setDataSourceType("one");
		}

		return point.proceed();
		//} catch (Throwable e) {
		//// TODO Auto-generated catch block
		//e.printStackTrace();
		//}
		//return null;
	}


}
