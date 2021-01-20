package kr.djam.bookshop.controller;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
		"file:webapp/WEB-INF/spring-servlet.xml"
})
public abstract class AbstractApplicationContextTest {
	@Autowired protected ApplicationContext context;
}
