package com.mjf.buglyhotfixdemo

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import com.tencent.bugly.Bugly
import com.tencent.bugly.beta.Beta


/**
 * Created by maojunfeng on 2020-03-11.
 * Description:
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // 这里实现SDK初始化，appId替换成你的在Bugly平台申请的appId
        // 调试时，将第三个参数改为true
        Bugly.init(this, "d2c75baeac", true)
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        // you must install multiDex whatever tinker is installed!
        MultiDex.install(base)
        // 安装tinker
        Beta.installTinker()
    }

}