package syy.idphoto.off;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;

public class DrawImageView extends ImageView {

    Paint paint = new Paint();

    {
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStyle(Style.STROKE);
        paint.setStrokeWidth(2.5f);//设置线宽
        paint.setAlpha(100);
    }

    public DrawImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);
        canvas.drawRect(new Rect(100, 200, 400, 500), paint);//绘制矩形
    }

}
