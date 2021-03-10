@echo off
call mvn clean package
call docker build -t com.gm.JavaEE/HolaMundoWebServlet .
call docker rm -f HolaMundoWebServlet
call docker run -d -p 9080:9080 -p 9443:9443 --name HolaMundoWebServlet com.gm.JavaEE/HolaMundoWebServlet