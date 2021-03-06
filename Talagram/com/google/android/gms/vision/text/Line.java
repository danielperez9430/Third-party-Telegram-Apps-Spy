package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.vision.zzag;
import com.google.android.gms.internal.vision.zzx;
import java.util.ArrayList;
import java.util.List;

public class Line implements Text {
    private zzx zzcz;
    private List zzda;

    Line(zzx arg1) {
        super();
        this.zzcz = arg1;
    }

    public float getAngle() {
        return this.zzcz.zzdj.zzdh;
    }

    public Rect getBoundingBox() {
        return zzc.zza(((Text)this));
    }

    public List getComponents() {
        int v1 = 0;
        if(this.zzcz.zzdi.length == 0) {
            return new ArrayList(0);
        }

        if(this.zzda == null) {
            this.zzda = new ArrayList(this.zzcz.zzdi.length);
            zzag[] v0 = this.zzcz.zzdi;
            int v2 = v0.length;
            while(v1 < v2) {
                this.zzda.add(new Element(v0[v1]));
                ++v1;
            }
        }

        return this.zzda;
    }

    public Point[] getCornerPoints() {
        return zzc.zza(this.zzcz.zzdj);
    }

    public String getLanguage() {
        return this.zzcz.zzdd;
    }

    public String getValue() {
        return this.zzcz.zzdm;
    }

    public boolean isVertical() {
        return this.zzcz.zzdo;
    }
}

