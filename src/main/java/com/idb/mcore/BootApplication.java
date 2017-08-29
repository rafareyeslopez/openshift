package com.idb.mcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * @author Urosh T.
 *
 *         Application Boot
 *
 */
@SpringBootApplication(scanBasePackages = { "com.idb.mcore" })
public class BootApplication extends SpringBootServletInitializer {

	/*
	 * @see org.springframework.boot.web.support.SpringBootServletInitializer#
	 * configure(org.springframework.boot.builder.SpringApplicationBuilder)
	 */
	@Override
	protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
		System.out.println("starting configure RAFAAAA ");
		return application.sources(BootApplication.class);
	}

	/**
	 * Run method of the Spring Boot
	 *
	 * @param String[]
	 *            args
	 */
	public static void main(final String[] args) {
		System.out.println("starting main RAFAAAA ");
		SpringApplication.run(BootApplication.class, args);
		System.out.println("started main RAFAAAA ");
	}
}
