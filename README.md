Programmatically adding beans to the Spring Context

You'd this approach when you want to implement a custom way of adding beans to the context and the @Bean of the stereotype annotations are not enough for your needs. Say you need to register specific beans in the Spring context depending on specific configurations of our application. With the @Bean and stereotype annotations, you can implement most of the scenarios, but you can't do something like this:

if(condition){
registerBean(bean1);
} else {
registerBean(bean2);
}

If the condition is true, add bean1 to Spring context, if not, add bean2. 

Note: you can only use this approach with Spring 5 or above. ![image](https://user-images.githubusercontent.com/52591802/164621875-f7a93971-0716-4061-a3e6-a64ef513ba87.png)
