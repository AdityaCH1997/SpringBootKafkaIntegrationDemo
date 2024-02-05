# SpringBootKafkaIntegrationDemo
Demo project to implement Apache Kafka using Spring Boot

## Prerequisites

- JDK
- Maven
- Apache Kafka
- IDE (Eclipse/Intellij IDEA/STS)

## Project Setup

1. **Clone the Repository**

    ```
    git clone https://github.com/AdityaCH1997/SpringBootKafkaIntegrationDemo.git
    cd SpringBootKafkaIntegrationDemo
    ```

2. **Build the Application**

   ```
   mvn clean install
   ```

3. **Start Zookeeper Service**

   Open a new Terminal/CLI and navigate to the locally installed kafka directory.

   For Mac/Linux:
   ```
   bin/zookeeper-server-start.sh config/zookeeper.properties
   ```
   For Windows:
   ```
   .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
   ```

   The service under default settings will start at port 2081

4. **Start Kafka Broker Service**

   Open a new Terminal/CLI and navigate to the locally installed kafka directory.

   For Mac/Linux:
   ```
   bin/kafka-server-start.sh config/server.properties
   ```
   For Windows:
   ```
   .\bin\windows\kafka-server-start.bat .\config\server.properties
   ```

   The service under default settings will start at port 9092

5. **Bootstrap the Spring Boot Application**

   Opening the Project 'SpringBootKafkaIntegrationDemo' directory in any IDE and starting(build and run) the application will work. To do the same from Terminal/CLI execute the below commands:

   Open a new Terminal/CLI and navigate to the local Project directory.
   
   Build the Project:
   ```
   mvnw package
   ```

   Run the Application:
   ```
   java -jar target/SpringBootKafkaIntegrationDemo.jar
   ```

   The Application under default settings will start at port 8080

## Configuration

   - **Spring Boot:**
    - Modify `application.properties` or `application.yml` in the Spring Boot application for server, consumer and producer configurations.

## Usage

   - The Application interacts with Kafka when the exposed APIs are called and publish messages to specific Kafka topics in the Kafka broker which is then consumed by the Kafka Consumers from the Consumer Group.

## Termination

   - After usage kill all the running services and the application using ```Ctrl + C```.
