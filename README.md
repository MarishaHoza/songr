# Songr
A basic webapp that will be useful for the next 5 CodeFellows 401 labs.
##### [Java Classes](/src/main/java/com/marishaoza/songr/) | [JUnit Tests](/src/test/java/com/marishaoza/songr/) | [Thymeleaf HTML Templates](src/main/resources/templates/)

-----------
# Overview:
### Lab 11: Building Full-Stack Web Apps
#### Feature tasks:
1. Ensure that you can run the Spring app.
2. Create a hello world route at `/hello`
3. Create a route that turns words into UPPER CASE
4. Create a route that reverses the order of the words in a query parameter
5. Write a unit test for the word reversing functionality of the above route


-----------
# Included Routes
* ### /
  A home directory with links to each of the other routes. These links include example parameters where mandatory.
* ### /hello
  Include an optional `name` query for a customized greeting.
  ```
  /hello?name=YourNameHere
  ```
* ### /capitalize/
  Include text to capitalize after the trailing `/`. This field is mandatory.
  ```
  /capitalize/your text goes here
  ```
* ### /reverse
  Include a `param` query to reverse your param text. This field is mandatory.
  ```
  /reverse?param=Text to reverse goes here
  ```

----------
# How to Run
### Option 1: IntelliJ
1. Navigate to your copy of the repository and open with IntelliJ
2. Open the src/main/java/com.marishaoza.songr/SongrApplication.java file
3. Click the small green arrows next to `public class SongrApplication`
4. Spring should run in your IntelliJ terminal
5. Look for a line near the bottom that says something like `Tomcat started on port(s): 8080 (http) with context path ''`
5. Open your browser and navigate to the local host port mentioned in your terminal. For example:
    ```
    http://localhost:8080/
    ```

### Option 2: Command Line
1. Open your command line terminal and navigate to your copy of the repository
2. Use the gradle bootRun command to start Spring
    ```
    $ gradle bootRun
    ```
3. Look for a line near the bottom that says something like `Tomcat started on port(s): 8080 (http) with context path ''`
4. Open your browser and navigate to the local host port mentioned in your terminal. For example:
    ```
    http://localhost:8080/
    ```

