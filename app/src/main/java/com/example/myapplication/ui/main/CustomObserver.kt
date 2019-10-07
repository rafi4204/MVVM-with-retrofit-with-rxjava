package com.example.myapplication.ui.main

import io.reactivex.observers.DisposableObserver

class CustomObserver<T:List<Employee>>:DisposableObserver<T>() {
    /**
     * Notifies the Observer that the [Observable] has finished sending push-based notifications.
     *
     *
     * The [Observable] will not call this method if it calls [.onError].
     */
    override fun onComplete() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Provides the Observer with a new item to observe.
     *
     *
     * The [Observable] may call this method 0 or more times.
     *
     *
     * The `Observable` will not call this method again after it calls either [.onComplete] or
     * [.onError].
     *
     * @param t
     * the item emitted by the Observable
     */
    override fun onNext(t: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Notifies the Observer that the [Observable] has experienced an error condition.
     *
     *
     * If the [Observable] calls this method, it will not thereafter call [.onNext] or
     * [.onComplete].
     *
     * @param e
     * the exception encountered by the Observable
     */
    override fun onError(e: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}