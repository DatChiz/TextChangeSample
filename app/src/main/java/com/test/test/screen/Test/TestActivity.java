package com.test.test.screen.Test;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.test.test.R;
import com.test.test.databinding.ActivityTestBinding;

/**
 * Test Screen.
 */
public class TestActivity extends AppCompatActivity {

    private TestContract.ViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mViewModel = new TestViewModel();

        TestContract.Presenter presenter = new TestPresenter(mViewModel);
        mViewModel.setPresenter(presenter);

        ActivityTestBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_test);
        binding.setViewModel((TestViewModel) mViewModel);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mViewModel.onStart();
    }

    @Override
    protected void onStop() {
        mViewModel.onStop();
        super.onStop();
    }
}
