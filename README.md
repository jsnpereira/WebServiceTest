# WebServiceTest
This repository is developing in future the test against API service with Jersery Framework because I need to learn more about the test tools.

## the port
the container are export the ports are:

* 8080: default tomcat port
* 8009: default tomcat Debug port

More important you have remember that you can to access the URL this ports.

## How to build the container.

You should run the build an container using the command like:
```
docker build -t webservice .
```

## How to run the container.
You should run a container using the command like:
```
docker run -d -p 8080:8080 -p 8009:8009 --name=testwebservice webservice
```

### How to access tomcat server
You access an URL as "http:localhost:8080" and showing the site tomcat administrator server.

## How access in the app to get
Link: http://localhost:8080/WebServiceTest-qa/rest/persona/get

## How access with create username to post
Put the json format
```
{"email": "jeison.pereira@gmail.com","name": "Jeison Pereira"}
```
Link: http://localhost:8080/WebServiceTest-qa/rest/persona/post

### Reference
* [Git hub](https://github.com/cmoro-deusto/docker-tomcat8)
* [docker a beginner guide](https://www.pluralsight.com/guides/devops/docker-a-beginner-guide)
* [apache tomcat meets docker](https://jaxenter.de/apache-tomcat-meets-docker-webanwendungen-als-docker-images-herstellen-23213)
