# 开发日志
---
## 需要添加的功能
- [x] 将异常报错添加到数据库中
- [ ] 将当前用户信息记录到缓存/全局变量中，这个变量在日志记录等多处地方都用所调用
- [x] url拦截器，登录显示
- [ ] 将常用util组件放到common模块中，并测试通过
- [ ] 添加locator.getBean()功能
- [x] 操作log入库，实现显示用户操作记录，这个对性能有所影响
- [x] 添加activeMq消息队列,并支持分布式
- [x] 添加quartz，并支持分布式
- [ ] 添加用户和权限模块
- [ ] 多数据源配置
- [ ] excel 数据表导出功能
- [ ] shiro 权限管理
- [ ] activiti 工作流管理
- [ ] mybatis 分页插件的使用
- [ ] 使用规范的controller返回方式，可以参照《阿里巴巴Java技术规范》
- [ ] 将httpClient加入项目中
- [x] [处理mybatis分页tag，学习mybatisHelper分页功能](http://blog.csdn.net/isea533/article/details/28921533)
- [x] 出掉所有标签，调整结构
- [ ] 多数据源的支持


---

- 分页插件
经测试，分页插件自动为你的sql添加limit条件，也就是说，使用方法select**list并不会查出所有的大list对象，这正是我期望看到的！