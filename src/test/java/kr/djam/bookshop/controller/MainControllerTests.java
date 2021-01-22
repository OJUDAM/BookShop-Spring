package kr.djam.bookshop.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class MainControllerTests extends AbstractApplicationContextTest {

	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
	}
	@Test
	public void Test() throws Exception {
		this.mockMvc.perform(get("/Hello"))
			.andExpect(status().isOk());
	}
	
}
