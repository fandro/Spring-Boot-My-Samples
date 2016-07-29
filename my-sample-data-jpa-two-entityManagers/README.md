
1.在配置类中添加多数据源

```
@Configuration
public class GlobalConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.primary")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix="spring.datasource.secondary")
    public DataSource secondaryDataSource() {
        return DataSourceBuilder.create().build();
    }
}
```


2.application.properties添加配置
```
#---- 数据库(多数据源) ----
spring.datasource.primary.name=marsterdb
spring.datasource.primary.url=jdbc:mysql://127.0.0.1/boot
spring.datasource.primary.username=root
spring.datasource.primary.password=123456
spring.datasource.primary.driver-class-name=com.mysql.jdbc.Driver

spring.datasource.secondary.name=slavedb
spring.datasource.secondary.url=jdbc:mysql://127.0.0.1/boot2
spring.datasource.secondary.username=root
spring.datasource.secondary.password=123456
spring.datasource.secondary.driver-class-name=com.mysql.jdbc.Driver
```

3.配置entityManager

mysample.PrimaryConfig 
mysample.SecondaryConfig
1.设置Repository所在位置 asePackages= { "mysample.repository.user" }
2.设置实体类所在位置 packages("mysample.domain") 
3.设置persistenceUnit("primaryPersistenceUnit")

主要配置:
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef="entityManagerFactoryPrimary",
        transactionManagerRef="transactionManagerPrimary",
        basePackages= { "mysample.repository.user" }) //设置Repository所在位置
        
        @Primary
        @Bean(name = "entityManagerFactoryPrimary")
        public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary (EntityManagerFactoryBuilder builder) {
            return builder
                    .dataSource(primaryDataSource)
                    .properties(getVendorProperties(primaryDataSource))
                    .packages("mysample.domain") //设置实体类所在位置
                    .persistenceUnit("primaryPersistenceUnit")
                    .build();
        }
        
4.Repository实现类设置
mysample.repository.user.UserRepositoryImpl

    @PersistenceContext(unitName = "secondaryPersistenceUnit")
    private EntityManager entityManager;