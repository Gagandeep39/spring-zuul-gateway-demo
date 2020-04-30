/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-30 23:07:53
 * @modify date 2020-04-30 23:07:53
 * @desc Just another PreFilter with Order two i.e it will execute after first pre filter
 */
package com.gagan.zuulgateway.filter;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PreSecondFilter extends ZuulFilter {

    Logger logger  = LoggerFactory.getLogger(PreSecondFilter.class);

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        logger.info("Second Pre filter: Request Methd = {}, URL = {}", request.getMethod(), request.getRequestURI());
        return null;
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 2;
    }

}