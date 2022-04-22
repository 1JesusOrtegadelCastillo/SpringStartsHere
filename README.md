#Implementing relationships among beans defined in the configuration file

Say we have two instances in the Spring context: a parrot and a person. We'll create and add these instances to the context.
We want to make the person own the parrot. In other words, we need to link the two instances.
This straightforward example helps us discuss the two approaches for linking the beans in the Spring context without adding 
unnecessary complexity and enables you to focus on the Spring configurations only.

So, for each of the two approaches (wiring and auto-wiring), we have two steps:

	1- Add the person and parrots beans to the Spring context.
	2- Establish a relationship between the person and the parrot.

Having two beans in the Spring context, we want to establish a relationship between them. We do this so that one object can 
then delegate to the other in the implementation of their responsibilities. You can do this using a wiring approach, which 
implies directly calling the methods that declare the beans to establish the link between them, or through auto-wiring. 
You use the framework's dependency injection capabilities.


