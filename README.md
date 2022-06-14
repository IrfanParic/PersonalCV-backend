# IRFANPARIC - PersonalCV-backend

Personal CV backed was initialized using [Java Spring](https://spring.io) and [PostgreSQL](https://www.postgresql.org). It is used to get necessary information from database and forward it to fronted so it can be appropriately displayed.

## Build

Backend part of this application is initialized using Spring Initializr using the following link: https://start.spring.io/ where name of project, description of project and package chosen as Jar were stated. Type of project is Maven Project and selected language is Java. Moreover, it is unnecessary to use Java vesrion 17.

Next step is to add two dependencies:
- Spring Web which uses REST and Tomcat as a default embedded server and pulls in all dependencies related to web development. Second dependency is Lombok which helps to reduce boilerplate code.
Have an IDE installed (such as Intellij).
- Clone this repository using the following command: git clone https://github.com/AmilM7/ress-backend.git
- After clonning the repository, open the pom.xml file in the IDE and confirm to open it as a project.
- Click the run/debug icon or Shift+F10 on the keyboard.
- The application is running in your browser at localhost:8080.

## Deployment

This application is deployed on [Heroku](https://www.heroku.com).
