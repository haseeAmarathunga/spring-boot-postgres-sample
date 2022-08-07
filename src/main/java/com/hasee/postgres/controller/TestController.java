package com.hasee.postgres.controller;

import com.hasee.postgres.dto.ResponseDto;
import com.hasee.postgres.model.Test;
import com.hasee.postgres.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Copyright (c) 2022.
 * Developed by haseeAmarathunga
 */
@RestController
public class TestController implements ITestController
{
	@Autowired
	private ITestService testService;

	@Override
	public ResponseEntity<ResponseDto<Test>> createTest( @RequestBody Test test )
	{
		if ( test == null )
		{
			return ResponseEntity.badRequest().body( new ResponseDto<>( -1, "Request body missing" ) );
		}
		return ResponseEntity.ok( testService.saveTest( test ) );
	}

	@Override
	public ResponseEntity<ResponseDto<List<Test>>> getAllTestData()
	{
		return ResponseEntity.ok( testService.getAllTests() );
	}

}
