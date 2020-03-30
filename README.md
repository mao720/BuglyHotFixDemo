# BuglyHotFixDemo
利用腾讯Bugly集成tinker热修复功能、管理补丁包

1.配置项目、签名文件  
2.集成buglySDK  
3.tinker-support.gradle中配置tinkerId，用gradle-tinker-tinkerPatchRlease打基准包  
4.tinker-support.gradle中配置tinkerId和baseApkDir，用gradle-tinker-tinkerPatchRlease打补丁包  
5.上传补丁到bugly管理后台  
