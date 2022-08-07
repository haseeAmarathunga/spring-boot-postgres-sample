package com.hasee.postgres.service;

import com.hasee.postgres.dto.ResponseDto;
import com.hasee.postgres.model.Test;
import com.hasee.postgres.repository.ITestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright (c) 2022.
 * Developed by haseeAmarathunga
 */
@Service
public class TestService implements ITestService
{
	@Autowired
	private ITestRepository testRepository;

	@Override
	public ResponseDto<Test> saveTest( Test test )
	{
		try
		{
			if ( test.getName() == null || test.getName().isEmpty() )
			{
				return new ResponseDto<>( -1, "Test name missing" );
			}
			testRepository.save( test );
			return new ResponseDto<>( 1, test, "Test Saved" );
		}
		catch ( Exception e )
		{
			e.printStackTrace();
			return new ResponseDto<>( -1, "Test save failed" );
		}
	}

	@Override
	public ResponseDto<List<Test>> getAllTests()
	{
		try
		{
			List<Test> testList = testRepository.findAll();
			if ( testList == null || testList.isEmpty() )
			{
				return new ResponseDto<>( -1, "Tests not found" );
			}
			return new ResponseDto<>( 1, testList, "Tests found" );
		}
		catch ( Exception e )
		{
			e.printStackTrace();
			return new ResponseDto<>( -1, "Tests search failed" );
		}
	}
}
