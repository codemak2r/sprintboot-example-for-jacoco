FROM openjdk:8-jdk-alpine

ADD target/demo-0.0.1-SNAPSHOT.jar app.jar
ADD jacocoagent.jar jacocoagent.jar
ENV JAVA_OPTS="-javaagent:jacocoagent.jar=includes=*,output=tcpserver,append=true,address=0.0.0.0,port=6300"
ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar
