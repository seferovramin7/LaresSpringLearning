package com.ltc.laresspringlearning.clients;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FeignAuthInterceptor implements RequestInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(FeignAuthInterceptor.class);

    @Override
    public void apply(RequestTemplate template) {
        // Log the request URL
        logger.info("Request URL: {}", template.url());

        // Log the request method
        logger.info("Request Method: {}", template.method());

        // Log the headers
        template.headers().forEach((key, value) -> {
            logger.info("Header: {} = {}", key, value);
        });

        // Log the request body if present
        if (template.body() != null) {
            String body = new String(template.body());
            logger.info("Request Body: {}", body);
        } else {
            logger.info("No request body.");
        }

        // Add the Authorization header
        template.header("Authorization", "Bearer " + getToken());
    }

    // Method to get the OAuth2 token, mocked here for simplicity
    private String getToken() {
        // In a real application, fetch the OAuth2 token from a token provider
        return "sample-oauth2-token";
    }
}


