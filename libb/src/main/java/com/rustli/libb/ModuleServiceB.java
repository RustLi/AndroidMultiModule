package com.rustli.libb;


import com.rustli.libbase.BaseApiHelper;
import com.rustli.libbase.IModuleAApi;

public class ModuleServiceB {

    private static IModuleAApi getModuleAApi(){
        return BaseApiHelper.getBaseApi(IModuleAApi.class);
    }

    public static String methodB(){
        return getModuleAApi().methodA();
    }
}
