package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.menu.h$a;
import android.support.v7.view.menu.h;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public class e extends b implements a {
    private Context a;
    private ActionBarContextView b;
    private android.support.v7.view.b$a c;
    private WeakReference d;
    private boolean e;
    private boolean f;
    private h g;

    public e(Context arg1, ActionBarContextView arg2, android.support.v7.view.b$a arg3, boolean arg4) {
        super();
        this.a = arg1;
        this.b = arg2;
        this.c = arg3;
        this.g = new h(arg2.getContext()).a(1);
        this.g.a(((a)this));
        this.f = arg4;
    }

    public MenuInflater a() {
        return new g(this.b.getContext());
    }

    public void a(int arg2) {
        this.b(this.a.getString(arg2));
    }

    public void a(h arg1) {
        this.d();
        this.b.a();
    }

    public void a(View arg2) {
        this.b.setCustomView(arg2);
        WeakReference v0 = arg2 != null ? new WeakReference(arg2) : null;
        this.d = v0;
    }

    public void a(CharSequence arg2) {
        this.b.setSubtitle(arg2);
    }

    public void a(boolean arg2) {
        super.a(arg2);
        this.b.setTitleOptional(arg2);
    }

    public boolean a(h arg1, MenuItem arg2) {
        return this.c.a(((b)this), arg2);
    }

    public void b(CharSequence arg2) {
        this.b.setTitle(arg2);
    }

    public Menu b() {
        return this.g;
    }

    public void b(int arg2) {
        this.a(this.a.getString(arg2));
    }

    public void c() {
        if(this.e) {
            return;
        }

        this.e = true;
        this.b.sendAccessibilityEvent(32);
        this.c.a(((b)this));
    }

    public void d() {
        this.c.b(((b)this), this.g);
    }

    public CharSequence f() {
        return this.b.getTitle();
    }

    public CharSequence g() {
        return this.b.getSubtitle();
    }

    public boolean h() {
        return this.b.d();
    }

    public View i() {
        View v0_1;
        if(this.d != null) {
            Object v0 = this.d.get();
        }
        else {
            v0_1 = null;
        }

        return v0_1;
    }
}

