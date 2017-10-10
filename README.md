# springboot演示
项目属性配置<br/>
默认resources下会有一个application.properties文件，在里面设置相应属性也没问题。但还是建议使用yml文件。<br/>
具体配置查看application-dev.yml/application-prod.yml文件，同时建议配置分组。<br/>
server:<br/>
&nbsp;&nbsp;  port: 8081  #tomcat启动端口 默认8080<br/>
&nbsp;&nbsp;  context-path: /springbootdemo  #启动项目名字（前缀）<br/>

cupSize : B  #自定义变量，使用方法在@RestController类里使用<br/>@Value("${cupSize}") <br/>private String cupSize;<br/>
若使用的是类似类的自定义变量，需要创建一个class并且加入@Component @ConfigurationProperties(prefix = "girl")这2个注解。使用的时候，加@Autowired注解即可。<br/>
#注解<br/>
<br/>@Controller &nbsp;&nbsp;  处理http请求<br/>
@RestController &nbsp;&nbsp;  Spring4之后新加的注解，原来返回json需要@ResponseBody配合@Controller<br/>
@RequestMapping &nbsp;&nbsp;  配置url映射<br/>
@PathVariable &nbsp;&nbsp;  获取url中数据<br/>
@RequestParam &nbsp;&nbsp;  获取请求参数的值<br/>
@GetMapping &nbsp;&nbsp;  组合注解，相当于@RequestMapping(value = "/XXX", method = RequestMethod.GET)<br/>
@PostMapping &nbsp;&nbsp;  同上，就是get变成post

