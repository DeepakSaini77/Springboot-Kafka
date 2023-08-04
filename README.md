# Springboot-Kafka
Spring boot kafka application project explains How to publish message in kafka Topic and consume a message from Kafka Topic <br>
Message are fetched from client from api call <br>
producer who push the message to to kafka topic <br>
consumer to listen the message and dispaly the received message.
## Prerequisites
- [Java](https://www.w3schools.com/java/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/guides/index.html)
- [Zookeeper](https://zookeeper.apache.org/)
- [Kafka](https://kafka.apache.org/documentation/)

## Tools
- Eclipse or IntelliJ IDEA (or any preferred IDE)
- Maven
- Postman (or any RESTful API testing tool)
- Kafka

### Install Zookeeper
Step 1: Download apache-zookeeper-x.x.x from [Zookeeper site](https://zookeeper.apache.org/releases.html)

Step 2: Extract the folder at location c:\apache-zookeeper-x.x.x

Step 3: Add c:\apache-zookeeper-x.x.x\bin path as environment variable.

### Install Kafka
Step 1: Download kafka_x.xx-x.x.x from [Apache kafka site](https://kafka.apache.org/downloads)

Step 2: Extract the folder at location c:\kafka_x.xx-x.x.x

Step 3: Add c:\kafka_x.xx-x.x.x\bin path as environment variable.

#### Start the ZooKeeper and Kafka Server by using the below command
##### Start Zookeeper
Go where you have downloaded the kafka, exatract the zip file and open the /downloadDir/kafka-x.x.x 
and open terminal/command line and hit the command
> for windows
> ```
> .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
> ```
> for linux based os
> ```
> .\bin\zookeeper-server-start.bat .\config\zookeeper.properties
> ```

##### Start Kafka Server
Go where you have downloaded the kafka, exatract the zip file and open the /downloadDir/kafka-x.x.x  
and open terminal/command line and hit the command
> for windows
> ```
> .\bin\windows\kafka-server-start.bat .\config\server.properties
> ```
> for linux based os
> ```
> .\bin\kafka-server-start.bat .\config\server.properties
> ```

# Now let's Run the application

 ⚠️: **Before Running the application make sure zookeeper and Kafka are properly running.** 

Download this code from github and extract and open in an ide, and run the main function <br>
Now it is connected to kafka, you can see the topic name and group name <br>
**Message from API call :**
Open postman or just type this url in browser ``` localhost:8080/produceMsg?message=Your_message_here ``` <br>

And we were able to see the message.




