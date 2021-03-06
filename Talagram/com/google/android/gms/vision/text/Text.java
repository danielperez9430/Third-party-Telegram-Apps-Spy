package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.List;

public interface Text {
    Rect getBoundingBox();

    List getComponents();

    Point[] getCornerPoints();

    String getValue();
}

