# AndroidYoutubeInfo

### AndroidManifest
```
 <uses-permission android:name="android.permission.INTERNET"/>
```

## Download
### Build Gradle
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
```
dependencies {
	implementation 'com.github.uguraltinsoy:YouTubeInfo:0.1.0'
}
```
or Maven:
```
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```
```
<dependency>
	<groupId>com.github.uguraltinsoy</groupId>
	<artifactId>YouTubeInfo</artifactId>
	<version>0.1.0</version>
</dependency>
```

## Usage

### All Data
```Java
String[] all = YTInfo.get("https://www.youtube.com/watch?v=oLY1rss9Jx8").getAll();
String title = all[0];
String authorName = all[1];
String authorUrl = all[2];
String type = all[3];
String thumbnail = all[4];
```
### Get Title
```Java
String title = YTInfo.get("https://www.youtube.com/watch?v=oLY1rss9Jx8").getTitle();
```
### Get Author Name
```Java
String authorName = YTInfo.get("https://www.youtube.com/watch?v=oLY1rss9Jx8").getAuthorName();
```
### Get Author Url
```Java
String authorUrl = YTInfo.get("https://www.youtube.com/watch?v=oLY1rss9Jx8").getAuthorUrl();
```
### Get Type
```Java
String type = YTInfo.get("https://www.youtube.com/watch?v=oLY1rss9Jx8").getType();
```
### Get Thumbnail Url
```Java
String thumbnail = YTInfo.get("https://www.youtube.com/watch?v=oLY1rss9Jx8").getThumbnail();
```
### Developer By
```
Uğur Altınsoy
```

### Donate
```
BTC  : 1N7V3wX4xvGfwgBP1zQrcMSxohKKfiDxyH
ETH  : 0x0df6da87e219fb4854e933f1071ad91d17afa517
XRP  : rEb8TK3gBgk5auZkwc6sHnwrGVJH8DuaLh
DOGE : DKKmSHAa8GhAE5HNjmCXzkXPKTjpybY3mq
DENT : 0x0df6da87e219fb4854e933f1071ad91d17afa517
```

### Social
[![Twitter](https://img.shields.io/badge/twitter-%231DA1F2.svg?&style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/uguraltnsy)
[![Instagram](https://img.shields.io/badge/instagram-%23E4405F.svg?&style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/ugur.altnsy)
[![Linkedin](https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/uğur-altınsoy/)
[![Google Play](https://img.shields.io/badge/Google%20Play-414141?logo=google-play&logoColor=white&style=for-the-badge)](https://play.google.com/store/apps/developer?id=DeepLab&hl=tr)
