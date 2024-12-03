package com.debarshee.spring_boot_restapi.aspect;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspects {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspects.class);

    @Before("execution(public * com.debarshee.spring_boot_restapi.controller.AlienController.getAliens())")
    public void BeforeAdviceLog() {
        LOGGER.info("controller.AlienController.getAliens was called");
    }

    @AfterReturning("execution(public * com.debarshee.spring_boot_restapi.controller.AlienController.getAliens())")
    public void AfterReturningAdviceLog() {
        LOGGER.info("controller.AlienController.getAliens was executed and returned value");
    }

    @AfterThrowing("execution(public * com.debarshee.spring_boot_restapi.controller.AlienController.getAliens())")
    public void AfterThrowingAdviceLog() {
        LOGGER.info("controller.AlienController.getAliens was executed and throw error");
    }

    @After("execution(public * com.debarshee.spring_boot_restapi.controller.AlienController.getAliens())")
    public void AfterFinallyAdviceLog() {
        LOGGER.info("controller.AlienController.getAliens was executed");
    }

    @Around("execution(public * com.debarshee.spring_boot_restapi.controller.AlienController.getAliens())")
    public void AroundAdviceLog() {
        LOGGER.info("controller.AlienController.getAliens is being executed");
    }
}
