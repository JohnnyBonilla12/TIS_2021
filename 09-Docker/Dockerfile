#from maria-java
#add mensajes-0.0.1-SNAPSHOT.jar /app/mensajes-0.0.1-SNAPSHOT.jar
#add mensajes_2021_mat.sql /app/mensajes_2021_mat.sql
#workdir /app
#cmd ["java","-jar","mensajes-0.0.1-SNAPSHOT.jar"]
#cmd ["/usr/bin/mysqld_safe", "&"]
#run /etc/init.d/mysql start

#from mensajes
#Error en la importacion del SCRIPT, debido a incompatibilidad
#entre DOS y BASH
#add script.sh /app/script.sh
#run chmod 755 /app/script.sh


from script
cmd ["/app/script.sh"]
expose 8080