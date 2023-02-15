plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.apollographql.apollo3.external")
}

apollo {
    service("service2") {
        srcDir("graphql2")
        packageName.set("com.example2")
        generateDataBuilders.set(true)
    }
}

dependencies {
    implementation(project(":schema"))

    add("apolloService2Consumer", project(":schema"))
    add("apolloService2SchemaConsumer", project(":schema"))
}
