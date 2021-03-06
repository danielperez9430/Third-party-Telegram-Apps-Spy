package com.google.android.gms.internal.places;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class zzgx {
    private static final Logger logger;
    private static String zzse;

    static {
        zzgx.logger = Logger.getLogger(zzgf.class.getName());
        zzgx.zzse = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
    }

    zzgx() {
        super();
    }

    static zzgl zzb(Class arg12) {
        zzgl v1_7;
        String v1;
        ClassLoader v0 = zzgx.class.getClassLoader();
        if(arg12.equals(zzgl.class)) {
            v1 = zzgx.zzse;
        }
        else if(arg12.getPackage().equals(zzgx.class.getPackage())) {
            v1 = String.format("%s.BlazeGenerated%sLoader", arg12.getPackage().getName(), arg12.getSimpleName());
        }
        else {
            goto label_106;
        }

        try {
            Class v1_1 = Class.forName(v1, true, v0);
            try {
                Object v1_6 = v1_1.getConstructor().newInstance();
                v1_7 = ((zzgx)v1_6).zzdm();
            }
            catch(InvocationTargetException v1_2) {
                throw new IllegalStateException(((Throwable)v1_2));
            }
            catch(IllegalAccessException v1_3) {
                throw new IllegalStateException(((Throwable)v1_3));
            }
            catch(InstantiationException v1_4) {
                throw new IllegalStateException(((Throwable)v1_4));
            }
            catch(NoSuchMethodException v1_5) {
                throw new IllegalStateException(((Throwable)v1_5));
            }

            return arg12.cast(v1_7);
        }
        catch(ClassNotFoundException ) {
            Iterator v0_1 = ServiceLoader.load(zzgx.class, v0).iterator();
            ArrayList v1_8 = new ArrayList();
            while(v0_1.hasNext()) {
                try {
                    v1_8.add(arg12.cast(v0_1.next().zzdm()));
                }
                catch(ServiceConfigurationError v4) {
                    ServiceConfigurationError v10 = v4;
                    Logger v5 = zzgx.logger;
                    Level v6 = Level.SEVERE;
                    String v7 = "com.google.protobuf.GeneratedExtensionRegistryLoader";
                    String v8 = "load";
                    String v4_1 = "Unable to load ";
                    String v9 = String.valueOf(arg12.getSimpleName());
                    v9 = v9.length() != 0 ? v4_1.concat(v9) : new String(v4_1);
                    v5.logp(v6, v7, v8, v9, ((Throwable)v10));
                }
            }

            if(v1_8.size() == 1) {
                return v1_8.get(0);
            }

            zzgl v4_2 = null;
            if(v1_8.size() == 0) {
                return v4_2;
            }

            try {
                return arg12.getMethod("combine", Collection.class).invoke(v4_2, v1_8);
            }
            catch(InvocationTargetException v12) {
                throw new IllegalStateException(((Throwable)v12));
            }
            catch(IllegalAccessException v12_1) {
                throw new IllegalStateException(((Throwable)v12_1));
            }
            catch(NoSuchMethodException v12_2) {
                throw new IllegalStateException(((Throwable)v12_2));
            }
        }

    label_106:
        throw new IllegalArgumentException(arg12.getName());
    }

    protected abstract zzgl zzdm();
}

