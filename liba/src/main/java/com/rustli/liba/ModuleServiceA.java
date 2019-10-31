package com.rustli.liba;


import com.rustli.libbase.BaseApiHelper;
import com.rustli.libbase.IModuleAApi;

public class ModuleServiceA implements IModuleAApi {

    @Override
    public String methodA() {
        return "This is method A";
    }

    public static void init(){
        BaseApiHelper.register(IModuleAApi.class, new ModuleServiceA());
    }

    public static void uninit(){
        BaseApiHelper.unregister(IModuleAApi.class);
    }
}
