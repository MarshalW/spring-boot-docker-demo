# todo

mvn clean spring-boot:run -P prod  -Dspring-boot.run.jvmArguments="-DMYSQL_URL=jdbc:mysql://localhost:3306/db_example"

MYSQL_URL=jdbc:mysql://localhost:3306/db_example java -jar target/spring-boot-0.0.1-SNAPSHOT.jar

- 运行时传递mysql 密码等
- docker mysql
- 缩小mysqldb用户权限，不可drop table等，通过docker