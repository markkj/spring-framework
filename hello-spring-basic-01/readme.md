Bean
 - @Component -> Where are the beans
 - @Autowired -> What are the dependencies of bean
 - root package -> Where to search the bean

Bean Scope
 - singleton (default) -> One instance per Spring context.
 - prototype -> New Bean whenever requested.
 - request -> One bean per HTTP requested.
 - session -> One bean per HTTP session.