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
### Lab 12: Spring MVC with Databases
#### Feature tasks:
1. Create an `Album` model.
    * An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
2. A user should be able to see information about all the albums on the site.
3. A user should be able to add albums to the site.


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
* ### /albums
  View a list of all albums. Add new albums with an input form. Delete an album once created with the `Delete Album` button. This route has data persistance from your PostgreSQL database.

----------
# How to Run
### Option 1: IntelliJ
1. Navigate to your copy of the repository and open with IntelliJ
2. Create a new PostgreSQL database if needed
    1. Type `psql` in your terminal and enter your login credentials if needed.
    2. Type `CREATE DATABASE albums;`
    3. You should get the response: `CREATE DATABASE`. If so, exit psql by typing `\q`. 
2. Open the [src/main/resources/application.properties](src/main/resources/application.properties) file
    1. The file should contain the following code:
        ```
        spring.datasource.url=jdbc:postgresql://localhost:5432/albums
        spring.datasource.username=marishoz
        #spring.datasource.password=postgrespassword
        #spring.jpa.hibernate.ddl-auto=create
        ```
    2. Replace variables as needed
        1. Line 1: Database name `albums` should be replaced if you created a database with a different name above
        2. Line 2: Username `marishoz` should be replaced with your postgres username
        3. Line 3: If you are on a windows/linux machine, `postgrespassword` should be replaced with your postgres password, and you should remove the `#` at the start of the line which signifies commented out code. If you are on a mac, this step is not required.
        4. Line 4: Remove the `#` at the start of the line (this signifies commented out code) __only for the first time you run the application__. After your initial run, comment this line out again, or you will not have data persistance between runs.
2. Open the [src/main/java/com.marishaoza.songr/SongrApplication.java](src/main/java/com.marishaoza.songr/SongrApplication.java) file
3. Click the small green arrows next to `public class SongrApplication`
4. Spring should run in your IntelliJ terminal
5. Look for a line near the bottom that says something like `Tomcat started on port(s): 8080 (http) with context path ''`
5. Open your browser and navigate to the local host port mentioned in your terminal. For example:
    ```
    http://localhost:8080/
    ```

### Option 2: Command Line
1. Open your command line terminal and navigate to your copy of the repository
2. Create a new PostgreSQL database if needed
    1. Type `psql` in your terminal and enter your login credentials if needed.
    2. Type `CREATE DATABASE albums;`
    3. You should get the response: `CREATE DATABASE`. If so, exit psql by typing `\q`. 
2. Open the [src/main/resources/application.properties](src/main/resources/application.properties) file
    1. The file should contain the following code:
        ```
        spring.datasource.url=jdbc:postgresql://localhost:5432/albums
        spring.datasource.username=marishoz
        #spring.datasource.password=postgrespassword
        #spring.jpa.hibernate.ddl-auto=create
        ```
    2. Replace variables as needed
        1. Line 1: Database name `albums` should be replaced if you created a database with a different name above
        2. Line 2: Username `marishoz` should be replaced with your postgres username
        3. Line 3: If you are on a windows/linux machine, `postgrespassword` should be replaced with your postgres password, and you should remove the `#` at the start of the line which signifies commented out code. If you are on a mac, this step is not required.
        4. Line 4: Remove the `#` at the start of the line (this signifies commented out code) __only for the first time you run the application__. After your initial run, comment this line out again, or you will not have data persistance between runs.
2. Use the gradle bootRun command to start Spring
    ```
    $ gradle bootRun
    ```
3. Look for a line near the bottom that says something like `Tomcat started on port(s): 8080 (http) with context path ''`
4. Open your browser and navigate to the local host port mentioned in your terminal. For example:
    ```
    http://localhost:8080/
    ```

# Resources:
* [Override PUT to DELETE in HTML](https://dev.to/moz5691/method-override-for-put-and-delete-in-html-3fp2)
