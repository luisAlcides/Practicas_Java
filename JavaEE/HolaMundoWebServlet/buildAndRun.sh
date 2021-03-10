#!/bin/sh
mvn clean package && docker build -t com.gm.JavaEE/HolaMundoWebServlet .
docker rm -f HolaMundoWebServlet || true && docker run -d -p 9080:9080 -p 9443:9443 --name HolaMundoWebServlet com.gm.JavaEE/HolaMundoWebServlet