package com.spring.springcommon.integration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PostApiEndpoint {
    @Value("${baseEndPoint.post.url}")
    private String url;

    public String getUrl() {
        return url;
    }

    public String getPostByUserId() {
        return this.getUrl() + "user/";
    }
}
