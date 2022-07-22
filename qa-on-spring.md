```text

Q: Given the following Spring configuration file, what is the correct answer:
   <bean class="com.spring.service.MyServiceImpl">
      <property name="repository" ref="jpaDao"/>
   </bean>
   <bean class="com.spring.repository.JpaDao"/>

A: The second declared bean JpaDao is missing an id must be named jpaDao

-----------------------------------------------------

Q: Given the Spring configuration file, which are the correct statements?
<bean class="com.spring.service.BankServiceImpl" p:bankName="NationalBank"> </bean>

A:  The p namespace has to be declared :
To set bean’s property with the p:propertyName shortcut, you have to declare the http://www.springframework.org/schema/p in your xml configuration file. No xsd is required
       NationalBank is not a bean reference, so it is a simple String and thus a scalar value

-----------------------------------------------------


Q: What statement is not correct in live environment? 
A: 
1. Constuctor and properties autowiring in the same bean are not compatible
2. A bean should have a default or a no-args constructor
3. The <constructor-arg> tag could take type, name and index to reduce ambiguity

-----------------------------------------------------

Q: What are the right affirmations about the @PostConstruct, @Resource and the @PreDestroy annotations?
A:
1. Those annotations are specified in the JSR-250
2. The <context:component-scan> tag enable them
3. The <context:annotation-config > tag enable them

-----------------------------------------------------

Q: Select the right statement about referring a Spring configuration file inside the package com.example.myapp in the below example?
A :
ApplicationContext context = 
    new ClassPathXmlApplicationContext("classpath:/com.example.myapp.config.xml");
1. When using the ClassPathXmlApplicationContext, the classpath: prefix is default one so you could omit it
2. In a Spring location resource, package separator is a slash and not a dot. Thus the com/example/myapp/config.xml syntax has to be used.
3. ClassPathXmlApplicationContext starts looking from root of the classpath regardless of whether we specify "/"

-----------------------------------------------------

Q: How to auto-inject into a field a bean by its name? 
A:
1. By using both the @Autowired and the @Qualifier spring annotations
2. By using the @Autowired annotation and naming the field with the bean name

-----------------------------------------------------


Q:What are the features of the XML <context: namespace? 
A:
1. @Autowired annotation enabling
Turns on <context:annotation-config /> or <context:component-scan /> to enable @Autowiring annotation
2. @Component annotation scanning
Turns on <context:component-scan /> to enable @Component annotation scanning 



-----------------------------------------------------

Q: What data access technology is supported by the Spring framework? 
1. JDBC
2. Hibernate
3. JPA

-----------------------------------------------------

Q: Where can you NOT declare Spring MVC controller? 
1. Into the web.xml file of the web application
    In the web.xml, you may declare a DispatcherServlet that are in charge to load XML Spring configuration files. But you cannot declare controllers directly in these file.
2. Into the JSP pages
    JSP is the View of the MVC Pattern. Thus this is not the right place to declare controllers.

-----------------------------------------------------

In spring AOP the advices are :
  Before
  After returning
  After throwing
  Around

-----------------------------------------------------



```
