package lindenvalley.de.circlealphabet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

import lindenvalley.de.circlealphabetview.AlphabetView;

public class ExampleActivity extends AppCompatActivity implements AlphabetView.OnCharClickListener {
    private SeekBar mRotateSeekBar;
    private SeekBar mBendSeekBar;

    private AlphabetView mAlphabetView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        mRotateSeekBar = (SeekBar) findViewById(R.id.rotateSeekBar);
        mBendSeekBar  = (SeekBar) findViewById(R.id.bendSeekBar);

        mRotateSeekBar.setOnSeekBarChangeListener(mRotateListener);
        mBendSeekBar.setOnSeekBarChangeListener(mRotateListener);

        mAlphabetView = (AlphabetView) findViewById(R.id.view);
        mAlphabetView.setOnClickListener(this);
    }

    private SeekBar.OnSeekBarChangeListener mRotateListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
           switch (seekBar.getId()) {
               case R.id.rotateSeekBar:
                   mAlphabetView.setCharRotate(i * 1f);
                   break;
               case R.id.bendSeekBar:
                   mAlphabetView.setCharBend(i / 6f);
                   break;
           }
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    @Override
    public void onClick(int index, String character) {

    }

    @Override
    public void onFilterClick() {

    }
}
