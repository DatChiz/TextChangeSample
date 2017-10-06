package com.test.test.screen.Test;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.test.test.BR;

/**
 * Exposes the data to be used in the Test screen.
 */

public class TestViewModel extends BaseObservable implements TestContract.ViewModel {

    private TestContract.Presenter mPresenter;
    private String mNumber = "1000";

    public TestViewModel() {
    }

    @Override
    public void onStart() {
        mPresenter.onStart();
    }

    @Override
    public void onStop() {
        mPresenter.onStop();
    }

    @Override
    public void setPresenter(TestContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Bindable
    public String getNumber() {
        return mNumber;
    }

    public void setNumber(String number) {
        mNumber = number;
        notifyPropertyChanged(BR.number);
    }

}
