package com.test.test;

import android.databinding.BindingAdapter;
import android.databinding.InverseBindingAdapter;
import android.databinding.InverseBindingListener;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/**
 * Created by MyPC on 06/10/2017.
 */

public class BindingUtils {
    @InverseBindingAdapter(attribute = "textChangeAM", event = "textAttrChangedAM")
    public static String captureTextValue(EditText view) {
        String text = view.getText().toString().replaceAll(",", "");
        double number = Double.parseDouble(text);
        String textFormat = String.format("%,.0f", number);
        return textFormat;
    }

    @BindingAdapter(value = { "textChangeAM", "textAttrChangedAM" }, requireAll = false)
    public static void setChange(final EditText view, final String text,
        final InverseBindingListener textAttrChanged) {
        view.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                textAttrChanged.onChange();
                view.setSelection(view.getText().length());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

}
