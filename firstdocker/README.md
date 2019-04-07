# linux centos7 部署docker spring boot容器

前置需求：linux服务器部署好docker，java，maven
1. 新建spring boot项目，添加web依赖，创建一个controller
2. 修改pom，添加docker插件
3. 创建Dockerfile（2，3两步可参考我的示例项目[springboot_docker_initdemo](https://github.com/t4Wang/springboot_docker_initdemo)，里面有详细参数
4. 将整个项目里面的内容拷贝到linux上自己创建的文件夹之内，Dockerfile也放在项目文件夹内
5. 在项目当前文件夹内执行 `mvn install -DskipTests dockerfile:build` 来编译项目并构建docker镜像
6. 现在docker镜像已经创建好了，也可以用docker push推送到镜像仓库，要执行容器的话，命令行执行 
`docker run -e "SPRING_PROFILES_ACTIVE=prod" -p 9090:8080 -t ieatpotato/firstdocker`
-e 是传给spring boot的启动项参数，这里可选 -p是将linux机的9090端口映射到容器的8080端口，实际访问使用9090，-t是指明容器启动的docker镜像

> 参考 [spring boot 官方docker指引](https://github.com/spring-guides/gs-spring-boot-docker)
