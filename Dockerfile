FROM jsnpereira/tomcat:v8.0.44
MAINTAINER Jeison Pereira

ADD /target/WebServiceTest-qa.war /opt/tomcat/webapps

CMD ["/opt/tomcat/bin/catalina.sh","run"]
