# springboot联动actuator开发
- 原代码 https://github.com/xuwujing/springBoot-study
- 在maven导入依赖包spring-boot-starter-actuator
- 在application.xml中配置management.security.enabled= false 关闭安全认证
- 设置management.port: 8888 管理端口
- context-path: /monitor actuator的访问路径
- 启动项目，localhost/health 可以得到磁盘检测和数据库检测等信息
  - /beans 可以得到bean的别名、类型、是否单例、类的地址、依赖等信息
  - /info 可以得到自定义的配置信息
