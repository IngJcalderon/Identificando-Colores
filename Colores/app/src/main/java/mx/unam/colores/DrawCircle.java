package mx.unam.colores;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;

public class DrawCircle extends View {

    private final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public DrawCircle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DrawCircle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCircle(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        // Calculamos el punto central del componente
        int cx = this.getWidth() -100;
        int cy = 100;//this.getHeight() -100;

        // Ponemos el fondo de color negro
        //canvas.drawColor(Color.BLACK);

        // Dibujamos un circulo relleno de color azul
        paint.setStyle(Style.FILL_AND_STROKE);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(cx, cy, 100, paint);

    }

}