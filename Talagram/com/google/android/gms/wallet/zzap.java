package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzap implements Parcelable$Creator {
    public zzap() {
        super();
    }

    public final Object createFromParcel(Parcel arg7) {
        int v0 = SafeParcelReader.validateObjectHeader(arg7);
        String v1 = null;
        int v2 = 0;
        String v3 = v1;
        while(arg7.dataPosition() < v0) {
            int v4 = SafeParcelReader.readHeader(arg7);
            switch(SafeParcelReader.getFieldId(v4)) {
                case 1: {
                    goto label_15;
                }
                case 2: {
                    goto label_13;
                }
                case 3: {
                    goto label_11;
                }
            }

            SafeParcelReader.skipUnknownField(arg7, v4);
            continue;
        label_11:
            v3 = SafeParcelReader.createString(arg7, v4);
            continue;
        label_13:
            v1 = SafeParcelReader.createString(arg7, v4);
            continue;
        label_15:
            v2 = SafeParcelReader.readInt(arg7, v4);
        }

        SafeParcelReader.ensureAtEnd(arg7, v0);
        return new TransactionInfo(v2, v1, v3);
    }

    public final Object[] newArray(int arg1) {
        return new TransactionInfo[arg1];
    }
}

