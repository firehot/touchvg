package touchvg.view;

import touchvg.skiaview.GiSkiaView;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

public class PaintView extends View {
	private GiSkiaView mView;
	private GiCanvasEx mCanvas;
	
	static {
		System.loadLibrary("skiaview");
	}
	
	public PaintView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}
	
	public PaintView(Context context) {
		super(context);
		init();
	}
	
	private void init()
	{
		mCanvas = new GiCanvasEx();
		mView = new GiSkiaView(mCanvas);
	}
	
	public GiSkiaView getCoreView() {
		return mView;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		mView.onSize(canvas.getWidth(), canvas.getHeight());
		
		if (mCanvas.beginPaint(canvas)) {
			canvas.drawColor(Color.WHITE);
			mView.onDraw(mCanvas);
			mView.onDynDraw(mCanvas);
			mCanvas.endPaint();
		}
	}
	
}
