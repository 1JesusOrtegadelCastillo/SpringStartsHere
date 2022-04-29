In this section, we apply the Spring framework over  the class design we implemented in the last section. Using this example, 
we can discuss how Spring manages dependency injection when using abstractions. 

Deciding which objects should be part of the Spring Context


It's not difficult to answer this question for our scenario, as the only Spring feature we use is the DI. In our case, we need 
to add the object to the Spring context if it either has a dependency we need to inject from the context or if it's a dependency 
itself. Looking at our implementations, you'll observe that the only object that doesn't have a dependency and is also not a 
dependency itself is Comment. The other objects in our class design are as follows:

	• CommentService - Has two dependencies, the CommentRepository and the CommentNotificationProxy
	• DBCommentRepository - Implements the CommentRepository interface and is a dependency of the CommentService
	• EmailCommentNotificationProxy - Implements the CommentNotificationProxy interface and is a dependency of the CommentService


Observe that we don't add stereotype annotation to the interfaces.
We use stereotype annotations for the classes that Spring needs to create instances and add these instances to its context. 
It doesn't make sense to add stereotype annotations on interfaces or abstract classes because these cannot be instantiated. 
Syntactically, you can do this, but it's not useful. 


NOTE 
In this example, I use the basePackages attribute of the @ComponentScan annotation. Spring also offers the feature of directly 
specifying the classes(by using the basePackagesClasses attribute of the same annotation). The advantage of defining the packages 
is that you only have to mention the package name. In case it contains 20 classes with @Component, you write only one line 
(the name of the package) instead of the 20 classes. The disadvantage is that if a developer renames the package, they might not 
realize they also have to change the value of the @ComponentScan annotation. Mentioning the classes directly, you might write more, 
but when someone changes the code, they immediately see they also need to change the @ComponentScan annotation; otherwise, 
the app doesn't compile. In a production application, you might find both approaches.

