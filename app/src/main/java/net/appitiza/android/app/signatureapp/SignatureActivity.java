package net.appitiza.android.app.signatureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import net.appitiza.android.drawingpad.drawpad.views.DrawingView;
import net.appitiza.android.drawingpad.drawpad.views.SignatureView;

public class SignatureActivity extends AppCompatActivity implements SignatureView.OnSignedListener{
    private SignatureView mSignatureView;
    private ImageView mIvSign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signature);
        this.mSignatureView = (SignatureView) findViewById(R.id.signature_view);
        this.mIvSign = (ImageView) findViewById(R.id.iv_preview);
        this.mSignatureView.setOnSignedListener(this);
    }

    @Override
    public void onStartSigning() {

    }

    @Override
    public void onSigned() {
        this.mIvSign.setImageBitmap(mSignatureView.getSignatureBitmap());
    }

    @Override
    public void onClear() {
        this.mIvSign.setImageDrawable(null);
    }


}
