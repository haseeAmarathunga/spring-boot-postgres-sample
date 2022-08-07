package com.hasee.postgres.controller;

import com.hasee.postgres.dto.ResponseDto;
import com.hasee.postgres.model.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Copyright (c) 2022.
 * Developed by haseeAmarathunga
 */
@RequestMapping("tests")
@CrossOrigin(origins = { "*" })
public interface ITestController
{
	@RequestMapping(method = RequestMethod.POST, path = "/v1", produces = "application/json")
	ResponseEntity<ResponseDto<Test>> createTest( @RequestBody Test test );

	@RequestMapping(method = RequestMethod.GET, path = "/v1", produces = "application/json")
	ResponseEntity<ResponseDto<List<Test>>> getAllTestData();
}
