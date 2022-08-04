# Notes and Steps

## Spring Context Schema Link

https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html#xsd-config-body-schemas-context

### XML Schema for Spring


```xml

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context" xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd"> <!-- bean definitions here -->

</beans>

```

## Spring Steps

1. Create a maven project
1. Add Spring Dependency to POM.XML
1. Create a source folder with name resources
1. Create a file beans.xml under resources
1. Mention the spring-context schema
1. Create beans -
```xml
	<bean id="..." class="...">
		<properties name=".." value/ref ="...">
	</bean>
```
1. Create an object of ApplicationContext
1. Fetching the beans using getBean()


## CORS Configuration

```yaml
      default-filters:
        - DedupeResponseHeader=Access-Control-Allow-Origin Access-Control-Allow-Credentials, RETAIN_UNIQUE
      globalcors:
          cors-configurations: 
            '[/**]':
              allowed-origins: "*"
              allowed-methods: "*"
              allowed-headers: "*"

```
