package com.stocksadmin.controller;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthIndicatorController implements HealthIndicator {

	@Override
	public Health health() {
		return Health.up().build();
	}
}
