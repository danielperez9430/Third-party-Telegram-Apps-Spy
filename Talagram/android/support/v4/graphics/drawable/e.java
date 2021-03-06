package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build$VERSION;
import android.util.Log;
import java.lang.reflect.Method;

class e extends d {
    class a extends android.support.v4.graphics.drawable.d$a {
        a(android.support.v4.graphics.drawable.d$a arg1, Resources arg2) {
            super(arg1, arg2);
        }

        public Drawable newDrawable(Resources arg2) {
            return new e(((android.support.v4.graphics.drawable.d$a)this), arg2);
        }
    }

    private static Method d;

    e(Drawable arg1) {
        super(arg1);
        this.d();
    }

    e(android.support.v4.graphics.drawable.d$a arg1, Resources arg2) {
        super(arg1, arg2);
        this.d();
    }

    android.support.v4.graphics.drawable.d$a b() {
        return new a(this.b, null);
    }

    protected boolean c() {
        boolean v1 = false;
        if(Build$VERSION.SDK_INT == 21) {
            Drawable v0 = this.c;
            if(!(v0 instanceof GradientDrawable) && !(v0 instanceof DrawableContainer) && !(v0 instanceof InsetDrawable) && !(v0 instanceof RippleDrawable)) {
                return v1;
            }

            v1 = true;
        }

        return v1;
    }

    private void d() {
        if(e.d == null) {
            try {
                e.d = Drawable.class.getDeclaredMethod("isProjected");
            }
            catch(Exception v0) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", ((Throwable)v0));
            }
        }
    }

    public Rect getDirtyBounds() {
        return this.c.getDirtyBounds();
    }

    public void getOutline(Outline arg2) {
        this.c.getOutline(arg2);
    }

    public void setHotspot(float arg2, float arg3) {
        this.c.setHotspot(arg2, arg3);
    }

    public void setHotspotBounds(int arg2, int arg3, int arg4, int arg5) {
        this.c.setHotspotBounds(arg2, arg3, arg4, arg5);
    }

    public boolean setState(int[] arg1) {
        if(super.setState(arg1)) {
            this.invalidateSelf();
            return 1;
        }

        return 0;
    }

    public void setTint(int arg2) {
        if(this.c()) {
            super.setTint(arg2);
        }
        else {
            this.c.setTint(arg2);
        }
    }

    public void setTintList(ColorStateList arg2) {
        if(this.c()) {
            super.setTintList(arg2);
        }
        else {
            this.c.setTintList(arg2);
        }
    }

    public void setTintMode(PorterDuff$Mode arg2) {
        if(this.c()) {
            super.setTintMode(arg2);
        }
        else {
            this.c.setTintMode(arg2);
        }
    }
}

