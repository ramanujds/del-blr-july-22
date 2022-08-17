# Notes and Steps

## Angular Sessions

https://drive.google.com/drive/folders/1HebnyjDMsC-7-h2J3F5s-BxwDGwJ5fYZ?usp=sharing

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


## Some simple videos on Spring MVC with Spring Boot

https://youtube.com/playlist?list=PLrOxLng9KmrckQyT5HEGJ_8cFIbbNX-X7

## Microservices Service Discovery Steps :

**Service Registration**
-------------------------

 - Created a spring boot app with eureka-server dependency only
 - Added annotation @EnableEurekaServer
 - Strat the eureka-server-app
 - Added eureka-client dependencies to menu and recipe services
 - Added annotation @EnableEurekaClient
 - started multiple instances of recipe-service
 - -Dserver.port=8101
 - started menu service
 - browse and check eureka-dashboard



**Service Discovery**
-------------------------
 - localhost:xxxx replaced with the service name
 - [recipeServiceUrl: http://FOODIE-APP-RECIPE-SERVICE/recipe/]

**Load Balancing**
-------------------------
 - add @LoadBalanced with RestTemplate bean


## Product - Wishlist

**Product Service**

- Create REST Endpoints to fetch and add product information
- Add to Wishlist

**GET**
* localhost:8000/products/[PRODUCT-ID]

**POST**
* localhost:8000/products

**GET**
* localhost:8000/products/wishlist/[PRODUCT-ID]

**Wishlist Service**
- Create REST endpoints to add product to wishlist and fetch all the products in wishlist

**GET**
* localhost:8200/wishlist

**POST**
* localhost:8200/wishlist




### CORS Config API Gateway

```yml
      default-filters:
        - DedupeResponseHeader=Access-Control-Allow-Origin Access-Control-Allow-Credentials, RETAIN_UNIQUE
      globalcors:
          cors-configurations: 
            '[/**]':
              allowed-origins: "*"
              allowed-methods: "*"
              allowed-headers: "*"


```

