package com.example.alex.myapplication.threads;

public abstract class ITask<Params, Progress, Result> {

    public abstract Result doInBackground(Params params, IProgressCallback<Progress> progressCallback);

}