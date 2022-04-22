Stereotype annotations.

@Component

Let's say that you have marked the class as a component. When the app creates the Spring context, Spring
creates an instance of the class you marked as a component and adds that instance to its context.

@ComponentScan

Using this annotation over the configuration class, instruct Spring on where to find these classes you've
marked with @Component.


When using stereotype annotations, consider two steps:

	1.   Use the stereotype annotation @Component to annotate the class for which you want Spring to add a bean to
	     its context.

	2. Since Spring doesn't search for classes annotated with stereotype annotations, use the @ComponentScan
	    annotation to tell Spring where to look for classes annotated with stereotype annotations.

Using the @Bean annotation

Advantages: 

	1. You have full control over the instance creation you add to the Spring context. It is your responsibility to create and configure the instance in the body of the method annotated with @Bean. Spring only takes that instance and adds it to the context as-is. 
	2. You can use this method to add more instances of the same type to the Spring context. 
	3. You can use the @Bean annotation to add to the Spring context any object instance. The class that defines the instance doesn't need to be defined in your app (as we did adding a String and an Integer method in the branch 
	spring-context-exercise-2).

Disadvantages:

	1. You need to write a separate method for each bean you create, which adds boilerplate code to your app.
	For this reason, @Bean is used as a second option to stereotype annotations in our projects.
	
	
Using Stereotype annotations (@Component):

Advantages:

You only have control over the instanc![image](https://user-images.githubusercontent.com/52591802/164608178-de40d3a7-2f57-4e61-814b-f99fdad349ee.png)
