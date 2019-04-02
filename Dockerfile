FROM eugeneflexagon/adftomcat:2.0
RUN shopt -s globstar
RUN cp **/*.war /usr/local/tomcat/webapps/
