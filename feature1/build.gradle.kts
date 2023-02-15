plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.apollographql.apollo3.external")
}

apollo {
    service("service1") {
        srcDir("graphql1")
        packageName.set("com.example1")
        generateDataBuilders.set(true)
    }
}

dependencies {
    implementation(project(":schema"))

    add("apolloService1Consumer", project(":schema"))
    add("apolloService1SchemaConsumer", project(":schema"))
}
