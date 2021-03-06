package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import java.lang.ref.WeakReference;
import java.util.Map;

final class zzet extends zzgm {
    private WeakReference zzec;
    private WeakReference zzed;

    zzet(Map arg1, Object arg2, ResultHolder arg3) {
        super(arg3);
        this.zzec = new WeakReference(arg1);
        this.zzed = new WeakReference(arg2);
    }

    public final void zza(Status arg5) {
        Object v0 = this.zzec.get();
        Object v1 = this.zzed.get();
        if(arg5.getStatus().getStatusCode() == 4002 && v0 != null && v1 != null) {
            __monitor_enter(v0);
            try {
                v1 = ((Map)v0).remove(v1);
                if(v1 != null) {
                    ((zzhk)v1).clear();
                }

                __monitor_exit(v0);
                goto label_19;
            label_17:
                __monitor_exit(v0);
            }
            catch(Throwable v5) {
                goto label_17;
            }

            throw v5;
        }

    label_19:
        ((zzgm)this).zza(arg5);
    }
}

