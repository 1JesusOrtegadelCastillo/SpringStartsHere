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
