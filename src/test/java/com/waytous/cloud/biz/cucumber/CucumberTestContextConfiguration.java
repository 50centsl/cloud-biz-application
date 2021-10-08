package com.waytous.cloud.biz.cucumber;

import com.waytous.cloud.biz.CloudBizGatewayApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = CloudBizGatewayApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
