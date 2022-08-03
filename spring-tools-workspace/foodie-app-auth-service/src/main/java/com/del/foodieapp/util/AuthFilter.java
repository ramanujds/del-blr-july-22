package com.del.foodieapp.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.del.foodieapp.model.UserInfo;
import com.del.foodieapp.service.UserAuthService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AuthFilter implements Filter {

	@Autowired
	private JwtTokenUtil jwtUtil;

	@Autowired
	private UserAuthService service;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		log.info("Request Intercepted");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		String path = req.getRequestURI();
		if (path.startsWith("/authenticate")) {
			chain.doFilter(request, response);
			return;
		}

		String auth = req.getHeader("auth");
		if (auth != null) {
			log.info("Auth Header Fetched");
			if (!auth.isEmpty()) {
				String username = jwtUtil.decodeToken(auth);
				log.info("Feched JWT :" +auth);
				UserInfo user = service.getUserByName(username);
				log.info("Fetched user : "+user.toString());
				if (user == null) {
					log.error("No User Found");
					res.setStatus(HttpStatus.UNAUTHORIZED.value());
					return;
				}
				log.info("Logged in as "+username);
			}
			
			chain.doFilter(request, response);
		}

		else {
			log.error("No Auth Header Present");
			res.setStatus(HttpStatus.UNAUTHORIZED.value());
			return;
		}

	}

}
