FROM openjdk:11
COPY ./target/demoapp-jar-with-dependencies.jar demoapp-jar-with-dependencies.jar
EXPOSE 9999
CMD ["java","-jar","demoapp-jar-with-dependencies.jar"]