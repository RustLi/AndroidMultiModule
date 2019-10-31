package com.rustli.libbase;

import java.util.HashMap;
import java.util.Map;

public class BaseApiHelper {
    private static Map<Class<? extends IBaseApi>, IBaseApi> apiMap = new HashMap<>();

    public static void register(Class<? extends IBaseApi> clazz, IBaseApi iBaseApi){
        if (clazz != null && iBaseApi != null){
            apiMap.put(clazz, iBaseApi);
        }
    }

    public static void unregister(Class<? extends IBaseApi> clazz){
        apiMap.remove(clazz);
    }

    public static <T extends IBaseApi> T getBaseApi(Class<T> clazz){
        if (clazz != null){
            if (apiMap.containsKey(clazz)){
                return (T) apiMap.get(clazz);
            }else {
                return null;
            }
        }
        return null;
    }

}
