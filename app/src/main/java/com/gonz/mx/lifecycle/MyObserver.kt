package com.gonz.mx.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyObserver(
    private val lifecycle: Lifecycle
) : LifecycleObserver {


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateObserver() {
        Log.v("GONZ_LIFECYCLE", "On create")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStartObserver() {
        Log.v("GONZ_LIFECYCLE", "On start")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResumeObserver() {
        Log.v("GONZ_LIFECYCLE", "On resume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPauseObserver() {
        Log.v("GONZ_LIFECYCLE", "On pause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStopObserver() {
        Log.v("GONZ_LIFECYCLE", "On stop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroyObserver() {
        Log.v("GONZ_LIFECYCLE", "On destroy")
    }
}