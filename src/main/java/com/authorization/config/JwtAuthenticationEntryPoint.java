package com.authorization.config;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6861954344158351086L;

	@Override
	public void commence(HttpServletRequest req, HttpServletResponse res, AuthenticationException e)
			throws IOException, ServletException {
		// This is invoked when user tries to access a secured REST resource without
		// supplying any credentials
		// We should just send a 401 Unauthorized response because there is no '
		// page' to redirect to
		System.out.println("User hits an invalid Request");
		res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
	}

}
