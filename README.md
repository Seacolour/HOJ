# 介绍
此项目是一个OJ系统，在系统前台，管理员可以创建、管理题目；用户可以自由搜索题目、阅读题目、编写并提交代码。<br>
在系统后端，能够根据管理员设定的题目测试用例在**代码沙箱**中对代码进行编译、运行、判断输出是否正确。
其中，代码沙箱可以作为独立服务，提供给其他开发者使用 <br>
共分为四个部分，分别是微服务后端、前端、代码沙箱，以下链接分别对应这几个部分：<br>
1.https://github.com/Seacolour/HOJ <br>
2.https://github.com/Seacolour/HOJ-frontend <br>
3.https://github.com/Seacolour/HOJ-Code-sandbox <br>
# 业务流程图
![微信截图_20240825173219](https://github.com/user-attachments/assets/b8af337e-bbbc-4d25-a2a5-b4f6daf9d381)
# 技术栈
### 1）前端
 * Node.js 18.17.1
 * Vue3
 * TypeScript
 * Arco Design 组件库
 * webstorm 在线代码编辑组件
 * OpenApi 自动生成调用后端接口的方法
   - https://github.com/ferdikoomen/openapi-typescript-codegen
### 2）后端
 * Java 1.8
 * Spring Boot 2.6.13
 * Spring Cloud Alibaba 2021.0.5.0
 * Spring Cloud Gateway
 * MySQL 5.7
 * Redis 6.0.10
 * RabbitMQ 3.8.8
 * Nacos 2.2.0
 * Seata 1.3.0
 * Sentinel Dashboard 1.7.0
