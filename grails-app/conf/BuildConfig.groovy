grails.project.work.dir = "target"
grails.project.dependency.resolver = "maven"

grails.project.dependency.resolution = {
    inherits "global"
    log "warn"
    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    plugins {
        build(":release:3.0.1", ":rest-client-builder:1.0.3") {
            export = false
        }
        test ":hibernate:3.6.10.9", {
            export = false
        }
    }
}
