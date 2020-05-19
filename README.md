
# AspectjDemo
Aspectjx框架在Android组件化项目中配置和部分使用场景
## 项目结构
![](https://github.com/himi4u/AspectjDemo/blob/master/pics/pic1.png)\
app：项目的“壳工程”，里面基本没代码，主要的作用是管理和组装其它Model组件；\
module_main：业务组件，放置业务代码+配置应用launch Activity、登录页面和主页面等\
module_video：业务组件，一个简单的video播放的组件，用的是[JiaoZiVideoPlayer](https://github.com/Jzvd/JiaoZiVideoPlayer)\
module_lib_common：库组件，放置Base类，封装的网络框架（目前该demo没有）和配置使用权限uses-permission等\
module_lib_aop：库组件，放置Aspectjx相关代码
## 首页
demo运行起来，首页如下图  
![](https://github.com/himi4u/AspectjDemo/blob/master/pics/pic2.png)\
我们PointCut是首页按钮点击回调里面的方法，我们可以打开日志，当点击Button的时候，日子打印\
![](https://github.com/himi4u/AspectjDemo/blob/master/pics/pic3.png)
以上是最简单的配置和例子，以后会更新在项目中实际使用的例子
## 注意
此demo因为没有用到网络请求，我单将aspectjx相关的类都放在了module_lib_aop中，实际项目中，因为用到Aspect的地方通常会有网络请求，但是module_lib_common引用了module_lib_aop，不能使用common中的网络请求框架。所以，我在实际项目中将aspectjx相关的类放在了app下，在app的build.gradle中配置

```java
apply plugin: 'android-aspectjx'

implementation deps.aspectjrt
```

