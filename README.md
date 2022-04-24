Spring needs to inject a value into a parameter or class but has multiple beans of the same type to choose from. 
Say you have three Parrot beans in the Spring context. You configure Spring to inject a value of type Parrot into 
a parameter. How will Spring behave? Which of the beans of the same type would the framework choose to inject in such scenario?

Depending on your implementation, you have the following cases:

	1. The identifier of the parameter matches the name of one of the beans from the context(which, remember, is the same as the name 
  of the method annotated with @Bean that returns its value). In this case, Spring will choose the bean for which the name is the 
  same as the parameter.
	2. The identifier of the parameter doesn't match any of the bean names from the context. then you have the following options:
		○ You marked one of the beans as @Primary, in this case, Spring will select the primary bean for injection.
		○ You can explicitly select a specific bean using the @Qualifier annotation.
If none of the beans is @Primary and you don't use @Qualifier, the app will fail with an exception, complaining that the context 
contains more beans of the same type and Spring doesn't know which one to choose.

In real-world scenario, I prefer to avoid relying on the name of the parameter, which could be easily refactored and changed 
by mistake by another developer. To feel more comfortable, the author usually choose a more visible approach to express his 
intentions to inject a specific bean: using @Qualifier annotation. There are developers arguing for and against using the @Qualifier annotation. 
The author feels it's better to use in this case because it clearly defines your intention. Other developers believe adding this annotation 
creates unneeded (boilerplate) code.

