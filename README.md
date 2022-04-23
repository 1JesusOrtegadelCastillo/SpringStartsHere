Using @Autowired to inject the values through the constructor


The second option you have for injecting values into the object's attributes when Spring creates a bean is using the class constructor defining the instance.
This approach is the one used most often in production code and the one I recommend. It enables you to define the fields as final, ensuring no one can change 
their value after Spring initializes them. The possibility to set the values when calling the constructor also helps you when writing specific unit tests 
where you don't want to rely on Spring making the field injection for you (but more on this subject later).

When you define a parameter of the constructor, Spring provides a bean from its context as a value to that parameter when calling the constructor.

