package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a$j;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public abstract class a {
    public class android.support.v7.app.a$a extends ViewGroup$MarginLayoutParams {
        public int a;

        public android.support.v7.app.a$a(int arg1, int arg2) {
            super(arg1, arg2);
            this.a = 0;
            this.a = 8388627;
        }

        public android.support.v7.app.a$a(Context arg3, AttributeSet arg4) {
            super(arg3, arg4);
            this.a = 0;
            TypedArray v3 = arg3.obtainStyledAttributes(arg4, j.ActionBarLayout);
            this.a = v3.getInt(j.ActionBarLayout_android_layout_gravity, 0);
            v3.recycle();
        }

        public android.support.v7.app.a$a(android.support.v7.app.a$a arg2) {
            super(((ViewGroup$MarginLayoutParams)arg2));
            this.a = 0;
            this.a = arg2.a;
        }

        public android.support.v7.app.a$a(ViewGroup$LayoutParams arg1) {
            super(arg1);
            this.a = 0;
        }
    }

    public interface b {
        void a(boolean arg1);
    }

    @Deprecated public abstract class c {
        public c() {
            super();
        }

        public abstract Drawable a();

        public abstract CharSequence b();

        public abstract View c();

        public abstract void d();

        public abstract CharSequence e();
    }

    public a() {
        super();
    }

    public abstract int a();

    public android.support.v7.view.b a(android.support.v7.view.b$a arg1) {
        return null;
    }

    public void a(float arg2) {
        if(arg2 == 0f) {
            return;
        }

        throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
    }

    public void a(Configuration arg1) {
    }

    public void a(CharSequence arg1) {
    }

    public void a(boolean arg1) {
    }

    public boolean a(int arg1, KeyEvent arg2) {
        return 0;
    }

    public boolean a(KeyEvent arg1) {
        return 0;
    }

    public Context b() {
        return null;
    }

    public void b(boolean arg2) {
        if(!arg2) {
            return;
        }

        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    public void c(boolean arg1) {
    }

    public boolean c() {
        return 0;
    }

    public void d(boolean arg1) {
    }

    public boolean d() {
        return 0;
    }

    public void e(boolean arg1) {
    }

    public boolean e() {
        return 0;
    }

    public boolean f() {
        return 0;
    }

    void g() {
    }
}

