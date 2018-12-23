package com.emrkoc.examples.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("email")
public class EmailProperties {

    private String to;
    private String from;
    private String subject;
}
