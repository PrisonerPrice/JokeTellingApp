package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.util.Log;
import android.util.Pair;

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

@RunWith(AndroidJUnit4ClassRunner.class)
public class AsyncTaskTest {

    private Context context;
    private EndpointsAsyncTask endpointsAsyncTask;

    @Before
    public void init() {
        context = InstrumentationRegistry.getInstrumentation().getContext();
    }

    @Test
    public void fetchJokeTest() throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        endpointsAsyncTask = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String result) {
                Assert.assertNotNull(result);
                if (result != null) {
                    Log.d("AsyncTask test, the joke is", result);
                    Assert.assertTrue(result.length() > 0);
                    latch.countDown();
                }
            }
        };
        endpointsAsyncTask.execute(context);
        latch.await();
    }
}
