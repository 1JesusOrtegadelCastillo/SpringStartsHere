Stereotype annotations.

@PostConstruct

Using this annotation, you can manage an instance after its creation. Remember that with stereotype annotations you don't have
full control over your object instances over the creation. Using @Bean, we are able to define a name for each of the Parrot objects (see branch 1 to 4),
but using @Component, we didn't get a chance to do something after Spring called the constructor of the Parrot class. 

What if we want to execute some instructions right after Spring creates the bean? we can use @PostConstruct annotation.

Spring borrows the @PostConstruct annotation from Java EE. We can also use this annotation with Spring beans to specify a set of instructions 
Spring executes after the bean creation. You just need to define a method in the component class and annotate that method with @PostConstruct, 
which instructs Spring to call that method after the constructor finishes its execution.

Note: if you are using a Java version smaller than Java 11, you don't need to add the dependency because it was inside the JDK. 
In Java 11 and above, the JDK was cleaned of the API's not related to SE, including the Java EE dependencies so if you want to use functionalities
that were part of the removed APIs (like @PostConstruct), you now need to explicitly add the dependency in your app. 

Dependency:

<dependency>
<groupId>javax.annotation</groupId>
<artifactId>javax.annotation-api</artifactId>
<version>1.3.2</version>
</dependency>


