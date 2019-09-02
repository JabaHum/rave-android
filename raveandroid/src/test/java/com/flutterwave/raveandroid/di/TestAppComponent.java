package com.flutterwave.raveandroid.di;

import com.flutterwave.raveandroid.account.AccountPresenter;
import com.flutterwave.raveandroid.account.AccountPresenterTest;
import com.flutterwave.raveandroid.card.CardPresenter;
import com.flutterwave.raveandroid.card.CardPresenterTest;
import com.flutterwave.raveandroid.di.components.AppComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {TestAndroidModule.class, TestNetworkModule.class})
public interface TestAppComponent extends AppComponent {

    void inject(CardPresenterTest cardPresenterTest);

    void inject(AccountPresenterTest accountPresenterTest);

    void inject(CardPresenter cardPresenter);

    void inject(AccountPresenter accountPresenter);

}
