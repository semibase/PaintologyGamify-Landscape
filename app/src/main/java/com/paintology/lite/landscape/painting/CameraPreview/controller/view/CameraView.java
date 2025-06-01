package com.paintology.lite.landscape.painting.CameraPreview.controller.view;

import android.app.Activity;
import android.view.View;

import com.paintology.lite.landscape.painting.CameraPreview.configuration.CameraConfiguration;
import com.paintology.lite.landscape.painting.CameraPreview.utils.Size;


/**
 * Created by Arpit Gandhi on 7/6/16.
 */
public interface CameraView {

    Activity getActivity();

    void updateCameraPreview(Size size, View cameraPreview);

    void updateUiForMediaAction(@CameraConfiguration.MediaAction int mediaAction);

    void updateCameraSwitcher(int numberOfCameras);

    void onPhotoTaken();

    void onVideoRecordStart(int width, int height);

    void onVideoRecordStop();

    void releaseCameraPreview();

}
