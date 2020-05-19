# AspectjDemo
Aspectjx框架在Android组件化项目中配置和部分使用场景
## 项目结构
![](https://imgconvert.csdnimg.cn/aHR0cHM6Ly9naXRodWIuY29tL2hpbWk0dS9Bc3BlY3RqRGVtby9ibG9iL21hc3Rlci9waWNzLyVFOSVBMSVCOSVFNyU5QiVBRSVFNyVCQiU5MyVFNiU5RSU4NC5wbmc?x-oss-process=image/format.png)

app：项目的“壳工程”，里面基本没代码，主要的作用是管理和组装其它Model组件；
module_main：业务组件，放置业务代码+配置应用launch Activity、登录页面和主页面等
module_video：业务组件，一个简单的video播放的组件，用的是[JiaoZiVideoPlayer](https://github.com/Jzvd/JiaoZiVideoPlayer)
module_lib_common：库组件，放置Base类，封装的网络框架（目前该demo没有）和配置使用权限 				uses-permission等
module_lib_aop：库组件，放置Aspectjx相关代码

## 注意
此demo因为没有用到网络请求，我单将aspectjx相关的类都放在了module_lib_aop中，实际项目中，因为用到Aspect的地方通常会有网络请求，我在实际项目中将aspectjx相关的类放在了app下，在app的build.gradle中配置

```java
apply plugin: 'android-aspectjx'

implementation deps.aspectjrt
```
