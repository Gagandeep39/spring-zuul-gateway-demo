/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-30 23:39:34
 * @modify date 2020-04-30 23:39:34
 * @desc [description]
 */
package com.gagan.zuulgateway.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            // All request to patient service must be authenticated
            .antMatchers("/patient-service/**")
            .authenticated()
            // All other request can be unauthenticated
            .anyRequest()
            .permitAll();
    }

}