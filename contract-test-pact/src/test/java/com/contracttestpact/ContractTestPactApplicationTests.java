package com.contracttestpact;

import com.contracttestpact.constants.JsonFilesConstants;
import com.contracttestpact.utils.ReaderUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

class ContractTestPactApplicationTests {

	@Test
	void contextLoads()  {
		String path = ReaderUtil.readJsonFileAsString(JsonFilesConstants.PERSON_PATH);
		System.out.println("");
	}

}
