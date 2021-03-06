package com.github.jasonlamkk.colorfulparticlesystem;

import com.github.jasonlamkk.colorfulparticlesystem.examples.R;
import com.github.jasonlamkk.colorfulparticlesystem.modifiers.AlphaModifier;
import com.github.jasonlamkk.colorfulparticlesystem.ParticleSystem;
import com.github.jasonlamkk.colorfulparticlesystem.modifiers.ScaleModifier;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class DustExampleActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dust_example);
		findViewById(R.id.button1).setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		new ParticleSystem(this, 4, R.drawable.dust, 3000)
				.setScaleRange(20f, 10f, 60f, 20f)
				.setColor(100,100,100,50, 50, 50,
						200, 200, 200, 50, 50 , 50,
						245, 10, 125, 50 )
		.setSpeedByComponentsRange(-0.025f, 0.025f, -0.06f, -0.08f)		
		.setAcceleration(0.00001f, 30)
		.setInitialRotationRange(0, 360)
		.addModifier(new AlphaModifier(255, 0, 1000, 3000))
		.addModifier(new ScaleModifier(0.5f, 2f, 0, 1000))
		.oneShot(findViewById(R.id.emiter_bottom), 4);
	}
}
