package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzuw extends zztz implements zzvs, zzxe, RandomAccess {
    private int size;
    private static final zzuw zzbvg;
    private double[] zzbvh;

    static {
        zzuw v0 = new zzuw();
        zzuw.zzbvg = v0;
        ((zztz)v0).zzsm();
    }

    zzuw() {
        this(new double[10], 0);
    }

    private zzuw(double[] arg1, int arg2) {
        super();
        this.zzbvh = arg1;
        this.size = arg2;
    }

    public final void add(int arg3, Object arg4) {
        this.zzc(arg3, ((Double)arg4).doubleValue());
    }

    public final boolean addAll(Collection arg6) {
        ((zztz)this).zztx();
        zzvo.checkNotNull(arg6);
        if(!(arg6 instanceof zzuw)) {
            return super.addAll(arg6);
        }

        if(((zzuw)arg6).size == 0) {
            return 0;
        }

        if(2147483647 - this.size >= ((zzuw)arg6).size) {
            int v0 = this.size + ((zzuw)arg6).size;
            if(v0 > this.zzbvh.length) {
                this.zzbvh = Arrays.copyOf(this.zzbvh, v0);
            }

            System.arraycopy(((zzuw)arg6).zzbvh, 0, this.zzbvh, this.size, ((zzuw)arg6).size);
            this.size = v0;
            ++this.modCount;
            return 1;
        }

        throw new OutOfMemoryError();
    }

    public final boolean equals(Object arg9) {
        if(this == (((zzuw)arg9))) {
            return 1;
        }

        if(!(arg9 instanceof zzuw)) {
            return super.equals(arg9);
        }

        if(this.size != ((zzuw)arg9).size) {
            return 0;
        }

        double[] v9 = ((zzuw)arg9).zzbvh;
        int v1;
        for(v1 = 0; v1 < this.size; ++v1) {
            if(this.zzbvh[v1] != v9[v1]) {
                return 0;
            }
        }

        return 1;
    }

    public final Object get(int arg4) {
        this.zzai(arg4);
        return Double.valueOf(this.zzbvh[arg4]);
    }

    public final int hashCode() {
        int v0 = 1;
        int v1;
        for(v1 = 0; v1 < this.size; ++v1) {
            v0 = v0 * 31 + zzvo.zzbf(Double.doubleToLongBits(this.zzbvh[v1]));
        }

        return v0;
    }

    public final Object remove(int arg7) {
        ((zztz)this).zztx();
        this.zzai(arg7);
        double v1 = this.zzbvh[arg7];
        if(arg7 < this.size - 1) {
            System.arraycopy(this.zzbvh, arg7 + 1, this.zzbvh, arg7, this.size - arg7);
        }

        --this.size;
        ++this.modCount;
        return Double.valueOf(v1);
    }

    public final boolean remove(Object arg6) {
        ((zztz)this).zztx();
        int v1;
        for(v1 = 0; v1 < this.size; ++v1) {
            if(arg6.equals(Double.valueOf(this.zzbvh[v1]))) {
                System.arraycopy(this.zzbvh, v1 + 1, this.zzbvh, v1, this.size - v1);
                --this.size;
                ++this.modCount;
                return 1;
            }
        }

        return 0;
    }

    protected final void removeRange(int arg4, int arg5) {
        ((zztz)this).zztx();
        if(arg5 >= arg4) {
            System.arraycopy(this.zzbvh, arg5, this.zzbvh, arg4, this.size - arg5);
            this.size -= arg5 - arg4;
            ++this.modCount;
            return;
        }

        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int arg5, Object arg6) {
        double v0 = ((Double)arg6).doubleValue();
        ((zztz)this).zztx();
        this.zzai(arg5);
        double v2 = this.zzbvh[arg5];
        this.zzbvh[arg5] = v0;
        return Double.valueOf(v2);
    }

    public final int size() {
        return this.size;
    }

    private final void zzai(int arg2) {
        if(arg2 >= 0 && arg2 < this.size) {
            return;
        }

        throw new IndexOutOfBoundsException(this.zzaj(arg2));
    }

    private final String zzaj(int arg4) {
        int v0 = this.size;
        StringBuilder v1 = new StringBuilder(35);
        v1.append("Index:");
        v1.append(arg4);
        v1.append(", Size:");
        v1.append(v0);
        return v1.toString();
    }

    public final zzvs zzak(int arg3) {
        if(arg3 >= this.size) {
            return new zzuw(Arrays.copyOf(this.zzbvh, arg3), this.size);
        }

        throw new IllegalArgumentException();
    }

    private final void zzc(int arg5, double arg6) {
        ((zztz)this).zztx();
        if(arg5 >= 0 && arg5 <= this.size) {
            if(this.size < this.zzbvh.length) {
                System.arraycopy(this.zzbvh, arg5, this.zzbvh, arg5 + 1, this.size - arg5);
            }
            else {
                double[] v0 = new double[this.size * 3 / 2 + 1];
                System.arraycopy(this.zzbvh, 0, v0, 0, arg5);
                System.arraycopy(this.zzbvh, arg5, v0, arg5 + 1, this.size - arg5);
                this.zzbvh = v0;
            }

            this.zzbvh[arg5] = arg6;
            ++this.size;
            ++this.modCount;
            return;
        }

        throw new IndexOutOfBoundsException(this.zzaj(arg5));
    }

    public final void zzd(double arg2) {
        this.zzc(this.size, arg2);
    }
}

