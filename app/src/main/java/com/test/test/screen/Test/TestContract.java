package com.test.test.screen.Test;

import com.test.test.screen.BasePresenter;
import com.test.test.screen.BaseViewModel;

/**
 * This specifies the contract between the view and the presenter.
 */
interface TestContract {
    /**
     * View.
     */
    interface ViewModel extends BaseViewModel<Presenter> {
    }

    /**
     * Presenter.
     */
    interface Presenter extends BasePresenter {
    }
}
