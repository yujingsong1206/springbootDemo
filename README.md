# springboot演示
1.项目属性配置
默认resources下会有一个application.properties文件，在里面设置相应属性也没问题。但还是建议使用yml文件。
具体配置查看application-dev.yml/application-prod.yml文件，同时建议配置分组。
server:
  port: 8081  #tomcat启动端口 默认8080
  context-path: /springbootdemo  #启动项目名字（前缀）

cupSize : B  #自定义变量，使用方法在@RestController类里使用@Value("${cupSize}") private String cupSize;
若使用的是类似类的自定义变量，需要创建一个class并且加入@Component @ConfigurationProperties(prefix = "girl")这2个注解。使用的时候，加@Autowired注解即可。
