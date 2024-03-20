package com.example.linearlayout3;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class Rotation {

    public Rotation(int toDegrees, int duration, boolean infinite, ImageView image) {
        RotateAnimation rotation = new RotateAnimation(0, toDegrees, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotation.setDuration(duration);
        if (infinite) {
            rotation.setRepeatCount(Animation.INFINITE);
        }
        rotation.setInterpolator(new LinearInterpolator());
        image.startAnimation(rotation);
    }
}
