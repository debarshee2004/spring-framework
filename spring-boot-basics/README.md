# Spring Framework

The Spring Framework is a powerful, lightweight framework for building Java-based applications. It provides a comprehensive programming and configuration model for modern Java-based enterprise applications.

Spring Boot is an extension of the Spring Framework designed to simplify the development process and provide a production-ready application environment.

## Dependency Injection (DI)
Dependency Injection is a design pattern that allows an object to receive its dependencies from an external source rather than creating them internally. Dependency Injection is a core concept of Spring, enabling loose coupling between application components, which is crucial for building scalable and maintainable software.

## What is Maven?

**Maven is an open-source build automation and project management tool widely used for Java applications. It automates the source code compilation and dependency management, assembles binary codes into packages, and executes test scripts. Maven translates and packages your source code so that it becomes an executable application.**

## How to setup from Scratch using Maven?

First create an empty maven project from your IDE.

Next we need to setup the dependencies. For that we will go to [**MVN Repository**](https://mvnrepository.com/artifact/org.springframework/spring-context) and copy the code to [`pom.xml`](./pom.xml) file, this is where we will be managing all the **application dependences**.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!-- Example default `pom.xml` file. -->
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.debarshee</groupId>
    <artifactId>1</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

</project>
```

Let's go and download one dependency, for that we will go to MVN Repository and search for [***spring context***](https://mvnrepository.com/artifact/org.springframework/spring-context). Select a version and copy the code given, then we will paste it to the `pom.xml` file.

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>6.1.14</version>
    </dependency>
</dependencies>
```

After downloading the `.jar` files we will configure the application. Create a `spring.xml` file in the `src/main/java/` folder and add the following code.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd">

        <!--Bean definition for Alien class -->
        <bean id="alien" class="org.debarshee.Alien"></bean>

</beans>
```

Create a `Alien.java` file and add the following code.

```java
package org.debarshee;

public class Alien {
    public void information() {
        System.out.println("Hello, I am an Alien.");
    }
}
```

Now lets see how to use spring context to create an object of the class Alien. In the Main class copy the following code. Here we are creating a **Bean Factory object** which spring uses to create Objects.

```java
package org.debarshee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class Main {
    public static void main(String[] args) {
        System.out.println("This is a Maven Project.");

        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

        Alien object = (Alien) factory.getBean("alien");
        object.information();
    }
}
```

But the problem is that **XmlBeanFactory** has depretiated and is not used anymore. So we user Application Context Interface for creating an object.

```java
package org.debarshee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        System.out.println("This is a Maven Project.");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien object = (Alien) context.getBean("alien");
        object.information();
    }
}
```

---