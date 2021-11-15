FROM openjdk:11
EXPOSE 8090
ADD target/Automobile.war Automobile.war
ENTRYPOINT ["java","-jar","Automobile.war"]