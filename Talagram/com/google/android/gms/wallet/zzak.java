package com.google.android.gms.wallet;

import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.wallet.zzaf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzak extends TaskApiCall {
    zzak(PaymentsClient arg1, PaymentDataRequest arg2) {
        this.zzei = arg2;
        super();
    }

    protected final void doExecute(AnyClient arg2, TaskCompletionSource arg3) {
        ((zzaf)arg2).zza(this.zzei, arg3);
    }
}

