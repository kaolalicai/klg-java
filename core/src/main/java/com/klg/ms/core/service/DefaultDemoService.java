package com.klg.ms.core.service;

import klg.ms.api.DemoService;
import org.springframework.beans.factory.annotation.Value;
import org.apache.dubbo.config.annotation.Service;

/**
 * Default {@link DemoService}
 *
 * @see DemoService
 */
@Service(version = "1.0.0")
public class DefaultDemoService implements DemoService {
    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
