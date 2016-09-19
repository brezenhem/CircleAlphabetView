package lindenvalley.de.circlealphabetview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AlphabetView extends LinearLayout {
    private Context mContext;
    private LinearLayout mContainer;
    private OnCharClickListener mCharListener;

    private String[] mAlphabet =  {"", "A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "+", "M",
            "N", "O", "P", "Q", "R", "S", "T", "V", "X", "Y", "Z"};

    private static int SELECTED_CHAR_INDEX = 12;
    private static float DEFAULT_CHAR_ROTATE = 5f;
    private static float DEFAULT_CHAR_BEND = 2f;

    public AlphabetView(Context context) {
        super(context);
        this.mContext = context;
        initComponent();
    }

    public AlphabetView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        initComponent();
    }

    public AlphabetView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initComponent();
    }

    private void initComponent() {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.alphabet_view, this);

        mContainer = (LinearLayout) findViewById(R.id.container);
        setAlphabet();
        clearAllChars();
        setCharSelected(SELECTED_CHAR_INDEX);
    }

    public void setCharRotate(float rotate) {
        DEFAULT_CHAR_ROTATE = rotate;
        viewTransformation();
    }

    public void setCharBend(float bend) {
        DEFAULT_CHAR_BEND = bend;
        viewTransformation();
    }

    private void setAlphabet() {
        for (int i = 0; i < mAlphabet.length; i++) {
            if (!mAlphabet[i].equals("+")) {
                CharacterView view = new CharacterView(mContext);
                view.setChar(mAlphabet[i]);
                view.setId(i);
                view.setOnClickListener(mListener);
                mContainer.addView(view);
            } else {
                FilterView view = new FilterView(mContext);
                view.setId(i);
                view.setOnClickListener(mListener);
                mContainer.addView(view);
            }
        }
        viewTransformation();
    }

    private void viewTransformation() {
        int childCount = mContainer.getChildCount();
        int j = 1;
        for (int i = (childCount / 2) + 1; i < childCount; i++) {
            mContainer.getChildAt(i)
                    .setRotation(DEFAULT_CHAR_ROTATE);
            mContainer.getChildAt(i)
                    .setTranslationY((float) Math.pow(j, DEFAULT_CHAR_BEND));
            j++;
        }
        j = 1;
        for (int i =  (childCount / 2)  - 1; i >= 0; i--) {
            mContainer.getChildAt(i)
                    .setRotation((-1 * DEFAULT_CHAR_ROTATE));
            mContainer.getChildAt(i)
                    .setTranslationY((float) Math.pow(j, DEFAULT_CHAR_BEND));
            j++;
        }
    }

    public void setOnClickListener(OnCharClickListener listener) {
         mCharListener = listener;
    }

    private OnClickListener mListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            if (!mAlphabet[v.getId()].equals("+")) {
                if (mCharListener != null) {
                    mCharListener.onClick(v.getId(), mAlphabet[v.getId()]);
                    clearAllChars();
                    setCharSelected(v.getId());
                }
            } else {
                if (mCharListener != null) {
                    mCharListener.onFilterClick();
                    clearAllChars();
                }
            }
        }
    };

    private void clearAllChars() {
        for (int i = 0; i < mContainer.getChildCount(); i++) {
            try {
                CharacterView view = (CharacterView) mContainer.getChildAt(i);
                view.disableChar();
            }catch (Exception ignored) {}
        }
    }

    private void setCharSelected(int position) {
        try {
            CharacterView view = (CharacterView)mContainer.getChildAt(position); view.enableChar();
        }catch (Exception ignored) {}
    }

    public interface OnCharClickListener {
        void onClick(int index, String character);
        void onFilterClick();
    }
}
