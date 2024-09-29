# PostgresSpring
I tried connecting postgress with springboot and tested the flow using CRUD with swagger

Create postgres Db in docker 

~ docker run --name my-postgres-db -e POSTGRES_DB=mydb -e POSTGRES_USER=postgresatul -e POSTGRES_PASSWORD=atul -v pgdata:/var/lib/postgresql/data -p 5432:5432 -d postgres

--name my-postgres-db -- this is name of of image
mydb - DB name 
postgresatul - username
atul - pwd
-v pgdata:/var/lib/postgresql/data  - sets volume for the data stored and thus after restarting the data retains

inside bash - root@c7fbf8cb2e19:/var/lib/postgresql/data

-d postgres - downloads the latest postgres image from DockerHub

~ docker ps
~ docker kill <containerId>   - c7fbf8cb2e19

~ docker exec -it my-postgres-db bash

Interact with docker image as bash

for Spring boot  added - spring-boot-starter-data-jpa, postgresql, lombok

