package com.demo.interceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class RequestInterceptor extends HandlerInterceptorAdapter {

	private static final Logger LOGGER = LoggerFactory.getLogger(RequestInterceptor.class);
	
 @Override
 public boolean preHandle(HttpServletRequest request, 
		HttpServletResponse response, Object object) throws Exception {
	LOGGER.info("In preHandle we are Intercepting the Request");
	LOGGER.info("____________________________________________");
	String requestURI = request.getRequestURI();
	LOGGER.info("RequestURI::" + requestURI);
	LOGGER.info("____________________________________________");
	return true;
 }

 @Override
 public void postHandle(HttpServletRequest request, HttpServletResponse response, 
		Object object, ModelAndView model)
		throws Exception {
	LOGGER.info("_________________________________________");
	LOGGER.info("In postHandle request processing "+ "completed by @RestController");
	LOGGER.info("_________________________________________");
 }

 @Override
 public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
		Object object, Exception arg3)
		throws Exception {
	LOGGER.info("________________________________________");
	LOGGER.info("In afterCompletion Request Completed");
	LOGGER.info("________________________________________");
 }
}