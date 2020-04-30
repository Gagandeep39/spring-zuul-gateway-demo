/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-30 23:11:10
 * @modify date 2020-04-30 23:11:10
 * @desc Will be Executed only when when reqyest has a parameter "medicines"
 */
package com.gagan.zuulgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomFilter extends ZuulFilter {

    
    Logger logger  = LoggerFactory.getLogger(PreSecondFilter.class);

    @Override
    public boolean shouldFilter() {
        RequestContext context = RequestContext.getCurrentContext();
        String param = context.getRequest().getParameter("medicines");
        return param != null && param.equals("medicines") ? false : true;
    }

    @Override
    public Object run() throws ZuulException {
        logger.info("Custom Filter");
        return null;
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 5;
    }

}