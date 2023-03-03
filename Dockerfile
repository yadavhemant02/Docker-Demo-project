FROM openjdk:11

WORKDIR C:\Users\hemantyadav02\Documents\workspace-spring-tool-suite-4-4.15.3.RELEASE\emailsend\backend-0.0.1-SNAPSHOT.jar

COPY . .

CMD ["java","-jar","backend-0.0.1-SNAPSHOT.jar"]