package com.github.ympavlov.study.eventproc.dict.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@Component
public class CountryApiImpl implements CountryApiDelegate
{
	private final NativeWebRequest request;

	@Autowired
	public CountryApiImpl(NativeWebRequest nativeWebRequest) {this.request = nativeWebRequest;}

	@Override
	public Optional<NativeWebRequest> getRequest()
	{
		return Optional.ofNullable(request);
	}
}
