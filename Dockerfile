FROM openjdk:11
EXPOSE 8090
ADD target/automobile.war automobile.war
ENTRYPOINT ["java","-jar","automobile.war"]