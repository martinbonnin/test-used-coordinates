plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.apollographql.apollo3.external")
}


apollo {
    service("service1") {
        generateApolloMetadata.set(true)
        srcDir("graphql1")
        packageName.set("com.example1")
        generateDataBuilders.set(true)
    }
    service("service2") {
        generateApolloMetadata.set(true)
        srcDir("graphql2")
        packageName.set("com.example2")
        generateDataBuilders.set(true)
    }
}

dependencies {
    add("apolloService1UsedCoordinatesConsumer", project(":feature1"))
    add("apolloService2UsedCoordinatesConsumer", project(":feature2"))
}

println(configurations.get("apolloService1UsedCoordinatesConsumer").files)