package com.accelaero.sample.sampleapp;

import junit.framework.TestCase;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostgresTest extends TestCase {

	private static Log log = LogFactory.getLog(PostgresTest.class);

	@Test
	public void testTeste() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			log.error("not in path");
		}

	}

}