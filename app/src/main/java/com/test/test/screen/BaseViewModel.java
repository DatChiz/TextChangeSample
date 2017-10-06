package com.test.test.screen;

/**
 * Created by MyPC on 06/10/2017.
 */

public interface BaseViewModel<T> {
    void onStart();

    void onStop();

    void setPresenter(T presenter);
}
