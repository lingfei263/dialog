package cn.ffb.dialog.builder;

import android.content.Context;
import android.widget.EditText;

import cn.ffb.dialog.core.DialogBuilder;
import cn.ffb.dialog.core.DialogType;

/**
 * @author   lingfei  2017/6/4.
 */

public class EditTextDialogBuilder extends DialogBuilder<EditTextDialogBuilder> {
    private OnEditTextDialogListener onEditTextDialogListener;

    public interface OnEditTextDialogListener {
        void onEditTextCreated(EditText editText);

        /**
         * 点击确定按钮的时候回调方法，返回true不会关闭对话框，返回false会关闭对话框
         *
         * @param editText
         * @param text
         * @return
         */
        boolean onEditTextSelected(EditText editText, String text);
    }

    public EditTextDialogBuilder(Context context) {
        super(context, DialogType.DIALOG_EDIT_TEXT);
    }

    public OnEditTextDialogListener getOnEditTextDialogListener() {
        return onEditTextDialogListener;
    }

    public EditTextDialogBuilder setOnEditTextDialogListener(
            OnEditTextDialogListener onEditTextDialogListener) {
        this.onEditTextDialogListener = onEditTextDialogListener;
        return this;
    }
}
