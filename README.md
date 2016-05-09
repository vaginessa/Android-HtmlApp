# Android-HtmlApp
## Ever wanted to make android applications? But you only know web development?
### This code is for you!

Features:
- Can load client and server side languages!
- Write your own error page!
- Go back using back buttom!
- Load links/websites in app, no boring browsers!
- Swipe down to reload! Google like swiper!

## How to use:
- Download Android Studio
- Make new project

### Copy codes:
### Enter app/ folder:

#### Edit your build.gradle:
- Find this piece of code and rewrite it

dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
	compile 'com.android.support:support-v4:21.0.+'
}
### Enter src/main/ folder:
- Replace "assets" folder to your project.
- Replace "res" folder to your project
- AndroidManifest.xml (copy-paste only uses-permission)

### Enter java/
- MainActivity.java (Below package text.)

## Editing code:
### Inside res folder:
- Inside "drawable" folder replace ic_launcher with your icon for app(same name).
- Inside "values" folder edit string.xml file, find "app_name" edit "Html Template" to name of your app.

### Inside assets folder:
- index.html is main page of app, you can add as much as html files you want. HTML, CSS, JS, PHP are tested and working languages.
- error.html is error page of app, it shows if error occurs. If you redirect to online website and user has no internet this will show.

## Finishing:
You probably edited and made html pages and styles, maybe functions too! It is finally time to compile app. Run the app. Using green arrow. Congratulations you made your first android app using web development.

## Any errors? Post issue reports here.
