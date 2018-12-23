package com.emrkoc.examples.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
    private EmailProperties emailProperties;

    @Autowired
    public EmailService(EmailProperties emailProperties) {
        this.emailProperties = emailProperties;
    }


}
