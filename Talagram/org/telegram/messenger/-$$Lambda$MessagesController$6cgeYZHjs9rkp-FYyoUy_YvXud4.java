package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class -$$Lambda$MessagesController$6cgeYZHjs9rkp-FYyoUy_YvXud4 implements RequestDelegate {
    public -$$Lambda$MessagesController$6cgeYZHjs9rkp-FYyoUy_YvXud4(MessagesController arg1) {
        super();
        this.f$0 = arg1;
    }

    public final void run(TLObject arg2, TL_error arg3) {
        MessagesController.lambda$updateTimerProc$65(this.f$0, arg2, arg3);
    }
}

