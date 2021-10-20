# cordova-plugin-androidapi30compatibility

Plugin for avoiding updating to `cordova@10` and `cordova-android@10` while still targeting Android API 30 and using `cordova@9` + `cordova-android@7`.

On Android:

- Sets the SystemWebView flag `setAllowFileAccess` to `true`, so that we are able to eg show photos from disk with `file://...` URLs https://github.com/apache/cordova-android/pull/1222
- Adds `IMAGE_CAPTURE` and `GET_CONTENT` actions, so that the camera works https://github.com/apache/cordova-plugin-camera/issues/673#issuecomment-875521098