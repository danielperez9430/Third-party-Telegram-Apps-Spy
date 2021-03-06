package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.widget.q;
import android.support.v7.a.a$j;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ActionMode$Callback;
import android.widget.TextView;

public class DialogTitle extends TextView {
    public DialogTitle(Context arg1) {
        super(arg1);
    }

    public DialogTitle(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
    }

    public DialogTitle(Context arg1, AttributeSet arg2, int arg3) {
        super(arg1, arg2, arg3);
    }

    protected void onMeasure(int arg7, int arg8) {
        super.onMeasure(arg7, arg8);
        Layout v0 = this.getLayout();
        if(v0 != null) {
            int v1 = v0.getLineCount();
            if(v1 > 0 && v0.getEllipsisCount(v1 - 1) > 0) {
                this.setSingleLine(false);
                this.setMaxLines(2);
                TypedArray v1_1 = this.getContext().obtainStyledAttributes(null, j.TextAppearance, 16842817, 16973892);
                int v2 = v1_1.getDimensionPixelSize(j.TextAppearance_android_textSize, 0);
                if(v2 != 0) {
                    this.setTextSize(0, ((float)v2));
                }

                v1_1.recycle();
                super.onMeasure(arg7, arg8);
            }
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode$Callback arg1) {
        super.setCustomSelectionActionModeCallback(q.a(((TextView)this), arg1));
    }
}

