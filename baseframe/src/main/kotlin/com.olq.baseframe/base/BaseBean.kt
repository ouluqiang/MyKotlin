package com.olq.baseframe.base

data class BaseBean(var code:Int,var message:String,var data:Any) {


    override fun toString(): String {
        return "BaseBean(code=$code, message='$message', data=$data)"
    }
}