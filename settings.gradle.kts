dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("ktor", "2.3.0")
            library("ktor-server-netty", "io.ktor", "ktor-server-netty").versionRef("ktor")
        }
    }
}
