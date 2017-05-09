package com.youo;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.youo.service.YouoProperties;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class YouoApplicationTests {

	private static final Log log = LogFactory.getLog(YouoApplicationTests.class);
	@Autowired
	private YouoProperties youoProperties;


	@Test
	public void test1() throws Exception {
		Assert.assertEquals("DD", youoProperties.getName());
		Assert.assertEquals("Spring Boot", youoProperties.getTitle());
		//Assert.assertEquals("程序猿DD正在努力写《Spring Boot教程》", youoProperties.getDesc());

		log.info("随机数测试输出：");
		log.info("随机字符串 : " + youoProperties.getValue());
		log.info("随机int : " + youoProperties.getNumber());
		log.info("随机long : " + youoProperties.getBignumber());
		log.info("随机10以下 : " + youoProperties.getTest1());
		log.info("随机10-20 : " + youoProperties.getTest2());

	}

}
