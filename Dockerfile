FROM openjdk:17

WORKDIR /usr/src/myapp
COPY target/backend-0.0.1-SNAPSHOT.jar /usr/src/myapp

EXPOSE 5578

CMD ["java", "-jar" , "backend-0.0.1-SNAPSHOT.jar"]
