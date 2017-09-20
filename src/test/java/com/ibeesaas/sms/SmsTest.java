package com.ibeesaas.sms;

import org.junit.Test;

import com.ibeesaas.sms.smscase.SmsCr;

public class SmsTest {
	
	private static String tels = "15011018136";
	private static String smscontent = "测试短信，请忽略。";

	@Test
	public void testCrSend() throws Exception {
//		SmsCr.sendSMS(tels, smscontent);
	}
	
	@Test
	public void testCrBalance() throws Exception {
		String balance = SmsCr.balance();
		System.out.println(balance);
	}
}
