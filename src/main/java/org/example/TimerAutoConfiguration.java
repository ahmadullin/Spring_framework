package org.example;

import org.example.TimerAspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.aspect")
@EnableAspectJAutoProxy
public class TimerAutoConfiguration {
}
