package lindenvalley.de.circlealphabetview;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CharacterView extends LinearLayout {
    private Context mContext;
    private TextView mChar;
    public CharacterView(Context context) {
        super(context);
        this.mContext = context;
        initComponent();
    }

    public CharacterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        initComponent();
    }

    public CharacterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initComponent();
    }

    public String getChar() {
        return mChar.getText().toString();
    }

    private void initComponent() {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.char_view, this);
        mChar = (TextView) findViewById(R.id.tv_char);
    }

    public void setChar(String character) {
        mChar.setText(String.valueOf(character));
    }

    public void enableChar() {
        mChar.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources()
                .getDimension(R.dimen.alphabet_selected_text));
        mChar.setTextColor(ContextCompat.getColor(mContext, R.color.CHAR_COLOR_SELECTED));
    }

    public void disableChar() {
        mChar.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources()
                .getDimension(R.dimen.alphabet_normal_text));
        mChar.setTextColor(ContextCompat.getColor(mContext, R.color.CHAR_COLOR_NORMAL));
    }
}


