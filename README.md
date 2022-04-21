Changes:

Is it possible to add multiple instances of the same type?

Yes it is, each object instance (Bean) will have a uniqe identifier and in order to refer to them after,
you'll need to use the bean's identifiers.

Do not confuse the name of the Bean (Parrot) with the name of the Parrots (Rengoku, Rick and Peacemaker).

In this exercise, we will name the new Beans as parrot2 and parrot3, since we are going
to have 3 different parrots of the same type.

parrot1, parrot2, parrot3 are the identifiers Spring context will use, not the name you assign to the name attribute.

Important!!

Now, since you have 3 different Beans of the same type, you can not get the beans from the context anymore by
only specifying the type. If you do so, you'll get an exception because Spring cannot guess which instance you are
calling.

This is an ambiguity problem, to solve it you need to refer precisely to one of the instances by using the bean name.
See how its done in the main class.
