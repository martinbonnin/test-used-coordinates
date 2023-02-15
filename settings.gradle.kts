include(":schema", ":feature1", ":feature2")

pluginManagement {
    listOf(repositories, dependencyResolutionManagement.repositories).forEach {
        it.apply {
            mavenCentral()
            mavenLocal()
        }
    }
}