package com.google.android.gms.internal.measurement;

import java.util.Arrays;

final class zzzi {
    final int tag;
    final byte[] zzbug;

    zzzi(int arg1, byte[] arg2) {
        super();
        this.tag = arg1;
        this.zzbug = arg2;
    }

    public final boolean equals(Object arg5) {
        if((((zzzi)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzzi)) {
            return 0;
        }

        if(this.tag == ((zzzi)arg5).tag && (Arrays.equals(this.zzbug, ((zzzi)arg5).zzbug))) {
            return 1;
        }

        return 0;
    }

    public final int hashCode() {
        return (this.tag + 527) * 31 + Arrays.hashCode(this.zzbug);
    }
}

