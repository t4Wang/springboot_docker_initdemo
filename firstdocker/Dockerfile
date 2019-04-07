# 使用最新版jdk（jdk12）作为父镜像
FROM openjdk
# 映射/var/lib/docker下的应用程序临时文件到/tmp目录下
VOLUME /tmp
# pom里配置的参数 实际生成的spring boot jar包
ARG JAR_FILE
# 把jar包拷贝到容器目录下名为app.jar
COPY ${JAR_FILE} app.jar
# 命令行实际执行的命令
ENTRYPOINT ["java","-jar","/app.jar"]
# 容器对外开放8080端口
EXPOSE 8080