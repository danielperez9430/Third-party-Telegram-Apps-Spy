package android.support.v4.f;

public class d {
    public static void a(Object arg2, StringBuilder arg3) {
        String v2;
        if(arg2 == null) {
            v2 = "null";
        }
        else {
            String v0 = arg2.getClass().getSimpleName();
            if(v0 == null || v0.length() <= 0) {
                v0 = arg2.getClass().getName();
                int v1 = v0.lastIndexOf(46);
                if(v1 > 0) {
                    v0 = v0.substring(v1 + 1);
                }
            }

            arg3.append(v0);
            arg3.append('{');
            v2 = Integer.toHexString(System.identityHashCode(arg2));
        }

        arg3.append(v2);
    }
}

