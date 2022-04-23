By defining a parameter to the method, we instruct Spring to provide us a bean of the type of that parameter from its context.
We can then use the provided bean(Parrot) when creating the second one(Person). This way we establish the has-A relationship 
between the two beans.

Here you'll find the definition of the configuration class. Take a look at the person() method. It now receives a parameter 
of type Parrot, and I set the reference of that parameter to the returned person's attribute. When calling the method, Spring 
knows it has to find a parrot bean in its context and injects its value into the parameter of the person() method. 

Previously, we used the word "inject" referring to what we will call from now as a Dependency Injection (DI). As its name 
suggests, DI is a technique involving the framework setting a value into a specific field or parameter.
In our case, Spring sets a particular value into the parameter of the person() method when calling it and resolves a 
dependency of this method. DI is an application of the IoC principle, and IoC implies that the framework controls 
the application at execution.

An application that's not using the IoC principle controls the execution and makes use of various dependencies.
An application using the IoC principle allows a dependency to control its execution.![image](https://user-images.githubusercontent.com/52591802/164884569-90d46977-d242-451c-9725-f9856674fb75.png)



