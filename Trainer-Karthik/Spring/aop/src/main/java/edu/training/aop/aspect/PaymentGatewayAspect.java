package edu.training.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PaymentGatewayAspect {
	
	@Before("execution(* edu.training.aop.model.PaymentGateway.makePayment())")
	public void checkSession()
	{
		System.out.println("Session is active");
	}
	
	@After("execution(* edu.training.aop.model.PaymentGateway.makePayment())")
	public void sendNotification()
	{
		System.out.println("Tranx Compeleted ...............");
	}

}
