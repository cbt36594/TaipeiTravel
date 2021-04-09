package com.nevic.taipeitravel.utils

import android.Manifest
import android.app.Activity
import androidx.activity.result.ActivityResultLauncher
import android.content.pm.PackageManager
import android.os.Build
import androidx.core.app.ActivityCompat

class PermissionHelper (private val mActivity: Activity) {
    fun hasPermission(vararg permissions: Permission): Boolean {
        var hasPermission = true
        for (permission in permissions) {
            hasPermission = hasPermission and hasSystemPermission(permission)
            if (!hasPermission) {
                break
            }
        }
        return hasPermission
    }

//    fun isUserDenyPermission(permission: Permission): Boolean {
//        return isTubeEverRequestPermission(permission) && isUserDenySystemPermission(permission)
//    }
//
//    fun requestPermission(permission: Permission, code: Int) {
//        setTubeHasRequestPermission(permission)
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            mActivity.requestPermissions(arrayOf(permission.manifestPermissionKey), code)
//        }
//    }
//
//    fun requestPermission(permission: Permission, launcher: ActivityResultLauncher<String?>) {
//        setTubeHasRequestPermission(permission)
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            launcher.launch(permission.manifestPermissionKey)
//        }
//    }

//    private fun isTubeEverRequestPermission(permission: Permission): Boolean {
//        return locateSharedPreferences.getBoolean("" + permission.sharedPreferenceKey.hashCode())
//    }
//
//    private fun setTubeHasRequestPermission(permission: Permission) {
//        locateSharedPreferences.putBoolean("" + permission.sharedPreferenceKey.hashCode(), true)
//                .commit()
//    }
//
//    private val locateSharedPreferences: SharedPreferencesHelper
//        private get() = SharedPreferencesHelper.getInstance(mActivity)

    private fun hasSystemPermission(permission: Permission): Boolean {
        return ActivityCompat.checkSelfPermission(mActivity.applicationContext,
                permission.manifestPermissionKey) == PackageManager.PERMISSION_GRANTED
    }

    private fun isUserDenySystemPermission(permission: Permission): Boolean {
        if (hasSystemPermission(permission)) {
            return false
        }
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            !mActivity.shouldShowRequestPermissionRationale(permission.manifestPermissionKey)
        } else true
    }

    enum class Permission(
            val sharedPreferenceName: String,
            val sharedPreferenceKey: String,
            val manifestPermissionKey: String
    ) {
        STORAGE(SHARED_PREFERENCE_PERMISSION_NAME,
                SHARED_PREFERENCE_STORAGE_PERMISSION_KEY,
                Manifest.permission.WRITE_EXTERNAL_STORAGE),
        LOCATE(
                SHARED_PREFERENCE_LOCATE_NAME,
                SHARED_PREFERENCE_LOCATE_PERMISSION_KEY,
                Manifest.permission.ACCESS_FINE_LOCATION),
        CAMERA(
                SHARED_PREFERENCE_CAMERA_NAME,
                SHARED_PREFERENCE_CAMERA_PERMISSION_KEY,
                Manifest.permission.CAMERA);

    }

    companion object {
        private const val SHARED_PREFERENCE_CAMERA_NAME = "com.nevic.taipeitravel.camera"
        private const val SHARED_PREFERENCE_CAMERA_PERMISSION_KEY = "camera.permission"
        private const val SHARED_PREFERENCE_LOCATE_NAME = "com.nevic.taipeitravel.locate"
        private const val SHARED_PREFERENCE_LOCATE_PERMISSION_KEY = "com.nevic.taipeitravel.locate.permission"
        private const val SHARED_PREFERENCE_PERMISSION_NAME = "com.nevic.taipeitravel.permission.storage"
        private const val SHARED_PREFERENCE_STORAGE_PERMISSION_KEY =
                "com.nevic.taipeitravel.permission.storage"
    }
}