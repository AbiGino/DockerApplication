FROM openjdk:17

RUN mkdir /usr/app

COPY target/sp_docker_app.jar  /usr/app

WORKDIR /usr/app

ENTRYPOINT ["java","-jar","sp_docker_app.jar"]