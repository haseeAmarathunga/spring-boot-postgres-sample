package com.hasee.postgres.service;

import com.hasee.postgres.dto.ResponseDto;
import com.hasee.postgres.model.Test;

import java.util.List;

/**
 * Copyright (c) 2022.
 * Developed by haseeAmarathunga
 */
public interface ITestService
{
	ResponseDto<Test> saveTest(Test test);

	ResponseDto<List<Test>> getAllTests();
}
