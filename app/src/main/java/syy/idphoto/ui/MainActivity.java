package syy.idphoto.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import syy.idphoto.R;
import syy.idphoto.ui.view.SVDraw;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.mDraw)
    SVDraw mDraw;

    @OnClick(R.id.btnPreview)
    void btnPreview() {
        Toast.makeText(MainActivity.this,
                "您按了预览按钮",
                Toast.LENGTH_SHORT).show();
//        initCamera();
        mDraw.setVisibility(View.VISIBLE);
        mDraw.drawLine();
    }

    @OnClick(R.id.btnPhoto)
    void btnPhoto() {

    }

    @OnClick(R.id.btnSave)
    void btnSave() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sss);
        ButterKnife.bind(this);
    }
}
