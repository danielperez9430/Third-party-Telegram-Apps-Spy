package android.support.c.a;

import android.content.Context;
import android.content.res.Resources$NotFoundException;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build$VERSION;
import android.support.v4.view.b.a;
import android.support.v4.view.b.b;
import android.support.v4.view.b.c;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class d {
    public static Interpolator a(Context arg4, int arg5) {
        Interpolator v4_3;
        XmlResourceParser v1;
        if(Build$VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(arg4, arg5);
        }

        XmlResourceParser v0 = null;
        if(arg5 != 17563663) {
            goto label_17;
        }

        try {
            return new a();
        label_17:
            if(arg5 == 17563661) {
                return new b();
            }

            if(arg5 == 17563662) {
                return new c();
            }

            v1 = arg4.getResources().getAnimation(arg5);
        }
        catch(Throwable v4) {
            goto label_12;
        }
        catch(IOException v4_1) {
            goto label_14;
        }
        catch(XmlPullParserException v4_2) {
            goto label_16;
        }

        try {
            v4_3 = d.a(arg4, arg4.getResources(), arg4.getTheme(), ((XmlPullParser)v1));
            if(v1 != null) {
                goto label_33;
            }

            return v4_3;
        }
        catch(Throwable v4) {
            goto label_36;
        }
        catch(IOException v4_1) {
            goto label_39;
        }
        catch(XmlPullParserException v4_2) {
            goto label_42;
        }

    label_33:
        v1.close();
        return v4_3;
    label_36:
        v0 = v1;
        goto label_66;
    label_39:
        v0 = v1;
        goto label_44;
    label_42:
        v0 = v1;
        goto label_55;
    label_12:
        goto label_66;
    label_14:
        goto label_44;
    label_16:
        goto label_55;
        try {
        label_44:
            String v5 = "Can\'t load animation resource ID #0x" + Integer.toHexString(arg5);
            Resources$NotFoundException v1_1 = new Resources$NotFoundException(v5);
            v1_1.initCause(((Throwable)v4_1));
            throw v1_1;
        label_55:
            v5 = "Can\'t load animation resource ID #0x" + Integer.toHexString(((int)v5));
            v1_1 = new Resources$NotFoundException(v5);
            v1_1.initCause(((Throwable)v4_2));
            throw v1_1;
        }
        catch(Throwable v4) {
            goto label_12;
        }

    label_66:
        if(v0 != null) {
            v0.close();
        }

        throw v4;
    }

    private static Interpolator a(Context arg2, Resources arg3, Resources$Theme arg4, XmlPullParser arg5) {
        AccelerateDecelerateInterpolator v4_3;
        AccelerateInterpolator v0_2;
        int v3 = arg5.getDepth();
        Interpolator v4 = null;
        while(true) {
            int v0 = arg5.next();
            if((v0 != 3 || arg5.getDepth() > v3) && v0 != 1) {
                if(v0 != 2) {
                }
                else {
                    AttributeSet v4_1 = Xml.asAttributeSet(arg5);
                    String v0_1 = arg5.getName();
                    if(v0_1.equals("linearInterpolator")) {
                        LinearInterpolator v4_2 = new LinearInterpolator();
                    }
                    else {
                        if(v0_1.equals("accelerateInterpolator")) {
                            v0_2 = new AccelerateInterpolator(arg2, v4_1);
                        }
                        else if(v0_1.equals("decelerateInterpolator")) {
                            DecelerateInterpolator v0_3 = new DecelerateInterpolator(arg2, v4_1);
                        }
                        else if(v0_1.equals("accelerateDecelerateInterpolator")) {
                            v4_3 = new AccelerateDecelerateInterpolator();
                            continue;
                        }
                        else if(v0_1.equals("cycleInterpolator")) {
                            CycleInterpolator v0_4 = new CycleInterpolator(arg2, v4_1);
                        }
                        else if(v0_1.equals("anticipateInterpolator")) {
                            AnticipateInterpolator v0_5 = new AnticipateInterpolator(arg2, v4_1);
                        }
                        else if(v0_1.equals("overshootInterpolator")) {
                            OvershootInterpolator v0_6 = new OvershootInterpolator(arg2, v4_1);
                        }
                        else if(v0_1.equals("anticipateOvershootInterpolator")) {
                            AnticipateOvershootInterpolator v0_7 = new AnticipateOvershootInterpolator(arg2, v4_1);
                        }
                        else if(v0_1.equals("bounceInterpolator")) {
                            BounceInterpolator v4_4 = new BounceInterpolator();
                            continue;
                        }
                        else if(v0_1.equals("pathInterpolator")) {
                            g v0_8 = new g(arg2, v4_1, arg5);
                        }
                        else {
                            break;
                        }

                        AccelerateInterpolator v4_5 = v0_2;
                    }
                }

                continue;
            }

            goto label_85;
        }

        StringBuilder v3_1 = new StringBuilder();
        v3_1.append("Unknown interpolator name: ");
        v3_1.append(arg5.getName());
        throw new RuntimeException(v3_1.toString());
    label_85:
        return ((Interpolator)v4_3);
    }
}
