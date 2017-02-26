# SpringBootQuickStart

Following gr8 Spring Boot Tutorial from JavaBrains: https://www.youtube.com/playlist?list=PLmbC-xnvykcghOSOJ1ZF6ja3aOgZAgaMO

MADE WITH SPRING TOOL SUITE: http://spring.io/tools/sts

To run it from Spring Tool Suite (STS), just rigth-click on "CourseApiApp" class "Run AS.. > Java Application". A servlet container will be started using 8080 port by default

We're going to build a pretty simple "REST" API for Courses Management

RESOURCES
---------
* Topic
* Course
* Lesson

A Topic can have 0..N Courses and a Course can have 0..N Lessons

METHODS
-------

GET | /topics | Get all topics
GET | /topics/id | Get an specific topic info
POST | /topics | Create new topic
PUT | /topics/id | Update an specific topic
DELETE | /topics/id | Delete an specific topic
