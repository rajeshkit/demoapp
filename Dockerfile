FROM openjdk:11
COPY ./target/demoapp.jar demoapp.jar
EXPOSE 9999
CMD ["java","-jar","demoapp.jar"]