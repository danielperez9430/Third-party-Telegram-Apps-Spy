package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class -$$Lambda$MessagesController$_fyMloSxBpFlOUkpIv26yZEXXyc implements RequestDelegate {
    public -$$Lambda$MessagesController$_fyMloSxBpFlOUkpIv26yZEXXyc(MessagesController arg1) {
        super();
        this.f$0 = arg1;
    }

    public final void run(TLObject arg2, TL_error arg3) {
        MessagesController.lambda$checkProxyInfoInternal$79(this.f$0, arg2, arg3);
    }
}

