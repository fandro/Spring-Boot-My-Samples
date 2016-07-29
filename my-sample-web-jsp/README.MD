
**1.布局**：
java文件：src/main/java/com
静态文件：src/main/resources/static：静态文件（css、js等）
配置文件：src/main/resources/application.properties
jsp路径：src/main/webapp/WEB-INF/jsp


**2.配置属性文件**
application.properties文件中配置：
spring.mvc.view.prefix: /WEB-INF/jsp/
spring.mvc.view.suffix: .jsp

**3.配置pom.xml**
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<!--编译jsp-->
<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
    <scope>provided</scope>
</dependency>
<!--支持jstl标签-->
<dependency>
   <groupId>javax.servlet</groupId>
   <artifactId>jstl</artifactId>
</dependency>
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```

**4.运行**
mvn spring-boot:run
