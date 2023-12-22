package com.example.page373_1115;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    static float scaleX=1, scaleY=1, angle=0, color=1, sat=1;
    MyGraphicView graphicView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        graphicView = new MyGraphicView(this);
        setContentView(graphicView);
        setTitle("미니 포토샵2");
    }

    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        menu.add(0,1,0,"확대");
        menu.add(0,2,0,"축소");
        menu.add(0,3,0,"회전");
        menu.add(0,4,0,"밝게");
        menu.add(0,5,0,"어둡게");
        menu.add(0,6,0,"그레이영상");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case 1:
                scaleX += 0.2f;
                scaleY += 0.2f;
                graphicView.invalidate();
                return true;
            case 2:
                scaleX -= 0.2f;
                scaleY -= 0.2f;
                graphicView.invalidate();
                return true;
            case 3:
                angle += 40;
                graphicView.invalidate();
                return true;
            case 4:
                color += 0.2f;
                graphicView.invalidate();
                return true;
            case 5:
                color -= 0.2f;
                graphicView.invalidate();
                return true;
            case 6:
                sat = (sat + 1) % 2;
                graphicView.invalidate();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private static class MyGraphicView extends View {
        public MyGraphicView(Context context){
            super(context);
        }

        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            Bitmap picture = BitmapFactory.decodeResource(getResources(), R.drawable.p2);
            Paint paint = new Paint();

            int cenX = this.getWidth() / 2;
            int cenY = this.getHeight() / 2;
            canvas.scale(scaleX, scaleY, cenX, cenY);
            canvas.rotate(angle,cenX,cenY);

            float[] array = {color, 0, 0, 0, 0,
                    0, color, 0, 0, 0,
                    0, 0, color, 0, 0,
                    0, 0, 0, 1, 0};
            ColorMatrix cm = new ColorMatrix(array);
            if(sat == 0) cm.setSaturation(sat);
            paint.setColorFilter(new ColorMatrixColorFilter(cm));

            int picX = (this.getWidth() - picture.getWidth()) / 2;
            int picY = (this.getHeight() - picture.getHeight()) / 2;

            canvas.drawBitmap(picture, picX, picY, paint);

            picture.recycle();
        }
    }
}