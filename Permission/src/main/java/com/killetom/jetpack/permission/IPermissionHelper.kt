package com.killetom.jetpack.permission

import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment

/**
 * create by 易庞宙(KilleTom) on 2022/03/25 16:59
 * email : 1986545332@qq.com
 * description：
 **/
interface IPermissionHelper {

    fun attach(activity: ComponentActivity)

    fun attach(fragment: Fragment)

    fun detach(activity:ComponentActivity)

    fun detach(fragment:Fragment)

    fun requestPermission(
        permission: String,call: ISinglePermissionCheckAction.() -> Unit)

    fun requestPermission(
        permissions:Array<String>,call: IMultilplePermissionCheckAction.() -> Unit)
}