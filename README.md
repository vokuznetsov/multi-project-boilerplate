# Multi-module boilerplate

The project is configured for following technological stack:

    Java 13
    Spring-boot: 2.3.0
    Gradle: 6.4
    Postgres: 10
    Lombok: 5.0.1
    
    // only in docker-compose
    Kafka: latest
    Zookeeper: latest

Plugins:

    Checkstyle: 8.32
    Spotbugs: 6.23.0
    PMD: 4.2.0
    
### How to run application

1. Compile project

    `./gradlew clean build`

2. Run application
    
    ``` gradle
    java -jar ./base/build/libs/base-*artifactVersion-from-build-gradle*.jar
    ````
    
    For example:
    ``` gradle
    java -jar ./base/build/libs/base-0.0.1-SNAPSHOT.jar
    ```

### How to check application

Request *http://localhost:8081/ (GET)*. You should get

    {
      "id": 1,
      "name": "boilerplate",
      "comment": "comment"
    }
    
#### Switch between branch to find other boilerplate configurations 
