# spring
## Spring是一个基于IOC和AOP的结构J2EE系统的框架
### IOC 反转控制 Inversion Of Control<br>
简单说就是创建对象由以前的程序员自己new 构造方法来调用，变成了交由Spring创建对象<br>
### DI 依赖注入 Dependency Inject<br>
简单地说就是拿到的对象的属性，已经被注入好相关值了，直接使用即可。<br>
<br>
### spring项目简介：<br>
基于注解方式的IOC、DI、AOP、测试。<br>
> 1，applicationContext.xml中主要配置相关语句扫描某些包下的注解：<br>
>>> <context:component-scan base-package="com.how2java.pojo"><br>
>>> <context:component-scan base-package="com.how2java.aspect"/><br>
>>> <context:component-scan base-package="com.how2java.service"/><br>
以及AOP注解：<br>
>>> <aop:aspectj-autoproxy/> <br>
> 2，com.how2java.pojo包中主要有Category和Product两个类，基于@Component注解得到两个bean：c和p。Product中基于@Autowired自动注入c。<br>
> 3，com.how2hava.service包中ProductService类中基于@Component注解得到ps，doSomeThing方法输出一句话，该类主要练习AOP<br>
> 4，com.how2java.aspect包中LoggerAspect类基于@Around(value = "execution(* com.how2java.service.ProductService.*(..))")注解实现AOP，对com.how2java.service.ProductService这个类中的所有方法进行切面操作 <br>
> 5，com.how2java.test包中的TestSpring类基于@Autowired自动注入p和ps，基于@test注解输出p的name属性、p所在c的name的属性，执行doSomeThing方法测试AOP效果。
