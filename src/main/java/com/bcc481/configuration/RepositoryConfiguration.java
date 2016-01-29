package com.bcc481.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by hannon on 29/01/16.
 */

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.bcc481.models"})
@EnableJpaRepositories(basePackages = {"com.bcc481.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
