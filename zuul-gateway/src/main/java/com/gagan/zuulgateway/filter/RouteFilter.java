/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-30 23:20:08
 * @modify date 2020-04-30 23:20:08
 * @desc [description]
 */
package com.gagan.zuulgateway.filter;

import com.netflix.zuul.ZuulFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(RouteFilter.class);
    @Override
    public String filterType() {
        return "route";
    }
    @Override
    public int filterOrder() {
        return 1;
    }
    @Override
    public boolean shouldFilter() {
        return true;
    }
    @Override
    public Object run() {
        log.info("Inside route filter..");
        return null;
    }

}