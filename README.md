# Project: TestTask
#### Order from: TrafficDNA
#### Order Executor: Yavorskiy Dmytro
The main purpose of the application is to document and store information about the results of users. Diluted by levels.
### Description of the project
1. The project was implemented using the Java Spring framework.
2. The following materials were used:
   1. org.springframework.boot:spring-boot-starter-web:2.6.3
   2. org.projectlombok:lombok:1.18.22
   3. org.springframework.boot:spring-boot-devtools:2.6.3
   4. org.springframework.boot:spring-boot-starter-test:2.6.3
3. Gradle chose the compilation environment because the compilation speed is faster than Maven's.
4. Implemented 3 prime requests: 
   1. Get /userinfo/{user_id} - returns the top 20 user results at all levels in descending order result, level_id (format: JSON).
   2. Get /levelinfo/{level_id} - returns the top 20 users and their results at the selected level in descending order result, user_id (format: JSON).
   3. Put /setinfo - takes 3 parameters in json (user_id, level_id, result) sets the result of the user on the level.

### Start-up instructions
1. To run the application you need to use Intellij Idea
2. You can use Postman for easy verification. The application also works in standard browsers. 
   The list of requests for testing all calls is presented in the file:
   [trafficDNATestTask.postman_collection.json](trafficDNATestTask.postman_collection.json)
