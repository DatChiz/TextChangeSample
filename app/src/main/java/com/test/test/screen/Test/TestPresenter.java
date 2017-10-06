package com.test.test.screen.Test;

/**
 * Listens to user actions from the UI ({@link TestActivity}), retrieves the data and updates
 * the UI as required.
 */
final class TestPresenter implements TestContract.Presenter {
    private static final String TAG = TestPresenter.class.getName();

    private final TestContract.ViewModel mViewModel;

    public TestPresenter(TestContract.ViewModel viewModel) {
        mViewModel = viewModel;
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
    }
}
