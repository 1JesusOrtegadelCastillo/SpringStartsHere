Also, you can set a name to a @Bean using name = "", value = "" or just writing the @Bean name inside ""

Ex: @Bean(value = "name")
    @Bean(name = "name")
    @Bean("name")

and then, you can use that name to call a @Bean from the Spring Context.
