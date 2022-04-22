- Wiring

Here we'll establish the relationship between the two instances of Person and Parrot. The first way (wiring) to achieve
this is to call one method from another in the configuration class. You'll find this often used because it's a
straightforward approach.

Wiring approach implies calling the method that returns the bean you want to set directly. You need to call this
method from the one that defines the bean for which you set the dependency.

We now observe the relationship between the person and the parrot has been established.

Doesn't this mean that we have created two instances of Parrot, once instance Spring creates and adds into its
context and another one when the person() method makes the direct call to the parrot() method?

No.

If the parrot() bean already exists in the context, then instead of calling the parrot() method, Spring will directly
take the instance from its context.  If the parrot() bean doesn't exist yet in the context, Spring calls the parrot()
method, add the value it returns to Spring context, and return the value to the actual call made from the person()
method.

When two methods annotated with @Bean call each other, Spring knows you want to create a link between the beans.
If the bean already exists in the context, Spring returns the existing bean without forwarding the call to the
@Bean method. If the bean doesn't exist, Spring creates the bean and return its reference.
