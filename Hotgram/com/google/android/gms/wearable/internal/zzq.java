package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;

final class zzq extends zzn {
    zzq(zzo arg1, GoogleApiClient arg2, int arg3) {
        this.zzbq = arg3;
        super(arg2);
    }

    protected final Result createFailedResult(Status arg3) {
        return new zzx(arg3, null);
    }

    protected final void doExecute(AnyClient arg3) {
        ((zzhg)arg3).getService().zza(new zzgq(((ResultHolder)this)), this.zzbq);
    }
}

