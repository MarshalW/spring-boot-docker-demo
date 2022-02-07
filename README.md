# spring boot docker example

一个最简单的 spring boot 实例，基于 docker:

- 最简单的jpa示例
- profile 在 dev 时使用默认 h2 数据库
- profile 在 prod 时使用 mysql 数据库
- 示例可构建为 docker image
- 可在 docker-compose 启动 mysql 和 demo
- 通过 docker-compose 启动时，可使用环境变量，设置在 .env 文件中

## 运行

需要提前安装了：

- java 11
- maven
- docker / docker-compose

运行：

```shell
$ mvn clean package -P prod -Dmaven.test.skip && docker build --no-cache  . -t spring-boot-demo 
```

通过 [http://localhost:8080/db](http://localhost:8080/db) 访问