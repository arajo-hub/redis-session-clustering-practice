FROM openjdk:11-jdk
LABEL maintainer="joara9566@naver.com"
ARG JAR_FILE=build/libs/sessionclustering-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} session-clustering.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/session-clustering.jar"]