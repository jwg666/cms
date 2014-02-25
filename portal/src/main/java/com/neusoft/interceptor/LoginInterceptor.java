package com.neusoft.interceptor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.neusoft.base.BaseConstants;
import com.neusoft.model.portal.Member;
import com.neusoft.service.MemberService;
import com.neusoft.util.CookieUtil;
import com.neusoft.util.LoginContext;
import com.neusoft.util.LoginContextUtil;
import com.neusoft.util.MD5Util;

public class LoginInterceptor implements HandlerInterceptor{
	private Logger logger = LoggerFactory.getLogger(getClass());
	private List<String> excludedUrls; 
	@Resource
	private MemberService memberService;
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		logger.debug("--------------------------------------preHandle");
		boolean intercept = true;
		String requestUrl = request.getRequestURI(); 
		for (String excludeUrl:excludedUrls) {
			if (requestUrl.indexOf(excludeUrl)>0) {
				intercept = false;
			}
		}
		
		if(intercept){
			LoginContext loginContext = LoginContextUtil.get();
			if(loginContext == null){
				String userId = CookieUtil.getCookieValueByName(request, BaseConstants.USER_ID);
				if(!"".equals(userId)){
					loginContext = new LoginContext();
					loginContext.setIp(CookieUtil.getCookieValueByName(request, BaseConstants.USER_IP));
					loginContext.setUserId(new Long(userId));
					loginContext.setUserName(CookieUtil.getCookieValueByName(request, BaseConstants.USER_NAME));
					LoginContextUtil.put(loginContext);
				}else{
					//FIXME 没有登录信息
					response.sendRedirect("/../../login/index");
					
				}//else
			}//if intercept
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.debug("--------------------------------------postHandle");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.debug("--------------------------------------afterCompletion");
		
	}

	public List<String> getExcludedUrls() {
		return excludedUrls;
	}

	public void setExcludedUrls(List<String> excludedUrls) {
		this.excludedUrls = excludedUrls;
	}
	
}
