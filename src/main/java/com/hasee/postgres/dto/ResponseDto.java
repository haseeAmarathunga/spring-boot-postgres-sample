package com.hasee.postgres.dto;

import java.io.Serializable;

/**
 * Copyright (c) 2022.
 * Developed by haseeAmarathunga
 */
public class ResponseDto<T> implements Serializable
{
	private Integer status;
	private T body;
	private String message;

	public ResponseDto( int status, String message )
	{
		this.status = status;
		this.message = message;
	}

	public ResponseDto( int status, T body, String message )
	{
		this.status = status;
		this.body = body;
		this.message = message;
	}

	public Integer getStatus()
	{
		return status;
	}

	public void setStatus( Integer status )
	{
		this.status = status;
	}

	public T getBody()
	{
		return body;
	}

	public void setBody( T body )
	{
		this.body = body;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage( String message )
	{
		this.message = message;
	}
}
