package com.paintology.lite.landscape.painting.CameraPreview.configuration;

/**
 * Created by Arpit Gandhi on 7/6/16.
 */
public interface ConfigurationProvider {

    @CameraConfiguration.MediaAction
    int getMediaAction();

    @CameraConfiguration.MediaQuality
    int getMediaQuality();

    int getVideoDuration();

    long getVideoFileSize();

    @CameraConfiguration.SensorPosition
    int getSensorPosition();

    int getDegrees();

    int getMinimumVideoDuration();

    @CameraConfiguration.FlashMode
    int getFlashMode();

}
