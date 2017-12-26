# 开发日志

## 技术架构
- [x] 将异常报错添加到数据库中
- [ ] 将当前用户信息记录到缓存/全局变量中，这个变量在日志记录等多处地方都用所调用
- [x] url拦截器，登录显示
- [ ] 将常用util组件放到common模块中，并测试通过,不断完善
- [x] 添加locator.getBean()功能
- [x] 操作log入库，实现显示用户操作记录，这个对性能有所影响
- [x] 添加activeMq消息队列,并支持分布式
- [x] 添加quartz，并支持分布式
- [ ] 添加用户和权限模块
- [x] 多数据源配置，需要使用ThreadLocal的知识
- [ ] excel 数据表导出功能(POI)
- [ ] [Shiro或Spring Security进行权限管理](https://www.cnblogs.com/aoeiuv/p/5868128.html)
- [ ] activiti 工作流管理
- [x] [mybatis 分页插件的使用](http://blog.csdn.net/isea533/article/details/28921533)
- [ ] 使用规范的controller返回方式，可以参照《阿里巴巴Java技术规范》
- [x] 将httpClient加入项目中
- [x] 自定义分页tag
- [x] 出掉所有标签，调整结构
- [x] [使用AOP技术打印日志信息](http://blog.didispace.com/cxy-wsm-zml-3/)
- [x] 支持上传图片等文件到项目（或数据库、文件系统）
- [ ] 下载pdf等功能
- [ ] 支持Dubbo分布式框架
- [ ] 支持redis缓存分布式
- [ ] 尽量使用RESTful API的服务接口
- [ ] 添加base64加密
- [ ] 使用设计模式代替条件判断（状态模式/策略模式）
- [ ] [使用注解](http://www.jasongj.com/2016/01/17/Java1_%E6%B3%A8%E8%A7%A3Annotation/)
- [ ] 使用java.lang.Objects来控制NPE异常
- [ ] 使用ThreadPoolExecutor
- [x] 参照[《编写 Spring 配置文件的13个最佳实践》](https://dev-cheats.com/java/best-practices-for-writing-spring-configuration-files.html)
- [ ] 测试[NIO](http://ifeve.com/java-nio-all/)
- [ ] 将 Evernote 中的常用组件迁移到项目中来
- [x] 定义一个全局异常类ExceptionResolver，出现异常走这个接口




---

- 分页插件
经测试，分页插件自动为你的sql添加limit条件，也就是说，使用方法select**list并不会查出所有的大list对象，这正是我期望看到的！
